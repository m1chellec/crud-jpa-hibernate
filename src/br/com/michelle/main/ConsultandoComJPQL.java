package br.com.michelle.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.michelle.curso.model.Cliente;

public class ConsultandoComJPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		// Ja nos devolve uma query tipada, para nao ter que ficar fazendo cast:  createQuery(arg0, arg1);
		//Usamos o .getResultList(); para nos retornar uma lista de clientes;
		List<Cliente> clientes = em.createQuery("from Cliente where sexo = 'F' ", Cliente.class).getResultList(); //ta falando que quer que busque para 
		//mim todos os objetos de cliente: como select * from cliente;
		
		for(Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Profissao: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("---------------------------------------------------------------------------------------------");
			
			
		}
	
	}

}
