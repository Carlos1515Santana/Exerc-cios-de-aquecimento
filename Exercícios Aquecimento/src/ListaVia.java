
import java.io.*;
import java.util.Scanner;

public class ListaVia
{
	public static void main ( String args [] )
	{
		/* cria mecanismo para fazer a leitura dos dados pelo console*/
		Scanner entrada = new Scanner(System.in);
		/* Declare aqui as vari�veis necess�rias */
		int n1,n2,tot;
		/* Coloque aqui as instru��es para leitura dos dados */
		try{
			System.out.print("Entre com dois valores inteiros:\n");
			n1 = entrada.nextInt(); // entrada.nextFloat() para reais
			n2 = entrada.nextInt(); // entrada.nextLine() para strings
			/* Coloque aqui o c�digo para resolver o problema.
			 * Novas vari�veis podem ser criadas, se necess�rio. */
			tot = n1+n2;
			/* Coloque aqui o c�digo para mostrar os resultados */

			String saida = "Resposta:\n";
			saida = saida + n1 + " + " + n2 + " = " + tot;
			saida = saida + "\nFim.";
			System.out.print(saida);

		} catch (Exception e) {
			System.out.println("Ocorreu algum erro!");
		}
	}
}