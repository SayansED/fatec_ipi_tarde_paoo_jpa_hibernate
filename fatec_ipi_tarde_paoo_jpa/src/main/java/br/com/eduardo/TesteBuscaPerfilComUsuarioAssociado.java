package br.com.eduardo;

import javax.persistence.EntityManager;

import br.com.eduardo.model.beans.Perfil;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteBuscaPerfilComUsuarioAssociado {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Perfil perfil = manager.find(Perfil.class, 1L);
		System.out.println(perfil.getUsuario().getNome());
		
		manager.close();
		JPAUtil.close();

	}

}
