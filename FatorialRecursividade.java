package br.com.santos.george.vinicius;

import javax.swing.JOptionPane;

public class FatorialRecursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			try {
				int n = Integer.parseInt(JOptionPane.showInputDialog(
						"Informe o valor (Use um número menor que zero para finalizar): ","0"));
				//Verificar se n é menor que zero, caso verdade,
				//encerrar o programa (sair do loop)
				if (n < 0) {
					break;
				}
				
				long resultado = calcularFatorial(n);
				
				//Imprimir o resultado com
				JOptionPane.showMessageDialog(null, "O Resultado é: " + resultado);
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Um erro ocorreu"+e.getMessage());
			}
		} while (true);
	}
	
	private static long calcularFatorial (int n) {
		long res;
		
		//Verificar se n=0 OU n=1, caso verdade,
		//retornar 1 (na variável res)
		if (n == 0 || n == 1)
		{
			res = 1;
		}
		else
		{
			res = n * calcularFatorial(n-1);
		}
		return res;
	}
}
