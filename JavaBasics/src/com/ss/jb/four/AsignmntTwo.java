package com.ss.jb.four;

/**
 * Create a deadlock between two threads Using the Integer Class (Maybe String for fun?)
 * 
 * @author Tony
 *
 */
public class AsignmntTwo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer five = 5; //Objects
		Integer ten = 10; //Objects
		
		System.out.println("Program Start");
		
		Runnable t1 = new Runnable() {
				
			@Override
			public void run() {
				try {
					synchronized(five) {
						//Thread.sleep(100);
						synchronized(ten) {
							System.out.println(ten);
						}
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized(ten) {
						Thread.sleep(100);
						synchronized(five) {
							System.out.println(five);
						}
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	
		Omelette o1 = new Omelette(true, true, 3, true);
		Omelette o2 = new Omelette(false, false, 4, true);
		
		Runnable t3 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized(o1) {
						//Thread.sleep(100);
						synchronized(o2) {
							System.out.println(o2.toString());
						}
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable t4 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized(o2) {
						Thread.sleep(100);
						synchronized(o1) {
							System.out.println(o1.toString());
						}
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	
		new Thread(t1).start();
		new Thread(t2).start();
		
		new Thread(t3).start();
		new Thread(t4).start();
		System.out.println("End of Program");
	}

}
