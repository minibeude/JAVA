/**
 * 
 */
package centre.visite;

/**
 * @author asus
 *
 */
public class Centre extends Adresse {

	private int idCentre;
	private String nomCentre;
	private String adresseCentre;
	private String cpCentre;
	private String villeCentre;
	private String numTel;
	
	
	public Centre(int idCentre, String nomCentre, String adresseCentre, String cpCentre, String villeCentre,
			String numTel) {
		super();
		this.idCentre = idCentre;
		this.nomCentre = nomCentre;
		this.adresseCentre = adresseCentre;
		this.cpCentre = cpCentre;
		this.villeCentre = villeCentre;
		this.numTel = numTel;
	}
	
	
	public Centre(int idCentre, String nomCentre) {
		super();
		this.idCentre = idCentre;
		this.nomCentre = nomCentre;
	}
	
	
	public int getIdCentre() {
		return idCentre;
	}
	public void setIdCentre(int idCentre) {
		this.idCentre = idCentre;
	}
	public String getNomCentre() {
		return nomCentre;
	}
	public void setNomCentre(String nomCentre) {
		this.nomCentre = nomCentre;
	}
	public String getAdresseCentre() {
		return adresseCentre;
	}
	public void setAdresseCentre(String adresseCentre) {
		this.adresseCentre = adresseCentre;
	}
	public String getCpCentre() {
		return cpCentre;
	}
	public void setCpCentre(String cpCentre) {
		this.cpCentre = cpCentre;
	}
	public String getVilleCentre() {
		return villeCentre;
	}
	public void setVilleCentre(String villeCentre) {
		this.villeCentre = villeCentre;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	
	
}
