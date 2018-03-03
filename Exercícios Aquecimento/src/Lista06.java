
/* 06) Fa�a um programa que receba 3 valores que representar�o os lados de um tri�ngulo e 
verifique se os valores formam um tri�ngulo e classifique esse tri�ngulo como:
- eq�il�tero (3 lados iguais);
- is�sceles (2 lados iguais);
- escaleno (3 lados diferentes).
Lembre-se que para formar um tri�ngulo:
- nenhum dos lados pode ser igual a zero;
- um lado n�o pode ser maior do que a soma dos outros dois;
 */

import java.util.Scanner;

public class Lista06{
	public static void main(String args[]){

		int a , b, c;

		Scanner entrada = new Scanner(System.in);




		try{
			System.out.print("Entre com TR�S valores inteiros:\n");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();
			
			if(a == 0 || b == 0 || c == 0 || a>b+c || b>a+c || c>a+b){
				System.out.println("N�o pode forma Tri�ngulo");
			}
			else if(a == b && b == c){
				System.out.println("eq�il�tero");
			}
			else if(a==b && a!=c || a==c && a!=b || b==c && a!=b){
				System.out.println("is�sceles");
			}
			else if(a != b && a != c && c != b){
				System.out.println("escaleno");
			} 


		}catch(Exception e){
		}



	} 

}
