package br.com.santos.george.vinicius;

import java.util.Scanner;

public class FatorialInterativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classe objeto (pegar entrada do teclado)
		Scanner entrada;
		do {
			
			entrada = new Scanner(System.in);
			System.out.print("Informe o valor (informe -1 para finalizar: )");
			int n = entrada.nextInt();
			if (n==-1)
				break;
			int resultado = calculaFatorial(n);
			System.out.println(">>> O Fatorial de " + n + " e: " + resultado + "\n\n");
			
		}while (true);
		entrada.close();
		System.out.println("\nPROGRAMA FINALIZADO");

	}
	
	private static int calculaFatorial (int n) {
		int fatorial = 1;
		for (int i = n; i > 1; i--) {
			fatorial *= i;
		}
		return fatorial;
	}

}
