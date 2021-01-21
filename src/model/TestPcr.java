package model;

import java.util.Date;

public class TestPcr {
	
	int id;
	int mois;
	Date date;
	int jours;
	
	public TestPcr() {
		super();
	}



	int année;
	int id_teste;
	String resultat;
	
	
	public TestPcr(int jours, int mois, int année, int id_teste, String resultat) {
		super();
		this.mois = mois;
		this.jours = jours;
		this.année = année;
		this.id_teste = id_teste;
		this.resultat = resultat;
		
	}


	
	
	@Override
	public String toString() {
		return "TestPcr [id=" + id + ", mois=" + mois  + ", jours=" + jours + ", année=" + année
				+ ", id_teste=" + id_teste + ", resultat=" + resultat + "]";
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getMois() {
		return mois;
	}


	public void setMois(int mois) {
		this.mois = mois;
	}


	public int getJours() {
		return jours;
	}


	public void setJours(int jours) {
		this.jours = jours;
	}


	public int getAnnée() {
		return année;
	}


	public void setAnnée(int année) {
		this.année = année;
	}


	public int getId_teste() {
		return id_teste;
	}


	public void setId_teste(int id_teste) {
		this.id_teste = id_teste;
	}


	public String getResultat() {
		return resultat;
	}


	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	public int Bissextile(int a){
		if ((a%4)==0)
		return 1;
		else return 0;
		}
	
	
	
	public int nbrejours(int Mois) 
		{
		
		switch (Mois) {
		case 1: return 31;
		case 3: return 31;
		case 5: return 31;
		case 7: return 31;
		case 8: return 31;
		case 10: return 31;
		case 12: return 31;
		case 4: return 30;
		case 6: return 31;
		case 9: return 30;
		case 11: return 30;	
		}
		if (Mois==2)
		{
		if (Bissextile(année)==1)
		return 29;		
		else return 28;
		}
		return 0;		
		}
		
		public int dateValide(){
		if (jours<=nbrejours(mois))
		return 1;
		return 0;
		}
	
	

		public void affiche(){
		if (dateValide()==1)
		System.out.println("la date est "+jours+mois+année);
		else System.out.println("La date n'est pas valide");
		}
}
		
		
	
	

