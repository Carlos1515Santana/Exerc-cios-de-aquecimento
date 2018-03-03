
/* 06) Faça um programa que receba 3 valores que representarão os lados de um triângulo e 
verifique se os valores formam um triângulo e classifique esse triângulo como:
- eqüilátero (3 lados iguais);
- isósceles (2 lados iguais);
- escaleno (3 lados diferentes).
Lembre-se que para formar um triângulo:
- nenhum dos lados pode ser igual a zero;
- um lado não pode ser maior do que a soma dos outros dois;
 */

import java.util.Scanner;

public class Lista06{
	public static void main(String args[]){

		int a , b, c;

		Scanner entrada = new Scanner(System.in);




		try{
			System.out.print("Entre com TRÊS valores inteiros:\n");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();
			
			if(a == 0 || b == 0 || c == 0 || a>b+c || b>a+c || c>a+b){
				System.out.println("Não pode forma Triângulo");
			}
			else if(a == b && b == c){
				System.out.println("eqüilátero");
			}
			else if(a==b && a!=c || a==c && a!=b || b==c && a!=b){
				System.out.println("isósceles");
			}
			else if(a != b && a != c && c != b){
				System.out.println("escaleno");
			} 


		}catch(Exception e){
		}



	} 

}
