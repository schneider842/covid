package controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;
import model.covid;

/**
 * Servlet implementation class ServletTraitementPCR
 */
@WebServlet("/ServletTraitementPCR")
public class ServletTraitementCas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraitementCas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		
		String Nom_complet = request.getParameter("Nom_complet");
		String telephone = request.getParameter("telephone");
		String adresse = request.getParameter("adresse");
		String code_postale = request.getParameter("code_postale");
		int etat = Integer.parseInt(request.getParameter("etat"));
		
		
		covid co= new covid(Nom_complet, telephone, adresse, code_postale, etat);
		System.out.println(co.toString());
		
		HttpSession session = request.getSession(true);				
		session.setAttribute("covid", co);
		if (co.validationAdresse(adresse) && co.validationcodepostale(code_postale) && co.validationNomComplet(Nom_complet)&& co.validationtel(telephone) && co.valideetat(etat))
		{
		Model.ajouterCovid(co);
		request.getRequestDispatcher("/Gestion.jsp").forward(request, response);
		out.close();
	}
		else 
			request.getRequestDispatcher("/Ajouterdescas.jsp").forward(request, response);
	}
}
