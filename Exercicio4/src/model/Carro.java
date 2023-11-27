package model;

public class Carro {
	// Atributos
	private String modelo;
	private String placa;
	private String ano;
	private String tipoCnh;
	
	// Getters e Setters
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTipoCnh() {
		return tipoCnh;
	}

	public void setTipoCnh(String tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
	
	// Metodos
	public Boolean estaNoPadrao() {return true;}
	public void removerDaFrota() {}
	
}
