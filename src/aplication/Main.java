package aplication;

import entities.Veiculos;
import entities.Aluguel;
import entities.Carro;
import entities.Cliente;


public class Main {



	public static void main(String[] args) {
		Aluguel aluguel = new Aluguel();
		Veiculos carro1 = new Carro();
		Cliente cliente = new Cliente();

		carro1.setModelo("Civic");
		carro1.setMarca("Honda");
		carro1.setAno(2014);
		carro1.setPlaca("EJM-4042");
		carro1.setDisponivel(true);
		
		Veiculos carro2 = new Carro();
		carro2.setModelo("Onix");
		carro2.setMarca("Chevrolet");
		carro2.setAno(2020);
		carro2.setPlaca("ABM-0025");
		
		Veiculos carro3 = new Carro();
		carro3.setModelo("Cruze");
		carro3.setMarca("Chevrolet");
		carro3.setAno(2019);
		carro3.setPlaca("CPP-1376");
		carro2.setDisponivel(true);
		
		Veiculos carro4 = new Carro();
		carro4.setModelo("HB20");
		carro4.setMarca("Hyundai");
		carro4.setAno(2020);
		carro4.setPlaca("PPX-8224");
		carro4.setDisponivel(true);
		
		Veiculos carro5 = new Carro();
		carro5.setModelo("Punto");
		carro5.setMarca("Fiat");
		carro5.setAno(2012);
		carro5.setPlaca("HXT-2242");
		carro5.setDisponivel(true);
		
		Veiculos carro6 = new Carro();
		carro6.setModelo("3008");
		carro6.setMarca("Peugueot");
		carro6.setAno(2021);
		carro6.setPlaca("GDT-1578");
		carro6.setDisponivel(true);
				
		
		aluguel.getListaDeCarros().add(carro1);
		aluguel.getListaDeCarros().add(carro2);
		aluguel.getListaDeCarros().add(carro3);
		aluguel.getListaDeCarros().add(carro4);
		aluguel.getListaDeCarros().add(carro5);
		aluguel.getListaDeCarros().add(carro6);
		
//		if(aluguel.)

		System.out.println("Quantiade de carros cadastrados");
		
		System.out.println(aluguel.getListaDeCarros().size());

		
		System.out.println("");

		System.out.println("-----------------Carros cadastrados------------------");
		System.out.println("");

//	

			for (Veiculos listaIterada : aluguel.getListaDeCarros()) {
				System.out.println(listaIterada);

			}
			System.out.println("");

			System.out.println("----------------Carros disponiveis antes do aluguel-------------------");
			System.out.println("");

			aluguel.disponiveis();
			System.out.println("");

			System.out.println("------------Cadastro de um novo cliente-----------------------");
			System.out.println("");
			
			
			
			cliente.setNome("Wesley prado");
			cliente.setCpf("455466789-01");
			System.out.println(cliente);
			System.out.println("");
			System.out.println("");
			System.out.println("------------Cadastro do cliente wesley após alugar um carro-----------------------");
			System.out.println("");

			cliente.alugarCarro(carro1);
			System.out.println(cliente);

			System.out.println("");
			System.out.println("");
			System.out.println("----------------Carros disponiveis após o aluguel-------------------");
			System.out.println("");

			aluguel.disponiveis();
			System.out.println("");
			System.out.println("");
			System.out.println("------------Cliente wesley devolve o carro-----------------------");
			System.out.println("");

			cliente.devolverCarro(carro1);
			System.out.println(cliente);
			
			System.out.println("");
			System.out.println("");
			System.out.println("----------------Carros disponiveis após a devolução-------------------");
			System.out.println("");

			aluguel.disponiveis();
			
		
			
			
			
			
	}

}
