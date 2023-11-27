package model;

public class Cliente {
	// Atributos
	private String nome;
	private String telefone;
	private String cnh;
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCnh() {
		return cnh;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	// Metodos
	public Boolean validarCnh() {return true;}
	public void excluirCli() {}
	
}
