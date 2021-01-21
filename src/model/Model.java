package model;

import java.io.Serializable;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.Connecteur;



public class Model implements  Serializable {
	private static final long serialVersionUID = 1L;
	public static String nom= "Mathieu";
	public static ArrayList<covid> liste = versCollection();
	public static ArrayList<admin> listeadmin = versCollection1();
	public static Connection conn = Connecteur.getConnection();
	
	public static ArrayList<covid> getListe() {
		return liste;
	}
	
	public static ArrayList<admin> versCollection1() {
		Connection conn = Connecteur.getConnection();
		Statement st;
		ResultSet rs;
		ArrayList<admin> listep = new ArrayList<admin>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select login, password from admin");
			if (rs != null) {
				while (rs.next()) {					
					String login=(rs.getString("login"));
					String password=(rs.getString("password"));				
					admin ad = new admin(login, password);
					listep.add(ad);
					System.out.println("je passe par ici");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listep;
	}

	public static ArrayList<admin> getlisteadmin() {
		return listeadmin;
	}

	public static void setListe(ArrayList<covid> liste) {
		Model.liste = liste;
	}
	
	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		Model.conn = conn;
	}

	public static void ajouterCovid(covid co) {
		try {			
			Statement st = conn.createStatement();
			PreparedStatement prst = conn.prepareStatement("insert into covid( nom_complet , telephone, adresse, code_postale, etat) value(?,?,?,?,?)");
			//prst.setLong(1, co.getId_cas());
			prst.setString(1, co.getNom_complet());
			prst.setString(2, co.getTelephone());
			prst.setString(3, co.getAdresse());
			prst.setString(4, co.getCode_postale());
			prst.setInt(5, co.isEtat());
			prst.execute();
			liste = versCollection();
		}
			
			catch (SQLException excep) {
			excep.printStackTrace();
		}

	}

	public static admin chercherUser(String login, String pwd) {
		for (admin p : listeadmin) {
			if (p.getLogin().equals(login) && p.getPassword().equals(pwd))
				return p;
		}
		return null;
	}
	
	

	public static ArrayList<covid> versCollection() {
		Connection conn = Connecteur.getConnection();
		Statement st;
		ResultSet rs;
		ArrayList<covid> listep = new ArrayList<covid>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select  nom_complet, telephone, adresse, code_postale, Etat from covid");
			if (rs != null) {
				while (rs.next()) {
					
					
					//int id_cas=rs.getInt("Id_cas");
					String nom_complet=(rs.getString("nom_complet"));
					String telephone=(rs.getString("telephone"));
					String adresse=(rs.getString("adresse"));
					String code_postale=(rs.getString("code_postale"));
					int etat=(rs.getInt("Etat"));	
					
					covid co = new covid( nom_complet, telephone, adresse, code_postale, etat);
					listep.add(co);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listep;
	}



	
	
}
