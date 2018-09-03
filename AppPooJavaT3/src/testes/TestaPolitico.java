package testes;

import negocio.Politico;

public class TestaPolitico {

	public static void main(String[] args) {
		
		Politico p3 = new Politico();
		p3.show();
		
		Politico p1 = new Politico();
		p1.nome = "Maria";
		p1.qtdeMandato = 3;
		p1.salario = 1000;
		p1.senador = false;
		p1.show();
		
		Politico p2 = new Politico("Joao", 1000);
		p2.qtdeMandato = 2;
		p2.senador = true;
		p2.show();
	}
}
