package csi.negron.sim;

import javax.swing.ImageIcon;

public class Dog {

	String hair;
	int size;
	boolean wild = true;
	boolean gender = true;
	ImageIcon icon;
	
	
	
	Dog (){}
	public Dog(String hair, int size, boolean wild, boolean gender, String directory ) {
		super();
		this.hair = hair;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(new ImageIcon(getClass().getResource(directory)).getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH));
	}

	public class Shit {
		boolean stink = true;
		int size;
		String consistency;
		
		public Shit(boolean stink, int size, String consistency) {
			super();
			this.stink = stink;
			this.size = size;
			this.consistency = consistency;
		}
	}
	
	
	public class Food {
		boolean wet = false; 
		String tasty;
		int bowlSize;
		public Shit digest() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
    public class Noise{
    	int decibels;
    	boolean pitch;
    	
    	public Noise(int decibels, boolean pitch) {
			super();
			this.decibels = decibels;
			this.pitch = pitch;
		}
	}
    
    
	void piss() {
    	if (gender = true) {
    		System.out.println("Raise Leg");
    	}
    	System.out.println("Tsssss");
	}
	
	Shit eat(Food f) {
		return f.digest();
	}
	
	void die() {
		
	}
	
	void grow() {
		
	}
	
    Noise bark() {
    	return new Noise();
    }
    
    void wagTail() {
    	
    }
    
    public void Mate (Dog D) {
    	
    }
	
	
	
}


