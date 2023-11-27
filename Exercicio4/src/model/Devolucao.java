package model;

import java.util.Date;

public class Devolucao {
	// Atributos
	private Date data;
	private double valorDanos;
	private Boolean estaDanificado;
	private Locacao locacao;
	
	// Getters e Setters
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public double getValorDanos() {
		return valorDanos;
	}
	
	public void setValorDanos(double valorDanos) {
		this.valorDanos = valorDanos;
	}
	
	public Boolean getEstaDanificado() {
		return estaDanificado;
	}
	
	public void setEstaDanificado(Boolean estaDanificado) {
		this.estaDanificado = estaDanificado;
	}
	
	public Locacao getLocacao() {
		return locacao;
	}
	
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	// Metodos
	public double calcularCustosDanos() {return 0;}
	public double estaEmAtraso() {return 0;}

}
