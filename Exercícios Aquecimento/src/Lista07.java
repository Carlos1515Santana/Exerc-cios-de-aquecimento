/*
 * 07) Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo. Considere os seguintes códigos:
1 – Parafuso;
2 – Porca;
3 – Prego;
Para qualquer outro código indicar “Diversos”.
 */
import java.util.Scanner;

public class Lista07 {
  public static void main(String[]args){
	  int num;
	  Scanner entrada = new Scanner(System.in); 
            
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
