package ch03;

import java.util.ArrayList;

public class animalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal pAnimal = new Person();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		pAnimal.move();
		eAnimal.move();
		tAnimal.move();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		animalList.add(pAnimal);
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		
		for(Animal animal:animalList) {
			animal.move();
		}
	}

}