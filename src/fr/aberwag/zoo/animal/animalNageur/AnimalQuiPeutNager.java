package fr.aberwag.zoo.animal.animalNageur;

import fr.aberwag.zoo.animal.Animal;

public class AnimalQuiPeutNager extends Animal{

	public AnimalQuiPeutNager() {
		super();
	}

	public AnimalQuiPeutNager(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}
	public void nager() {
		System.out.println("Je sais nager");
	}

}
