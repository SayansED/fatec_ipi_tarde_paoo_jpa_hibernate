package br.com.eduardo;

import javax.persistence.EntityManager;

import br.com.eduardo.model.beans.Veiculo;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteBuscaVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Veiculo car = manager.find(Veiculo.class, 1L);
		System.out.println(car);
		manager.close();
		JPAUtil.close();
	}

}
