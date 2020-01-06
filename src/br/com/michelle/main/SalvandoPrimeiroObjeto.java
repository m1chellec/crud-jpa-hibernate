package br.com.michelle.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.michelle.curso.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bial");
		cliente.setIdade(40);
		cliente.setProfissao("Jornalista");
		cliente.setSexo("F");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso!");
		// em.close();
	}

}
