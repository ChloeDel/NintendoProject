package test;

import metier.Adresse;
import metier.Boutique;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse a1 = new Adresse (6,"Rue Mario", "Royaume champignon");
		Boutique b1 = new Boutique("Le paradis du jeu vidéo",a1);

	}

}
