
 public class Lista33 {
   public static void main ( String []args ) { 
   	
      int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
      int n = a.length; 
      int b [] = new int [n];
       
   	   
      int m = 20;
      int i = 0;
      int j = 0;
   	 
      
      for ( i = 0; i < n; i++) {
         for (j = 0; j < n; j++) {
            if (b[j] > a[i] ) {
               int temp = a[i];
               a[i] = b[j];
               b[j] = temp;
            }
             for(int k = 0; k <= i; ++k) b[i] = a[i];
             
         }
          
              
          
      }
           
      String saida = "Resposta:\n";
      for (i = 0; i < m; i++) saida = saida + b[i] + " "; 
      saida = saida + "\nFim."; 
      System.out.println(saida); 
   	  //System.exit (0);
   	      
   }
}



