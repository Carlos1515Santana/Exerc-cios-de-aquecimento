
public class Lista32 {
	  public static void main ( String []args ) { 
		
		  int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
		  int n = a.length; 
		  int b [] = new int [n];
		  int m = 20;
		  int i = 0;
		  int valor = 0;
		   


		  for(i = 0; i < a.length; i++)
		  {
		    valor = a[i];
		    int c = 0;

		    for(int j = 1; j <= valor; j++)
		    {
		        if(valor % j == 0)
		        {
		          c++;
		        }
		    }  

		    if(c == 2)
		    {
		       b[i] = valor;
		    }

		  }   
				    
		   
		    
		    
		    
		   
		  String saida = "Resposta:\n";
		  for (i = 0; i < m; i++) saida = saida + b[i] + " "; 
		  saida = saida + "\nFim."; 
		  System.out.println(saida); 
		  //System.exit (0);
		      
	  }
 }
