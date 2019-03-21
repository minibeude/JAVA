package centre.visite;

import java.util.ArrayList;
import java.util.Date;

public class TestCentreSuivi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Création de centres
		
		Centre c1 = new Centre(1, "Centre de soin");
		Centre c2 = new Centre(2, "Clinique du bon secours");
		Centre c3 = new Centre(3, "Hôpital des enfants");
		
		System.out.println(c1.getIdCentre()+ " " +c1.getNomCentre());
		
		//Création de médecins
		
		Medecin m1 = new Medecin(1, "MOREDE", "ANTHELME", "Neurologue");
		Medecin m2 = new Medecin(2, "MOCINI", "ROY", "Endocrinologue");
		Medecin m3 = new Medecin(3, "DUASSO", "CAROLINE", "Biologiste médicale");
		
		System.out.println(m1.getMatricule()+ " "+ m1.getNomMedecin()+ " "+ m1.getPnomMedecin()+ " "+ m1.getSpecialite());
		
		//Création de visites
		Visite v1 = null;
		Visite v2 = null;
		Visite v3 = null;
		Visite v4 = null;
		try {
		v1 = new Visite(602946312, new Date(), 108f, 11.8f, true);
		v2 = new Visite(984416737, new Date(), 49f, 3.6f, true);
		v3 = new Visite(279338491, new Date(), 104f, 11.7f, false);
		v4 = new Visite(456292482, new Date(), 89f, 8.9f, true);
		System.out.println(v1.getNumVisite()+" "+v1.getDateVisite()+" "+v1.getTailleVisite()+" "+v1.getPoidsVisite()+" " +v1.isStatut());
		} catch(TailleIncorrecteException e) {}
		
		finally {
			if (v1 == null || v2 == null || v3 == null || v4== null) {
				v1 = new Visite();
				v2 = new Visite();
				v3 = new Visite();
				v4 = new Visite();
			}	
		}
		//Création d'enfants
		
		Enfant enf1 = new Enfant(101, "Bouleau", "Jeanne", "0556509023", 3.5f, 51);
		Enfant enf2 = new Enfant(102, "Notrais", "Victor", "0556132240", 4.4f, 48);
		
		//Création d'une première liste de ArrayList
		ArrayList<Visite> liste1 = new ArrayList<>();
		liste1.add(v1);
		liste1.add(v2);
		//Création d'une deuxième liste
		ArrayList<Visite> liste2 = new ArrayList<>();
		liste2.add(v3);
		liste2.add(v4);
		
		//On veut ajouter à enfant 1 la liste 1
		enf1.setMesVisites(liste1);
		System.out.println(enf1.toString());
		//Idem pour enfant 2
		enf2.setMesVisites(liste2);
		
		//Affectation d'un médecin à un enfant
	System.out.println("Médecin n°"+ m1.getMatricule()+" affecté à cet enfant n° "+enf1.getNumEnfant());
		
	}

}
