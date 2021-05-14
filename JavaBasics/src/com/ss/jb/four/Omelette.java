/**
 * 
 */
package com.ss.jb.four;

/**
 * @author Tony
 *
 */
public class Omelette {

	private boolean salt;
	private boolean pepper;
	private int eggs;
	private boolean sauce;

	public Omelette(boolean salt, boolean pepper, int eggs, boolean sauce) {
		super();
		this.salt = salt;
		this.pepper = pepper;
		this.eggs = eggs;
		this.sauce = sauce;
	}

	public boolean getSalt() {
		return salt;
	}

	public void setSalt(boolean salt) {
		this.salt = salt;
	}

	public boolean getPepper() {
		return pepper;
	}

	public void setPepper(boolean pepper) {
		this.pepper = pepper;
	}

	public int getEggs() {
		return eggs;
	}

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public boolean isSauce() {
		return sauce;
	}

	public void setSauce(boolean sauce) {
		this.sauce = sauce;
	}

	@Override
	public String toString() {
		return "Omelette [salt=" + salt + ", pepper=" + pepper + ", eggs=" + eggs + ", sauce=" + sauce + "]";
	}
	
	
}
