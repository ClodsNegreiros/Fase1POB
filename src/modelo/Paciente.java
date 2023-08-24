package modelo;

import java.util.ArrayList;

public class Paciente {
	private String cpf;
	private String nome;
	private ArrayList<Atendimento> listaDeAtendimentos = new ArrayList<>();
	
	public Paciente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void addAtendimento(Atendimento atendimento) {
		atendimento.setPaciente(this);
		this.listaDeAtendimentos.add(atendimento);
	}
	
	public void removeAtendimento(Atendimento atendimento) {
		atendimento.setPaciente(null);
		this.listaDeAtendimentos.remove(atendimento);
	}
	
	public ArrayList<Atendimento> getAtendimentos() {
		return this.listaDeAtendimentos;
	}
	
	public Atendimento localizaAtendimento(Atendimento atendimento) {
		for (Atendimento a : this.listaDeAtendimentos) {
			if (a == atendimento) {
				return a;
			}
		}
		
		return null;
	}
	
	public String toString() {
		String texto =  "Nome: " +  this.nome + 
				", Cpf: " + this.cpf;

		return texto;
	}
}
