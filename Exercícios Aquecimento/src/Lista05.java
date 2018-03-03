
import java.util.Scanner;
 

/*
 * 05) Faça um programa que verifique se um número é impar.
 */
public class Lista05 {
   public static void main(String [] args){
	   
	    int num = 1;
	    Scanner entrada = new Scanner(System.in);
	    
	   while(num != -999){
		        try{
		        	System.out.print("Entre com dois valores inteiros:\n");
		             num = entrada.nextInt(); 
	   
	   if(num%2 == 1)
	   {		System.out.print("O número é impar\n \n");

	   }
	   	else
	   {
	   		     System.out.print("O número é par\n \n");
	   }
	   
     }catch(Exception e){
    	 
     }
	   }
   }
}

