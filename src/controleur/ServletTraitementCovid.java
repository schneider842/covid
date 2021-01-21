package controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ModelTestpcr;
import model.TestPcr;



/**
 * Servlet implementation class ServletTraitementCovid
 */
@WebServlet("/AffichageTest")
public class ServletTraitementCovid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraitementCovid() {
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
		// TODO Auto-generated method stub
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		
		int jours = Integer.parseInt(request.getParameter("jours"));;
		int mois = Integer.parseInt(request.getParameter("mois"));
		int année = Integer.parseInt(request.getParameter("année"));
		int id_teste = Integer.parseInt(request.getParameter("id_teste"));
		String resultat = request.getParameter("resultat");
		
		TestPcr Testpcr= new TestPcr( jours, mois, année, id_teste, resultat);
		System.out.println(Testpcr.toString());		
		HttpSession session = request.getSession(true);
		session.setAttribute("Testpcr", Testpcr);
		
		
		ModelTestpcr.ajouterTestPcr(Testpcr);
		request.getRequestDispatcher("/GestionTestPcr.jsp").forward(request, response);
		out.close();
	}

}
