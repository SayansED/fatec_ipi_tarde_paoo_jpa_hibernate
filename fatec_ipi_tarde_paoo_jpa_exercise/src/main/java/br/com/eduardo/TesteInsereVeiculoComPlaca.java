package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Placa;
import br.com.eduardo.model.beans.Veiculo;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteInsereVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = new Placa();
		p.setCidade("São Paulo");
		manager.persist(p);
		Veiculo car = new Veiculo();
		car.setMarca("Ford");
		car.setModelo("Ecosport");
		car.setAnoModelo(2020);
		car.setPlaca(p);
		manager.persist(car);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
