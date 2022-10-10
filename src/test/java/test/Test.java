package test;

import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse a1 = new Adresse (6,"Rue Mario", "Royaume champignon");
		Boutique b1 = new Boutique("Le paradis du jeu vidéo",a1);

		Console c1 = new Console("Nintendo Switch");
		Console c2= new Console("Nintendo Wii");
		Console c3 = new Console("Nintendo DS");

		Jeu j1 =new Jeu("Mario Kart",c1);
		Jeu j2 =new Jeu("Let's go Pikachu",c1);
		Jeu j3 =new Jeu("Metroid Dread",c1);
		Jeu j4 =new Jeu("Zelda",c2);
		Jeu j5 =new Jeu("Super Mario Bross",c3);
	
	}

}
