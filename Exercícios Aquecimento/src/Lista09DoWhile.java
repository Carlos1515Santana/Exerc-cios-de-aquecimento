/* 09) Fa�a um programa que utilize a estrutura while para ler 50 n�meros e 
* calcule e exiba a m�dia aritm�tica deles.
*/
 
	 
import java.util.Scanner;
public class Lista09DoWhile {
 public static void main(String [] args){

 int num , quantidade;
 double n , media;
 Scanner input = new Scanner(System.in);
 num = 0;
 media =0;
 System.out.print("Entre com valores inteiros:\n"); 
  
    
     try {
   	  do{
     
   	 num++;
   	 n = input.nextDouble();
   	 media = media + n;
   	  
    }while(num !=50);
   	  
  }catch(Exception e){
	   
  }
    System.out.println(media/num);
 }
}

