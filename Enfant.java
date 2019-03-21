package centre.visite;

import java.util.ArrayList;
import java.util.Iterator;

public class Enfant extends Adresse{

	private int numEnfant;
	private String nomEnfant;
	private String pnomEnfant;
	private String telEnfant;
	private float poidsNaissance;
	private int tailleNaissance;
	private int ageMarche;
	//Création d'un tableau de visite
	private ArrayList<Visite> mesVisites = new ArrayList<>();
	private Medecin monMedecin = new Medecin();
	
	//Constructeur
	public Enfant(int numEnfant, String nomEnfant, String pnomEnfant, String telEnfant, float poidsNaissance,
			int tailleNaissance) {
		super();
		this.numEnfant = numEnfant;
		this.nomEnfant = nomEnfant;
		this.pnomEnfant = pnomEnfant;
		this.telEnfant = telEnfant;
		this.poidsNaissance = poidsNaissance;
		this.tailleNaissance = tailleNaissance;
		
	}
	
	//Getters et setters
	public int getNumEnfant() {
		return numEnfant;
	}
	public void setNumEnfant(int numEnfant) {
		this.numEnfant = numEnfant;
	}
	public String getNomEnfant() {
		return nomEnfant;
	}
	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}
	public String getPnomEnfant() {
		return pnomEnfant;
	}
	public void setPnomEnfant(String pnomEnfant) {
		this.pnomEnfant = pnomEnfant;
	}
	public String getTelEnfant() {
		return telEnfant;
	}
	public void setTelEnfant(String telEnfant) {
		this.telEnfant = telEnfant;
	}
	public float getPoidsNaissance() {
		return poidsNaissance;
	}
	public void setPoidsNaissance(float poidsNaissance) {
		this.poidsNaissance = poidsNaissance;
	}
	public int getTailleNaissance() {
		return tailleNaissance;
	}
	public void setTailleNaissance(int tailleNaissance) {
		this.tailleNaissance = tailleNaissance;
	}
	public int getAgeMarche() {
		return ageMarche;
	}
	public void setAgeMarche(int ageMarche) {
		this.ageMarche = ageMarche;
	}
	public ArrayList<Visite> getMesVisites() {
		return mesVisites;
	}
	public void setMesVisites(ArrayList<Visite> mesVisites) {
		this.mesVisites = mesVisites;
	}
	
	//Méthode
	/**
	 * 
	 */
	public void ajoutVisite(Visite v) {
	
		if (!this.mesVisites.contains(v))
			this.mesVisites.add(v);
	}
	
	// Méthode 
	public void ajoutMedecin(Medecin m) {
		if (this.monMedecin==null)
		this.monMedecin = m;
	}
	
	// Contrsuction d'une chaîne de caractère contenant nom de l'enfant + num de l'enfant et le numéro de la visite
	public String toString() {
		
		String idVisite = "";
		Iterator<Visite> iter = this.getMesVisites().iterator();
		
		//Puisqu'un enfant a un tableau de visite auquel il est lié
		//Pour chaque enfant je fais un parcours de toutes ses visites pour récupérer son ID
		//Objectif final : afficher l'enfant avec la liste de ses visites
		
		//Tant qu'il a des nvx objets, 
		while (iter.hasNext()) {
			//je récupère l'objet courant
			Visite v = (Visite)iter.next();
			idVisite+=" "+ v.getNumVisite();
		}
		//J'affiche d'abord les infos basiques puis je récupère tout ce que j'ai fait dans visite
		return "l'enfant est : " +numEnfant+ "\n"
				+nomEnfant + "\n"+
		"Liste visite" + idVisite;
	}
}
