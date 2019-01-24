package fr.aberwag.zoo.animal.animalvolant;

import fr.aberwag.zoo.animal.animalsautant.AnimalQuiPeutSauter;

public class AnimalQuiPeutVoler extends AnimalQuiPeutSauter{

	protected int longueurAiles;
	
	public AnimalQuiPeutVoler() {
		super();
	}

	public AnimalQuiPeutVoler(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}
	
	public void voler() {
		System.out.println("Je vole.....");
	}

	/**
	 * @return the longueurAiles
	 */
	public int getLongueurAiles() {
		return longueurAiles;
	}

	/**
	 * @param longueurAiles the longueurAiles to set
	 */
	public void setLongueurAiles(int longueurAiles) {
		this.longueurAiles = longueurAiles;
	}

}
