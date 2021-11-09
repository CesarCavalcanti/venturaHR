package venturaHRcadastro.model.repository;

import java.util.ArrayList;
import java.util.List;

import venturaHRcadastro.model.domain.Usuario;

public class UsuarioRepository {
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void incluir (Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Usuario> obterLista (){
		return usuarios;
	}

}
