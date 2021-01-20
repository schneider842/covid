package covid;

import java.util.ArrayList;



public class ListCas {
	
			 int size=5;
			private  ArrayList<covid> Listing = new ArrayList<covid>();
	
	
	public ListCas(int size, ArrayList<covid> listing) {
				super();
				this.size = size;
				Listing = listing;
			}

	public void ajouter(covid cas) 
	{					
			Listing.add(cas);					
	}
	
	@Override
	public String toString() {
		String r="";
		for (int i=0; i<Listing.size();i++) {
		r+= "Element "+i+": "+Listing.get(i)+"\n";
	}
		return r;
	}
	

	public void afficher()
	{
		System.out.println(Listing.toString());
	}
	
	
}
