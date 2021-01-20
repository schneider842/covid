package covid;

public class covid {

	public  int  id_cas;
	public String nom_complet;
	public String telephone;
	public String adresse;
	public String code_postale;
	public int etat;
	
	
	public covid(int id_cas,String nom_complet, String telephone, String adresse, String code_postale, int etat) {
		super();
		this.nom_complet = nom_complet;
		this.telephone = telephone;
		this.adresse = adresse;
		this.code_postale = code_postale;
		this.etat = etat;
		this.id_cas=id_cas;
		
	}

	public int getId_cas() {
		return id_cas;
	}


	public int setId_cas(int id_cas) {
		return id_cas;
	}


	public String getNom_complet()
	{	
		return nom_complet;
	}


	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}


	public String getTelephone() { 	
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getAdresse() {
		return adresse;	
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCode_postale() {
		return code_postale;
	}


	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}


	public int isEtat() {
		return etat;
	}


	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	
	public boolean validationNomComplet(String nomcomplet)
	{			
		return nomcomplet.contains(" ");
	}
	
	public boolean validationtel(String tel)
		{
		if (tel.contains("+") || tel.contains("00") && tel.length()>8 && !tel.contains(" "))
			return true;
			else {
		return false;}
		}
	
	public boolean validationAdresse(String adr)
	{
		return adr.length()>=8;
	}
		
	public boolean validationcodepostale(String cde)
	{
	Integer.parseInt(code_postale);
	
		if (cde.length()==4)
		{
			return true;
		}
		else
			return false;
		
	}

	public boolean valideetat(int et ) 
	{
		return et==1 || et==-1 ;
	}
	
	

	@Override
	public String toString() {
		return "covid [nom_complet=" + nom_complet + ", telephone=" + telephone + ", adresse=" + adresse
				+ ", code_postale=" + code_postale + ", etat=" + etat + "]";
	}
	
	
	
	
	}
	
	
	
	
	
	
