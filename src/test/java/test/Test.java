package test;

import java.time.LocalDate;

import metier.Console;
import metier.Jeu;
import metier.Achat;
import metier.Client;
import metier.Adresse;
import metier.Boutique;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse a1 = new Adresse (6,"Rue Mario", "Royaume champignon");
		Boutique b1 = new Boutique("Le paradis du jeu vidéo",a1);

		Console c1 = new Console("Nintendo Switch",29.99,LocalDate.parse("2022-01-01"));
		Console c2 = new Console("Nintendo Wii",29.99,LocalDate.parse("2022-01-01"));
		Console c3 = new Console("Nintendo DS",29.99,LocalDate.parse("2022-01-01"));

		Jeu j1 =new Jeu("Mario Kart",c1,b1);
		Jeu j2 =new Jeu("Let's go Pikachu",c1,b1);
		Jeu j3 =new Jeu("Metroid Dread",c1,b1);
		Jeu j4 =new Jeu("Zelda",c2,b1);
		Jeu j5 =new Jeu("Super Mario Bross",c3,b1);
		
		Achat ac1 = new Achat(j2, LocalDate.parse("2022-10-01"), 49.99);
		Achat ac2 = new Achat(j4, LocalDate.parse("2022-09-25"), 51.99);
		
		Client p1 = new Client("Kollick", "Al",a1);
		Client p2 = new Client("Plique", "Sarah",a2);
	
	}

}
