package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class validation {



	
	public static void main(String[] args) throws IOException {
		
		 admin user;
		 String login;
		 String password;		
		 int nbCas;
		 covid cas = null;
		 String line;
		 String [] mots;
		
			admin user1 = new admin(1,"admin","orsys" );
			ListCas Listing2 = new ListCas(5, new ArrayList<covid>());
	
		Scanner sc=new Scanner(System.in);
		System.out.println("veuillez entrer le login:");
		login = sc.next();
		System.out.println();
		System.out.println("Veuillez entrer le mot de passe");
		password = sc.next();
		
		
		user1.setLogin(login);
		user1.setPassword(password);
		if (!user1.validationMotdepasse(password)) {
			System.out.println("Wrong user");
			System.exit(0);
		}
		System.out.println("Nombre de cas à saisir:");
		nbCas = sc.nextInt();
		System.out.println();
		System.out.println("Nom_complet;Telephone;Adresse;Code Postale;Etat");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=0;i<nbCas;i++) {
			cas = new covid(1,"toto","+782789969","Leguevi", "31490", 0 );
			
		 line = br.readLine();
		 mots = line.split(";");
			cas.setNom_complet(mots[0]);
			cas.setTelephone(mots[1]);
			cas.setAdresse(mots[2]);
			cas.setCode_postale(mots[3]);
			cas.setEtat(Integer.parseInt( mots[4]));
			Listing2.ajouter(cas);
				
			}
		
		System.out.println("historique:");
		System.out.println(Listing2.toString()+"\n");
		}
	

		
		
		

	}


