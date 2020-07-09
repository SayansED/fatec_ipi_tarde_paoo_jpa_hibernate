package br.com.eduardo;

import javax.persistence.EntityManager;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteBuscaUsuarioComPerfil {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}

}
