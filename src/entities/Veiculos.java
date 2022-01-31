package entities;


public class Veiculos extends Aluguel {

	
	private String modelo;
	private Integer ano;
	private String marca;
	private String placa;
	private Boolean disponivel = true;
	
	
	
	
	
	
	public String getDisponivel() {
		String mensagem = "Indisponivel";
		if (this.disponivel == true) {
			
			mensagem = "Disponivel para aluguel";
		}
		
		return mensagem;
		}
	
	
	
	
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	@Override
	public String toString() {
		return "Veiculos: modelo: " + modelo + "     ano:" + ano + "     marca:" + marca + "     placa:" + placa
				+"     "+ getDisponivel();
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((disponivel == null) ? 0 : disponivel.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculos other = (Veiculos) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (disponivel == null) {
			if (other.disponivel != null)
				return false;
		} else if (!disponivel.equals(other.disponivel))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
