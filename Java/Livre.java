package paradigme;

public class Livre implements Empruntable {

	protected String titre;
	protected String auteur;
	protected String isbn;
	protected boolean disponible;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String afficherDetails(String Info) {
		Info = "Titre : " + titre + " Auteur : " + " isbn : " + " Disponible : " + disponible;
		System.out.println(Info);
		return Info;

	}

	@Override
	public void emprunter() {

	}

	@Override
	public void retourner() {

	}

}
