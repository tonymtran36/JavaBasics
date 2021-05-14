package com.ss.jb.four;

/**
 * Create a Single with double checked locking
 * 
 * @author Tony
 *
 */
public class AsgnmntOne {

	volatile public static AsgnmntOne instance = null;
	
	private AsgnmntOne() {
		
	}
	
	public static AsgnmntOne getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new AsgnmntOne();
				}
			}
		}
		return instance;
	}

}
