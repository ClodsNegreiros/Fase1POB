package modelo;

import java.time.LocalDate;

public class Atendimento {
	private String id;
	private LocalDate data;
	private Paciente paciente;
	private Plano plano;
	
	public Atendimento(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Plano getPlano() {
		return this.plano;
	}
	
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	public String toString() {
		String texto =  "Nome: " +  this.id;
		
		return texto;
	}
}
