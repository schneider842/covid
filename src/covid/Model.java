package covid;

import java.io.Serializable;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Model implements  Serializable {
	private static final long serialVersionUID = 1L;
	public static String nom= "Mathieu";
	public static ArrayList<covid> liste = versCollection();
	public static Connection conn = Connecteur.getConnection();
	
	public static ArrayList<covid> getListe() {
		return liste;
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
			PreparedStatement prst = conn.prepareStatement(
					"insert into covid(id_cas, nom_complet , telephone, adresse, code_postale, etat) value(?,?,?,?,?,?)");
			prst.setLong(1, co.getId_cas());
			prst.setString(2, co.getNom_complet());
			prst.setString(3, co.getTelephone());
			prst.setString(4, co.getAdresse());
			prst.setString(5, co.getCode_postale());
			prst.setInt(6, co.isEtat());
			prst.execute();
			liste = versCollection();
		} catch (SQLException excep) {
			excep.printStackTrace();
		}

	}

	//public static admin chercherUser(String login, String pwd) {
		//for (admin ad : liste) {
			//if (ad.validationLogin(login) && ad.validationMotdepasse(pwd))
				//return ad;
		//}
		//return null;
	//}
	
	public static ArrayList<covid> versCollection() {
		Connection conn = Connecteur.getConnection();
		Statement st;
		ResultSet rs;
		ArrayList<covid> listep = new ArrayList<covid>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select id_cas, nom_complet, telephone, adresse, code_postale, Etat from covid");
			if (rs != null) {
				while (rs.next()) {
					
					
					int id_cas=rs.getInt("Id_cas");
					String nom_complet=(rs.getString("nom_complet"));
					String telephone=(rs.getString("telephone"));
					String adresse=(rs.getString("adresse"));
					String code_postale=(rs.getString("code_postale"));
					int etat=(rs.getInt("Etat"));	
					
					covid co = new covid(id_cas, nom_complet, telephone, adresse, code_postale, etat);
					listep.add(co);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listep;
	}



	public static ArrayList<String> getListeGroupes(){
		ResultSet rs = null;
		Statement st=null;
		ArrayList<String> listeg = new ArrayList<String>();
		try {
			st = conn.createStatement();
			
			rs = st.executeQuery("select code_groupe from groupe");
			if (rs != null) {
				while (rs.next()) {
					listeg.add(rs.getString("code_groupe"));					
				}
			}
		}catch(SQLException e) {
			e.getMessage();
		}
		return listeg;

	}
	
}
