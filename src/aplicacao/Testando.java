package aplicacao;

import modelo.Atendimento;
import modelo.Paciente;
import modelo.Plano;

public class Testando {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("321301", "Clods");
		Plano plano1 = new Plano("Hapvida");
		Atendimento atendimento1 = new Atendimento("Id 1");
		Atendimento atendimento2 = new Atendimento("Id 2");
		Atendimento atendimento3 = new Atendimento("Id 3");
		
		paciente1.addAtendimento(atendimento1);
		paciente1.addAtendimento(atendimento2);
		paciente1.addAtendimento(atendimento3);
		
		plano1.addAtendimento(atendimento1);
		plano1.addAtendimento(atendimento2);
		plano1.addAtendimento(atendimento3);
		
		System.out.println(paciente1);
		System.out.println(plano1);
		
		System.out.println(paciente1.getAtendimentos());
		System.out.println(plano1.getAtendimentos());
		System.out.println(paciente1.localizaAtendimento(atendimento3));
	}
}
