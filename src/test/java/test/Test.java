package test;

import metier.Console;
import metier.Jeu;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
