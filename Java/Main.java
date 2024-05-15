package paradigme;

import java.sql.Date;
import java.util.ArrayList;


public class Main {

	@SuppressWarnings("unchecked")
	public static <Prs> void main(String[] args) {

		@SuppressWarnings("deprecation")
		Date date = new Date(110, 10, 10);
		ArrayList<Prs> listP = new ArrayList<Prs>();

		Membre membre1 = new Membre("Bento", "Damien", 1);
		Employe employe1 = new Employe("Labarche", "Nathan", 1);

		employe1.setPoste("Acceuil");
		employe1.setSalaire(1400);
		
		membre1.setDateAdhesion(date);
		membre1.setStatus("Gold");

		listP.add((Prs) employe1.afficherDetails());
		listP.add((Prs) membre1.afficherDetails());

		
	

	}

}
