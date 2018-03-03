

/*01) Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço
do produto e retorne o troco a ser dado.*/

import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class Lista01 {
	public static void main(String[]args){

		Scanner entrada = new Scanner(System.in);

		double valorA , valorB , saida;


		try{
			System.out.print("Entre com dois valores inteiros:\n");
			valorA = entrada.nextDouble();   
			valorB = entrada.nextDouble();  
			 
			saida = valorA - valorB;
			 

			String resultado = "Resposta:\n";
			resultado = resultado + valorA + " - " + valorB + " = " + saida;
			resultado = resultado + "\nFim.";
			System.out.print(resultado);

		} catch (Exception e) {
			System.out.println("Ocorreu algum erro!");
		}






	}
}
