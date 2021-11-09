package venturaHRcadastro.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venturaHRcadastro.model.domain.Candidato;
import venturaHRcadastro.model.domain.Empresa;
import venturaHRcadastro.model.repository.UsuarioRepository;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		
		String tipoConta = request.getParameter("tipoConta");
		
		if (tipoConta.equalsIgnoreCase("c")) {
			Candidato candidato = new Candidato(request.getParameter("nome"),request.getParameter("endereco"),request.getParameter("fone"),request.getParameter("email"),request.getParameter("senha"),request.getParameter("senhaConfirmada"),request.getParameter("tipoConta")
					,request.getParameter("cpf"));
			
			usuarioRepository.incluir(candidato);
			
			request.setAttribute("nome", candidato.getNome());
		}else {
			Empresa empresa = new Empresa(request.getParameter("nome"),request.getParameter("endereco"),request.getParameter("fone"),request.getParameter("email"),request.getParameter("senha"),request.getParameter("senhaConfirmada"),request.getParameter("tipoConta")
					,request.getParameter("razao"),request.getParameter("cnpj"));
			
			usuarioRepository.incluir(empresa);
			
			request.setAttribute("nome", empresa.getNome());
		}
		
		request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
		
	}

}
