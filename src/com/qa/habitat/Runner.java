package com.qa.habitat;

public class Runner {

	
	public static void main(String[] args) {
		
		Cave cave1 = new Cave();
		
		CaveMen person1 = new CaveMen("Torah", "Black", 6, true);
		CaveMen person2 = new CaveMen("Fiona", "Brown", 4, false);
		CaveMen person3 = new CaveMen("Diego", "Blonde", 9, true);
		CaveMen person4 = new CaveMen("Molly", "Blonde", 2, false);
		
		
		
		cave1.addToCave(person1);
		cave1.addToCave(person2);
		cave1.addToCave(person3);
		cave1.addToCave(person4);
		
		cave1.getAllNames();
		
//		cave1.removeAllFromCave();
		
		cave1.removePerson("Molly");
		
		cave1.makeSwingClubNoise("Diego");
		
		
	}
}
