package centre.visite;

public class Medecin extends Adresse {

	private int matricule;
	private String nomMedecin;
	private String pnomMedecin;
	private String adresseMedecin;
	private String cpMedecin;
	private String villeMedecin;
	private String telMedecin;
	private String titreMedecin;
	private String specialite;
	
	public Medecin(int matricule, String nomMedecin, String pnomMedecin, String specialite) {
		super();
		this.matricule = matricule;
		this.nomMedecin = nomMedecin;
		this.pnomMedecin = pnomMedecin;
		this.specialite = specialite;
	}
	public Medecin() {
	super();	
	}
	
	public Medecin(int matricule, String nomMedecin, String pnomMedecin, String adresseMedecin, String cpMedecin,
			String villeMedecin, String telMedecin, String titreMedecin, String specialite) {
		super();
		this.matricule = matricule;
		this.nomMedecin = nomMedecin;
		this.pnomMedecin = pnomMedecin;
		this.adresseMedecin = adresseMedecin;
		this.cpMedecin = cpMedecin;
		this.villeMedecin = villeMedecin;
		this.telMedecin = telMedecin;
		this.titreMedecin = titreMedecin;
		this.specialite = specialite;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public String getPnomMedecin() {
		return pnomMedecin;
	}
	public void setPnomMedecin(String pnomMedecin) {
		this.pnomMedecin = pnomMedecin;
	}
	public String getAdresseMedecin() {
		return adresseMedecin;
	}
	public void setAdresseMedecin(String adresseMedecin) {
		this.adresseMedecin = adresseMedecin;
	}
	public String getCpMedecin() {
		return cpMedecin;
	}
	public void setCpMedecin(String cpMedecin) {
		this.cpMedecin = cpMedecin;
	}
	public String getVilleMedecin() {
		return villeMedecin;
	}
	public void setVilleMedecin(String villeMedecin) {
		this.villeMedecin = villeMedecin;
	}
	public String getTelMedecin() {
		return telMedecin;
	}
	public void setTelMedecin(String telMedecin) {
		this.telMedecin = telMedecin;
	}
	public String getTitreMedecin() {
		return titreMedecin;
	}
	public void setTitreMedecin(String titreMedecin) {
		this.titreMedecin = titreMedecin;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	
}
