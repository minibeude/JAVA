package centre.visite;

import java.util.Date;

public class Visite {

	private int numVisite;
	private Date dateVisite;
	private float tailleVisite;
	private float poidsVisite;
	private boolean statut;
	private Medecin monMedecin;
	private Centre monCentre;
	
	//Constructeur	
	public Visite(int numVisite, Date dateVisite, float tailleVisite, float poidsVisite, boolean statut,
			Medecin monMedecin, Centre monCentre) throws TailleIncorrecteException
	{	super();
	
	if (tailleVisite<40f) 
		throw new TailleIncorrecteException();
	else
	{
		this.numVisite = numVisite;
		this.dateVisite = dateVisite;
		this.tailleVisite = tailleVisite;
		this.poidsVisite = poidsVisite;
		this.statut = statut;
		this.monMedecin = monMedecin;
		this.monCentre = monCentre;
	}
	}

	// Constructeur simplifié
	public Visite(int numVisite, Date dateVisite, float tailleVisite, float poidsVisite, boolean statut)
			throws TailleIncorrecteException
	{	super();
	
			if (tailleVisite<40f) 
				throw new TailleIncorrecteException();
			else
			{
				this.numVisite = numVisite;
				this.dateVisite = dateVisite;
				this.tailleVisite = tailleVisite;
				this.poidsVisite = poidsVisite;
				this.statut = statut;
				
			}
		
	}

	public Visite() {
		super();
	}
	
	//Getters et setters car variables private
	
	public int getNumVisite() {
		return numVisite;
	}

	public void setNumVisite(int numVisite) {
		this.numVisite = numVisite;
	}

	public Date getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	public float getTailleVisite() {
		return tailleVisite;
	}

	public void setTailleVisite(float tailleVisite) {
		this.tailleVisite = tailleVisite;
	}

	public float getPoidsVisite() {
		return poidsVisite;
	}

	public void setPoidsVisite(float poidsVisite) {
		this.poidsVisite = poidsVisite;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Medecin getMonMedecin() {
		return monMedecin;
	}

	public void setMonMedecin(Medecin monMedecin) {
		this.monMedecin = monMedecin;
	}

	public Centre getMonCentre() {
		return monCentre;
	}

	public void setMonCentre(Centre monCentre) {
		this.monCentre = monCentre;
	}
	
	//Constructeur pour afficher chaque élément
	public String toString() {
		return "id Visite est :" +String.valueOf(this.getNumVisite());
	}
	
}
