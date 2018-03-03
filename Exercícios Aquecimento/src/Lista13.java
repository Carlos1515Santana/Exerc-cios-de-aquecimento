import java.util.Scanner;

/* 13)
 * Faça um programa que utilize uma estrutura de repetição para ler 
 * 50 números armazenando-os em um vetor e calcule e exiba a média aritmética deles. 
 * Em seguida o programa deve apresentar todos os valores armazenados no
 * vetor que sejam menores que a média.
 */
public class Lista13 {
   public static void main(String []args){
	   
	   int[] v = new int[50];
	   int[] a = new int[50];
	   int i ;
	   double media =0;
	   double total = 0;
	    
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("Digite Os Números\n");
	   try{
		   for(i = 0; i < v.length; i++){
	    
	    	v[i] = input.nextInt();
	    	total = total + v[i];
	    	 
	    }
		      media = total/50; 
	          System.out.println("Valor da média : " + media);
	           
	    
	        for( i = 0 ; i < v.length; i++){
	        	if(v[i] < media){
		    		a[i] = v[i]; 
		    		System.out.println("NÚMEROS ABAIXO DA MÉDIA : " + a[i]);
		    	}
	         
	      }  
	      
	   }catch(Exception e){
		   System.out.println("Ocorreu algum erro!");
	   }
	       
   }
}
