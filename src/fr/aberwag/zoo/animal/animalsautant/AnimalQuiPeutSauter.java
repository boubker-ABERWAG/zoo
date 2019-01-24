package fr.aberwag.zoo.animal.animalsautant;

import fr.aberwag.zoo.animal.Animal;

public class AnimalQuiPeutSauter extends Animal {

	public AnimalQuiPeutSauter() {
		super();
	}

	public AnimalQuiPeutSauter(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}
	
	public void sauter() {
		System.out.println("Je peux sauter!!");
	}

}
