package testes;

import java.util.Scanner;

public class TestaVetores {

	public static void main(String[] args) {
		
		int tamanho = Integer.valueOf(args[0]);

		float[] valores = new float[tamanho];		
		String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};		
		float[] totais = new float[12];
		
		Scanner ler = new Scanner(System.in);
		
		int mes = 0;		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = ler.nextFloat();			
			mes = ler.nextInt();
			
			totais[mes-1] = totais[mes-1] + valores[i];
		}
		
		float total = 0;		
		for(float valor : valores) {
			total = total + valor;
		}
		System.out.println("Total: " + total);
		
		for (int i = 0; i < totais.length; i++) {
			System.out.printf("%s = R$%.2f\n",
					meses[i],
					totais[i]
					);
		}
		
		System.out.println("Tamanho: " + valores.length);
	}
}
