package metier;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected double prix;
	protected LocalDate dateDeSortie;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public LocalDate getDateDeSortie() {
		return dateDeSortie;
	}
	public void setDateDeSortie(LocalDate dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}
	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateDeSortie=" + dateDeSortie + "]";
	}
	public Console(String nom, double prix, LocalDate dateDeSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateDeSortie = dateDeSortie;
	}

	
	
	
}
