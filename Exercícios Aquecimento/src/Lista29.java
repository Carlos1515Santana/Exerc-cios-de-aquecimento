
 /*
  * 29) b deve receber a lista dos índices de a que contém o mesmo elemento que está no índice "simétrico": 
	 O primeiro elemento deve ser comparado com o último, o segundo com o penúltimo e assim por diante. 
	 Um par de números só deve ser comparado uma vez, ou seja,
     se a[3] = a[16] apenas o 3 deve aparecer na lista.
 */
public class Lista29 {
	  public static void main ( String []args ) { 
		
		  int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
		  int n = a.length; 
		  int b [] = new int [n];
		  int indice =0;
		   
		  int m = a.length -1;
		  int i = 0;
		  int j = a.length /2 ;
		   
		  for(i = 0; i <= j && j <= m ; i++){
			   if(a[i] == a[m]){
				 b[indice++] = i;
			   }
			   m--;   	    
		  }
		 
		   
		  String saida = "Resposta:\n";
		  for (i = 0; i < m; i++) saida = saida + b[i] + " "; 
		  saida = saida + "\nFim."; 
		  System.out.println(saida); 
		  //System.exit (0);
		      
	  }
 }

