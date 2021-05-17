package com.ss.jb.four;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsgnmntTwoTest {

	@Test
	public void test() {
		Omelette o1 = new Omelette(true, true, 3, true);
		Omelette o2 = new Omelette(false, false, 4, true);
		Runnable t3 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (o1) {
						// Thread.sleep(100);
						synchronized (o2) {
							System.out.println(o2.toString());
							assertEquals(false, o2.getSalt());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable t4 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (o2) {
						Thread.sleep(100);
						synchronized (o1) {
							System.out.println(o1.toString());
							assertEquals(true, o1.getSalt());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(t3).start();
		new Thread(t4).start();
		
	}

}
