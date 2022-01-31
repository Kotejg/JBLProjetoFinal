package br.com;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.entidades.Container;
import br.com.entidades.User;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/ServletUser")
public class ServletUser extends HttpServlet {
 private static User user = new User();
 private static Container cont = new Container();
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath()); 
		String id = request.getParameter("id");
		String alterar = request.getParameter("alterar");
		if(id != null) {
			if(alterar.equals("0")) {
				deletar(request, response);
			}else if(alterar.equals("1")) {
				alterar(request, response);
			}
		}		
		request.setAttribute("usuarios", cont.listarLista());
		request.getRequestDispatcher("/").forward(request, response);
			
		
		
	}				
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		if((request.getParameter("nome") != null) && (request.getParameter("email") != null) && (request.getParameter("pais") != null) && (request.getParameter("telefone") != null)) {
			// criando as variaveis para pega os valores do front	 
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String telefone = request.getParameter("telefone");
			String pais = request.getParameter("pais"); 
			
			
			
		 	//cria o usuario e cadastra na lista
			 user = new User(0,nome, email, pais, telefone); // instacia usuario
			 cont = new Container(user);
			 
			
			 for(User usuarios : cont.listarLista()) {
				 request.getServletContext().setAttribute("id", usuarios.getId());
				 request.getServletContext().setAttribute("nome", usuarios.getNome());
				 request.getServletContext().setAttribute("email", usuarios.getEmail());
				 request.getServletContext().setAttribute("telefone", usuarios.getTelefone());
				 request.getServletContext().setAttribute("pais", usuarios.getPais());				 
			 }  
				request.getServletContext().setAttribute("user", cont.listarLista());
				
				 
				
		request.getRequestDispatcher("/").forward(request, response);  // rediciona para ele mesmo 
		
	}

	}
	protected void alterar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		 cont.alterarUser(Integer.parseInt(id) , request.getParameter("nome"),request.getParameter("email"), request.getParameter("telefone"),request.getParameter("pais"));
		 User user = cont.consultar(Integer.parseInt(id));
		request.setAttribute("id", user.getId());
		request.setAttribute("nome", user.getNome());
		request.setAttribute("email", user.getEmail());
		request.setAttribute("telefone", user.getTelefone());
		request.setAttribute("pais", user.getPais());
		request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
	}
	
	protected void deletar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		cont.removerUser(Integer.parseInt(id)-1);
		
	}
	
	
	
	

	
	}
