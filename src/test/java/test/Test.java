package test;

import java.time.LocalDate;


import metier.Jeu;
import metier.Portable;
import metier.Salon;
import metier.Achat;
import metier.Client;
import metier.Hybride;
import metier.Adresse;
import metier.Boutique;

public class Test {

	public static void main(String[] args) {

		
		Adresse a1 = new Adresse (6,"Rue Mario", "Royaume champignon");
		Boutique b1 = new Boutique("Le paradis du jeu vidéo",a1);

		Portable P = new Portable("Nintendo Switch",29.99,LocalDate.parse("2022-01-01"));
		Salon S = new Salon ("Nintendo Wii",29.99,LocalDate.parse("2022-01-01"));
		Hybride H = new Hybride("Nintendo DS",29.99,LocalDate.parse("2022-01-01"));

		Jeu j1 =new Jeu("Mario Kart",P,b1);
		Jeu j2 =new Jeu("Let's go Pikachu",P,b1);
		Jeu j3 =new Jeu("Metroid Dread",P,b1);
		Jeu j4 =new Jeu("Zelda",S,b1);
		Jeu j5 =new Jeu("Super Mario Bross",H,b1);
		
		Achat ac1 = new Achat(j2, LocalDate.parse("2022-10-01"), 49.99);
		Achat ac2 = new Achat(j4, LocalDate.parse("2022-09-25"), 51.99);
		
		Client p1 = new Client("Kollick", "Al",ac1);
		Client p2 = new Client("Plique", "Sarah",ac2);
	
	}

}
