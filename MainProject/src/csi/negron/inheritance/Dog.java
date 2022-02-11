package csi.negron.inheritance;

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
		this.icon = new ImageIcon(getClass().getResource(directory));
	}

	public class Shit {
		boolean stink = true;
		int size;
		String consistency;
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
    	int decibals;
    	String pitch;
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
	
	void Die() {
		
	}
	
    Noise Bark() {
    	return new Noise();
    }
    
    void wagTail() {
    	
    }
    
    public void Mate (Dog D) {
    	
    }
	
	
	
}


