package negocio;

public class Politico {
	public String nome;
	public float salario;
	public boolean senador;
	public int qtdeMandato;
	
	final int MESES_ANO = 12;
	final int MAND_4 = 4;
	final int MAND_8 = 8;
	
	
	
	
	
	public Politico(String nome, float salario) {
		this(nome);
		this.salario = salario;
	}
	public Politico() {
		nome = "Nao Informado";
		salario = 999;
		qtdeMandato = 1;
	}
	public Politico(String nome) {
		this();
		this.nome = nome;		
	}	
	
	
	
	
	
	public void show() {
		System.out.printf(
			"%s arrecadou R$%.2f em sua vida política.\n",
			nome,
			calcularSalarioTotal()
		);
	}	
	private float calcularSalarioTotal() {
		int meses = MESES_ANO * (senador ? MAND_8 : MAND_4);

		meses = qtdeMandato * meses;
		
		return meses * salario;
	}
}