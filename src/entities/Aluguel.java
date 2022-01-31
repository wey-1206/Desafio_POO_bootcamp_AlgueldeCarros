package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Aluguel {	

	ArrayList<Veiculos> listaDeCarros = new ArrayList<>();
	HashSet<Veiculos> listaDeCarrosDisponiveis = new HashSet<>();
	

	



	public ArrayList<Veiculos> getListaDeCarros() {

		return listaDeCarros;
	}



	public void setListaDeCarros(ArrayList<Veiculos> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}



	public HashSet<Veiculos> getListaDeCarrosDisponiveis() {
		return listaDeCarrosDisponiveis;
	}



	public void setListaDeCarrosDisponiveis(HashSet<Veiculos> listaDeCarrosDisponiveis) {
		this.listaDeCarrosDisponiveis = listaDeCarrosDisponiveis;
	}



	@Override
	public String toString() {
		return " Lista de Carros " + listaDeCarros ;
	}
	
	
	public void disponiveis(){ 
		listaDeCarrosDisponiveis.addAll(listaDeCarros);
		Iterator<Veiculos> it = getListaDeCarrosDisponiveis().iterator();
		
		while (it.hasNext()){
			Veiculos i = it.next();
			
			
			if(i.getDisponivel() == "Indisponivel"){
				it.remove();
			}
			
		}	
		Iterator<Veiculos> ite = getListaDeCarrosDisponiveis().iterator();
			while (ite.hasNext()){
				Veiculos i = ite.next();
				System.out.println(i);
			}

		
		
		
	}



	
	
	
	


	
	
	

}

