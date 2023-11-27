package model;

import java.util.Date;

public class Locacao {
	// Atributos
	private Date dataIni;
	private Date dataFim;
	private double valorTotal;
	private double valorCaucao;
	private IVeiculo veiculo;
	private Cliente cliente;
	private Devolucao devolucao;
	
	// Getters e Setters
	public Date getDataIni() {
		return dataIni;
	}
	
	public void setDataIni(Date dataIni) {
		this.dataIni = dataIni;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getValorCaucao() {
		return valorCaucao;
	}
	
	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}
	
	public IVeiculo getVeiculo() {
		return veiculo;
	}
	
	// setVeiculo()
	public void setVeiculo(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

	// Metodos
	public double calcularTotal() {return 0;}
	public double calcularCaucao() {return 0;}

}
