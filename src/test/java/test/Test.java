package test;

import java.time.LocalDate;

import metier.Achat;
import metier.Client;
import metier.Console;
import metier.Jeu;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1 = new Console("Nintendo Switch");
		Console c2 = new Console("Nintendo Wii");
		Console c3 = new Console("Nintendo DS");

		Jeu j1 =new Jeu("Mario Kart",c1);
		Jeu j2 =new Jeu("Let's go Pikachu",c1);
		Jeu j3 =new Jeu("Metroid Dread",c1);
		Jeu j4 =new Jeu("Zelda",c2);
		Jeu j5 =new Jeu("Super Mario Bross",c3);
		
		Achat a1 = new Achat(j2, LocalDate.parse("2022-10-01"), 49.99);
		Achat a2 = new Achat(j4, LocalDate.parse("2022-09-25"), 51.99);
		
		Client p1 = new Client("Kollick", "Al",a1);
		Client p2 = new Client("Plique", "Sarah",a2);
	
	}

}
