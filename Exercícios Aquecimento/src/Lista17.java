
 public class Lista17 {
	  public static void main ( String []args ) { 
		
		  int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
		  int n = a.length; 
		  int b [] = new int [n];
		  int m = 1;
		  int i; 
		  int j = 0;
		   
		  b[0] = a[0];
		  
		  for(i=0; i < n; i++ ){				  
			   
			  if(b[0] >= a[i]){
				  b[0] = a[i]; 
				  j = i;
				  
			  } 
		  }
		   
		 b[0] = j;
		  
		  String saida = "Resposta:\n";
		  for (i = 0; i < m; i++) saida = saida + b[i] + " "; 
		  saida = saida + "\nFim."; 
		  System.out.println(saida); 
		  //System.exit (0);
		      
	  }
 }

