package paradigme;

import java.sql.Date;
import java.util.ArrayList;

public class Membre extends Personne {

	public Date dateAdhesion;
	public String Status;
	ArrayList<Livre> emprunts = new ArrayList<Livre>();

	public Membre(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}


	public Date getDateAdhesion() {
		return dateAdhesion;
	}


	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String afficherDetails(String Info) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String afficherDetails() {
		System.out.println("Nom : " + nom + " Prenom : " + prenom + " id : " + id + " Date d Adhesion : " + dateAdhesion + " Status : " + Status);
		return null;
	}

}
