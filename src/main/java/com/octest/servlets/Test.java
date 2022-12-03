package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.beans.Auteur;
import com.octest.forms.ConnectionForm;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Auteur auteur = new Auteur();
		auteur.setPrenom("Bill");
		auteur.setNom("Gates");
		
		request.setAttribute("auteur", auteur);
		
		response.getWriter().append("Served at:").append(request.getContextPath());
		//this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Recuperation des informations saisies dans le formulaire
		ConnectionForm form = new ConnectionForm();
		
		form.verifierIdentifiant(request);
		
		request.setAttribute("form", form);
		
		request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

}
