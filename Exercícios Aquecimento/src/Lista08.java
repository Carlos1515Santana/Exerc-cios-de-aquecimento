/*
 * 08) Refaça o exercício anterior usando a estrutura switch.
- Exercícios básicos com estrutura de repetição:
while (condição) {
instruções
}
do {
instruções
} while (condição)
for( variável = valorinicial; condição; incremento) 
instruções

 */
import java.util.Scanner;

public class Lista08 {
	public static void main(String[]args){
		int num = 0;
		Scanner entrada = new Scanner(System.in); 
		 

		while(num!= 4){
			 
			try{

				System.out.print("Entre com dois valores inteiros:\n");
				num = entrada.nextInt();
				 
				if(num == 1){
					System.out.println("Parafuso");
				}
				if(num == 2){
					System.out.println("Porca");
				}
				if(num == 3){
					System.out.println("prego");
				}
				if(num!= 3 && num!= 1 && num!= 2){
					System.out.println("Diversos");
				}
			}catch(Exception e){

			}
		}

	}
}

