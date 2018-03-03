import java.util.Scanner;

public class Lista12 {
  private static Scanner entrada;

public static void main(String []args){
	  
	  int i;
	  int[] vetor =  new int[10];
	  entrada = new Scanner(System.in);
	  
	  System.out.print("Digite os número");
	  
	  for(i = 9; i >=0; i-- ){
		  vetor[i] = entrada.nextInt();
		   
	  }
	  
      for( i = 0 ; i < vetor.length; i++){
         System.out.println(vetor[i]);
      }
      

	 
	   

  }
}
