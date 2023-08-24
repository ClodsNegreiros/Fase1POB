package modelo;

import java.util.ArrayList;

public class Plano {
	private String nome;
	private ArrayList<Atendimento> listaDeAtendimento = new ArrayList<>();
	
	public Plano(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addAtendimento(Atendimento atendimento) {
		atendimento.setPlano(this);
		this.listaDeAtendimento.add(atendimento);
	}
	
	public void removeAtendimento(Atendimento atendimento) {
		atendimento.setPlano(null);
		this.listaDeAtendimento.remove(atendimento);
	}
	
	public ArrayList<Atendimento> getAtendimentos() {
		return listaDeAtendimento;
	}
	
	public String toString() {
		String texto =  "Plano: " +  this.nome;

		return texto;
	}
}
