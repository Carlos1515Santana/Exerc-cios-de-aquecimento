
/*
 *  28) b deve receber a lista dos índices de a em que aparecem elementos que 
 *      são a média aritmética dos seus vizinhos à esquerda e à direita. 
 *      O primeiro e o último índice não devem ser considerados.
 */
 
public class Lista28 {
	  public static void main ( String []args ) { 
		
		  int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
		  int n = a.length; 
		  int b [] = new int [n];
		   
		  int m = 20;
		  int i = 0;
		     
		  for(i=1; i < n -1; i++){
			 if(a[i] == (a[i-1] + a[i+1])/2){
				 b[i] = i;
			 }
		  }
		 
		   
		  String saida = "Resposta:\n";
		  for (i = 0; i < m; i++) saida = saida + b[i] + " "; 
		  saida = saida + "\nFim."; 
		  System.out.println(saida); 
		  //System.exit (0);
		      
	  }
 }

