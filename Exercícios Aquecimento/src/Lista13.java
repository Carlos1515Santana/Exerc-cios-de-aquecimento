import java.util.Scanner;

/* 13)
 * Fa�a um programa que utilize uma estrutura de repeti��o para ler 
 * 50 n�meros armazenando-os em um vetor e calcule e exiba a m�dia aritm�tica deles. 
 * Em seguida o programa deve apresentar todos os valores armazenados no
 * vetor que sejam menores que a m�dia.
 */
public class Lista13 {
   public static void main(String []args){
	   
	   int[] v = new int[50];
	   int[] a = new int[50];
	   int i ;
	   double media =0;
	   double total = 0;
	    
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("Digite Os N�meros\n");
	   try{
		   for(i = 0; i < v.length; i++){
	    
	    	v[i] = input.nextInt();
	    	total = total + v[i];
	    	 
	    }
		      media = total/50; 
	          System.out.println("Valor da m�dia : " + media);
	           
	    
	        for( i = 0 ; i < v.length; i++){
	        	if(v[i] < media){
		    		a[i] = v[i]; 
		    		System.out.println("N�MEROS ABAIXO DA M�DIA : " + a[i]);
		    	}
	         
	      }  
	      
	   }catch(Exception e){
		   System.out.println("Ocorreu algum erro!");
	   }
	       
   }
}
