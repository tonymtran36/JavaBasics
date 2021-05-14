/**
 * 
 */
package com.ss.jb.four;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a program where a producer and consumer use the same bounded buffer array
 * 
 * @author Tony
 *
 */
public class AsgnmntThree {
	List<Integer> productBuffer;
	public void produce(List<Integer> productBuffer) throws InterruptedException {
		int nProd = 0;
		while (true) {
			synchronized (productBuffer) {
				while (productBuffer.size() > 4) { // producers wait for consumers
					productBuffer.wait();
				}
				System.out.println("The producer produced this: " + nProd);
				productBuffer.add((nProd++));
				
				productBuffer.notify();
				Thread.sleep(100);
			}
		}
	}

	public void consume(List<Integer> products) throws InterruptedException {
		while (true) {
			synchronized (products) {
				while (products.size() < 1) { // consumers should wait for producers
					productBuffer.wait();
				}
				System.out.println("The consumer consumed this: " + products.get(0));
				products.remove(0);
				
				productBuffer.notify();
				Thread.sleep(100);
			}
		}
	}
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		List<Integer> productBuffer = new ArrayList<Integer>();
		AsgnmntThree manager = new AsgnmntThree();
		
//		for(int i = 0; i<4;i++) { //populate the buffer
//			productBuffer.add(i);
//		}
		//Thread producer = new Thread(new Runnable() {
		Runnable producer = new Runnable() {
			@Override
			public void run() {
				try {
					manager.produce(productBuffer);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		//Thread consumer = new Thread(new Runnable() {
		Runnable consumer = new Runnable() {
			@Override
			public void run() {
				try {
					manager.consume(productBuffer);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}; 
		
		producer.run();
		consumer.run();
		//producer.start();
		//consumer.start();
		
		//producer.join();
		//consumer.join();
//		new Thread(producer).start();
//		new Thread(consumer).start();
	}

}
