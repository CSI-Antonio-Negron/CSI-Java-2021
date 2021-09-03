package csi.negron.pkg;

public class Animal {
	// Fields
	String name;
	int age;
	String scientificName;
	
    //  Constructors
	public Animal(String name,int age, String scientificname) {
		this.name = name;
		this.age = age;
	}
	public Animal() {}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

//  Main Method
	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("Coqui");
		a.setAge(3);
		a.setScientificName("Eleutherodactylus coqui");

		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge());
		System.out.println("Scientific Name: " + a.getScientificName());
		
		
		Animal a2 = new Animal("Domestic Pig", 16, "Sus scrofa domesticus");


		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge());
		System.out.println("Scientific Name: " + a.getScientificName());
		

	}

}
