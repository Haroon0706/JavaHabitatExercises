package com.qa.habitat;

import java.util.ArrayList;

public class Cave {
	
	ArrayList<CaveMen> listCaveMen = new ArrayList<>();
	
	public void addToCave(CaveMen person) {
		
		listCaveMen.add(person);
		System.out.println(person.getName() + " has moved into the cave");
	}

	
	public void removeAllFromCave() {
		
		listCaveMen.clear();
		
	}
	
	public void getAllNames() {
		
		for(CaveMen person: listCaveMen) {
			
			System.out.println(person.getName());
		}
		
	}
	
	public void makeSwingClubNoise(String name) {
		
		for(CaveMen person : listCaveMen) {
			
			if (person.getName() == name) {
				person.swingClubNoise();
			}
		}
		
	}
	
	public void removePerson(String name) {
		int i = 0;
		for(CaveMen person : listCaveMen) {
			if (person.getName() == name) break;
			i++;
		}
		
		System.out.println(listCaveMen.get(i).getName() + " was kicked out of the cave");
		listCaveMen.remove(i);
		
		getAllNames();
		
	}
	
}
