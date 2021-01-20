package covid;

import java.io.Serializable;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ModelTestpcr implements  Serializable {
	private static final long serialVersionUID = 1L;
	public static String nom= "Mathieu";
	public static ArrayList<TestPcr> liste = versCollection();
	public static Connection conn = Connecteur.getConnection();
	
	public static ArrayList<TestPcr> getListe() {
		return liste;
	}

	public static void setListe(ArrayList<TestPcr> liste) {
		ModelTestpcr.liste = liste;
	}
	
	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		ModelTestpcr.conn = conn;
	}

	public static void ajouterTestPcr(TestPcr Tpcr) {
		try {
			Statement st = conn.createStatement();
			PreparedStatement prst = conn.prepareStatement("INSERT INTO `testpcr`(`jours`, `mois`, `année`, `id_teste`, `resultat`) VALUES('"+Tpcr.getJours()+"','"+Tpcr.getMois()+"','"+Tpcr.getAnnée()+"','"+Tpcr.getId_teste()+"','"+Tpcr.getResultat()+"')");
			
//			prst.setInt(1, Tpcr.getJours());
//			prst.setInt(2, Tpcr.getMois());
//			prst.setInt(3, Tpcr.getAnnée());
//			prst.setInt(4, Tpcr.getId_teste());
//			prst.setString(5, Tpcr.getResultat());
			prst.execute();
			System.out.println("ajouter avec succes");
			liste = versCollection();
		} catch (SQLException excep) {
			excep.printStackTrace();
		}

	}


	
	public static ArrayList<TestPcr> versCollection() {
		Connection conn = Connecteur.getConnection();
		Statement st;
		ResultSet rs;
		ArrayList<TestPcr> listep = new ArrayList<TestPcr>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select* from testpcr");
			if (rs != null) {
				while (rs.next()) {
					
					
					//int id=rs.getInt("id");
					int jours=(rs.getInt("jours"));
					int mois=(rs.getInt("mois"));
					int année=(rs.getInt("année"));
					int id_teste=(rs.getInt("id_teste"));
					String resultat=(rs.getString("resultat"));	
					
					TestPcr Testpcr= new TestPcr(jours,  mois,  année,  id_teste,  resultat);
					
					listep.add(Testpcr);
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
