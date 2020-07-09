package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Perfil;
import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteInsereUsuarioComPerfil {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		Perfil p = new Perfil();
		p.setDescricao("Perfil do José");
		manager.persist(p);
		Usuario u = new Usuario ();
		u.setNome("José");
		u.setFone("11223344");
		u.setEmail("jose@gmail.com");
		u.setPerfil(p);		
		manager.persist(u);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
