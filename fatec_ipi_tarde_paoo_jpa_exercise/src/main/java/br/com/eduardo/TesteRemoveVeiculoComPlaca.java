package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Placa;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteRemoveVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = manager.find(Placa.class, 1L);
		manager.remove(p);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
