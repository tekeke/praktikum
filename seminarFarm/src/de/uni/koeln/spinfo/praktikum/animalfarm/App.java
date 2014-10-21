package de.uni.koeln.spinfo.praktikum.animalfarm;

public class App {

	public static void main(String[] args) {
		
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		
		horse1.name = "Lilly";
		horse1.age = 16;
		horse1.color ="no_info_avaiable";
		
		horse2.name = "Felix";
		horse2.age = 12;
		horse2.color = "grey";
		
		Pig pig = new Pig();
		pig.name = "Daniel";
	    pig.age = 4;
	    
	    pig.printAge();
	    
       //System.out.println(horse2.name + "'s color is" + horse2.color + ".");
		
	}

}
