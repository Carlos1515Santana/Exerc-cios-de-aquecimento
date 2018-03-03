/*
 * 09) Faça um programa que utilize a estrutura while para ler 50 números e 
 * calcule e exiba a média aritmética deles.
 */
 import java.util.Scanner;

public class Lista09 {
  public static void main(String [] args){
 
  int num ;
  double n , media;
  Scanner input = new Scanner(System.in);
  num = 0;
  media =0;
  System.out.print("Entre com dois valores inteiros:\n"); 
   
     
      try {
    	  while(num !=5){
      
    	 num++;
    	 n = input.nextDouble();
    	 media = media + n;
    	  
     }
   }catch(Exception e){
	   
   }
     System.out.println(media/num);
  }
}
    

