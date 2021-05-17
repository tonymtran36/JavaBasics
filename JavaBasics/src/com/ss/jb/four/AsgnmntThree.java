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
	static List<Integer> productBuffer;
	public static int nProd = 0;
	public void produce() throws InterruptedException {
		
		synchronized (productBuffer) {
			if (productBuffer.size() > 3) { //Too many products, consumers need to take some
				Thread.sleep(100);
			}
		}
		System.out.println("The producer produced this: " + nProd);
		productBuffer.add(nProd++);
	}

	public void consume() throws InterruptedException {
		synchronized (productBuffer) {
			if (productBuffer.size() < 1) { // too full
				Thread.sleep(100);
			}
		}
		System.out.println("The consumer consumed this: " + productBuffer.get(0));
		productBuffer.remove(0);
	}
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		productBuffer = new ArrayList<Integer>();
		AsgnmntThree manager = new AsgnmntThree();

		Thread producer = new Thread(new Runnable() {
		//Runnable producer = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						manager.produce();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
		//Runnable consumer = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						manager.consume();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
		producer.start();
		consumer.start();
		
		//producer.join();
		//consumer.join();
	}

}
