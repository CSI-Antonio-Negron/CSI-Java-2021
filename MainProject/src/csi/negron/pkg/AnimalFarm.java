package csi.negron.pkg;

public class AnimalFarm {

	// Field
	static Animal[] animals;
	
	

	// Main Method
	public static void main(String[] args) {
	
		animals = new Animal[5];

		animals[0]=new Animal("Coqui",3,"Eleutherodactylus coqui",new Taxonomy("Animal","Chordate","Anura"," Eleutherodactylidae","Common Coqui","Eleuths","Puerto Rican Coqui","Eukaryote"));
		animals[1]=new Animal("Canadian Goose",13,"Branta Canadensis",new Taxonomy("Animal","Chordate","Anseriformes","Anatidae","Giant","Brent Geese","Giant Canada Goose","Eukaryote"));
		animals[2]=new Animal("Domestic Pig",16,"Sus Scrofa Domesticus",new Taxonomy("Animal","Chordate","Artiodactyla","Suidae","S.domesticus","Sus","Eukaryote","Sus scrofa domesticus"));
		animals[3]=new Animal("Sheep",7,"Ovis",new Taxonomy("Animal","Chordate","Ovis","Bovidae","Dorper","Ovis","Stone Sheep","Eukaryote"));

		System.out.println(animals[0]);
		System.out.println();
		System.out.println(animals[1]);
		System.out.println();
		System.out.println(animals[2]);
		System.out.println();
		System.out.println(animals[3]);
		System.out.println(animals[4]);
		
		
		
	} 
}
