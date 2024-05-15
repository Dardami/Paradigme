package paradigme;

public class Employe extends Personne {

	private String poste;
	private double salaire;

	public Employe(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	
	public String afficherDetails(String Info) {
		Info = "Nom : " + nom + " Prenom : " + prenom + " id : " + id;
		System.out.println(Info);
		return Info;
	}

	@Override
	public String afficherDetails() {
		System.out.println("Nom : " + nom + " Prenom : " + prenom + " id : " + id + " Poste : " + poste + " salaire : " + salaire);
		return null;
	}



}
