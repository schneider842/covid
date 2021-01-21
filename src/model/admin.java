package model;

public class admin {

	public int id_admin;
	public String login;
	public String password;
	
	
	
	public admin(String login, String password) {
		super();		
		this.login = login;
		this.password = password;
	}
	
	
	public boolean validationLogin(String ad)
	{
		return ad.equals("admin");
		
		
	}
	
	public boolean validationMotdepasse(String pass)
	{
		return pass.contains("orsys");
	}


	//public int getId_admin() {
	//	return id_admin;
	//}


	//public void setId_admin(int id_admin) {
	//	this.id_admin = id_admin;
	//}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	}
	
	

