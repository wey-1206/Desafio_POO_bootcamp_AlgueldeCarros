package entities;

import java.util.ArrayList;


public class Cliente {
	
	private String nome;
	private String cpf;
	ArrayList<Veiculos> listaDeCarrosAlugados = new ArrayList<>();
	
	
	public void alugarCarro(Veiculos veiculo) {
		
		veiculo.setDisponivel(false);
		this.listaDeCarrosAlugados.add(veiculo);
	}

	public void devolverCarro(Veiculos veiculo) {
		
		veiculo.setDisponivel(true);
		this.listaDeCarrosAlugados.remove(veiculo);
	}

	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public ArrayList<Veiculos> getListaDeCarrosAlugados() {
		return listaDeCarrosAlugados;
	}


	public void setListaDeCarrosAlugados(ArrayList<Veiculos> listaDeCarrosAlugados) {
		this.listaDeCarrosAlugados = listaDeCarrosAlugados;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome + "    CPF: " + cpf + "    Carros Alugados: " + listaDeCarrosAlugados ;
	}
}
