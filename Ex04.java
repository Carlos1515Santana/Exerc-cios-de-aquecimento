class Ex04{
    
   //LETRA A
    
   public static void selectSort(int vet [ ]) {
      int menor;
   // loop até o último elemento
      for ( int i = 0; i < vet.length - 1; i++ ) {
         menor = i;
      // acha o índice do menor a partir de i
         for ( int j = i + 1; j < vet.length; j++ ){
            if ( vet [ j ] < vet [ menor ] )
               menor = j;
         // troca i com o menor
            int aux = vet [ i ];
            vet [ i ] = vet [menor];
            vet [ menor ] = aux;
         }
      }
      
   }
   
   
   public static void bubbleSort( int vet [ ] ) {
      int aux; // variável auxiliar para trocas
   // loop até o último elemento
      for ( int i = 0; i < vet.length - 1; i++ ){
         for ( int j = 0; j < vet.length-1 - i; j++ ){
         // troca j com j+1
            if (vet[ j ] > vet[ j+1]) {
               aux = vet [ j ];
               vet [ j ] = vet [ j+1];
               vet [ j+1] = aux;
            }
         }
      }
   } 
   

   public static void selectSortInvertido(int vet [ ]) {
      int menor;
   // loop até o último elemento
      for ( int i = vet.length-1; i >= 0; i-- ) {
         menor = i;
      // acha o índice do menor a partir de i
         for ( int j = i-1; j>=0; j-- ){
            if ( vet [ j ] > vet [ menor ] ){
               menor = j;            
            }
         }
         int aux = vet [ i ];
         vet [ i ] = vet [menor];
         vet [ menor ] = aux;
      }
      
   }
   
   public static void bubbleSortInvertido( int vet [ ] ) {
      int aux; // variável auxiliar para trocas
   // loop até o último elemento
      for ( int i = vet.length - 1 ;     i >=0; i-- ){
         for ( int j = vet.length-1; j >0; j-- ){
         // troca j com j+1
            if (vet[ j ] < vet[ j-1]) {
               aux = vet [ j ];
               vet [ j ] = vet [ j-1];
               vet [ j-1] = aux;
            }
         }
      }
   }
   
   public static void insertSort(int vet [ ] ) {
      int aux; // variável temporária para o elem a inserir
   // loop até o último elemento
      for ( int i = 1; i < vet.length; i++ ) {
      // guarda o valor do elemento corrente
         aux = vet [ i ];
      // inicializa a variável de localização
         int moveItem = i;
      // procura lugar para colocar o elemento
         while ( moveItem > 0 && vet [ moveItem - 1 ] > aux ){
         // muda uma posição a direita
            vet [ moveItem ] = vet [ moveItem - 1 ];
            moveItem--;
         }
         vet [ moveItem ] = aux; // coloca o elem no lugar
      }
   }
    

   public static void insertSortInvertido(int vet [ ] ) {
      int aux;  
      for ( int i = 5; i >=0; i-- ) {
         aux = vet [i];
         int moveItem = i;
           
         while ( moveItem >= 0 && moveItem < vet.length && vet[moveItem + 1 ] < aux ){
            vet[moveItem] = vet [ moveItem + 1];
            moveItem++;
         }
         vet [moveItem] = aux;  
      }
   }
   //Primeira forma de bubbleSortRecursivo
   public static void bubbleSortRecursivo(int vet[],int inicio, int fim){
      int aux;
      int j=0;
      while(inicio <= fim){
         while(j<fim){
            if (vet[ j ] > vet[ j+1]) {
               aux = vet [ j ];
               vet [ j ] = vet [ j+1];
               vet [j+1] = aux;
               j++;
            }else{
               j++;
            }
         }
         inicio++;
         bubbleSortRecursivo(vet,inicio,fim);
      
      }                              
       
   }
    //segunda forma de bubbleSortRecursivo
   public static int[] recursiveBubbleSort(int[] lista, int n) {
      if (n == 1) {
         return lista;  
      }
      int aux;
      for (int i = 0; i < n-1; i++) {
         if (lista[i+1] < lista[i]) {
            aux = lista[i];
            lista[i] = lista[i+1];
            lista[i+1] = aux;
         }
      }
      return recursiveBubbleSort(lista, n-1);
   }
   
  
   //terceira forma de bubbleSortRecursivo
   public static int[] terceiraFormaDeBubbleSortRecursivo(int[] vet, int InicioIndex, int FimIndex) {
      if(InicioIndex >FimIndex){
         return vet;
      }
   
      if (InicioIndex == FimIndex - 1) {
         terceiraFormaDeBubbleSortRecursivo(vet, 0, FimIndex - 1);
         
      } else if (vet[InicioIndex] > vet[InicioIndex+1]) {
         int currentNumber = vet[InicioIndex];
         vet[InicioIndex] = vet[InicioIndex + 1];
         vet[InicioIndex + 1] = currentNumber;
         terceiraFormaDeBubbleSortRecursivo(vet, InicioIndex + 1,FimIndex);
      } 
      else  {
         terceiraFormaDeBubbleSortRecursivo(vet, InicioIndex + 1, FimIndex);
      } 
      return vet;
    
   } 


      
   public static void main(String[] args ){
      int tab1[] = {1,2,3,4,5,6,7};
      int tab[] = {4,5,7,6,3,10,12};
       
      System.out.print( "\nselectSort: ");
      selectSort(tab);
      for (int i = 0; i < tab.length; i++){  		 
         System.out.print(tab[i] + " "); 
      }
     
     
      System.out.print( "\nbubbleSort: "); 
      int tab2[] = {1,5,7,6,30,10,12};
      bubbleSort(tab2);
      for (int i = 0; i < tab2.length; i++){  		 
         System.out.print(tab2[i] + " "); 
      }
   	 
       
      System.out.print( "\ninsertSort: ");
      int tab3[] = {1,5,7,6,30,10,12};
      insertSort(tab3);
      for (int i = 0; i < tab3.length; i++){  		 
         System.out.print(tab3[i] + " "); 
      }
      
      
      System.out.print( "\nselectSortInvertendo: ");
      int tab4[] = {1,20,35,77,30,10,22};
      selectSortInvertido(tab4);
      for (int i = 0; i < tab4.length; i++){  		 
         System.out.print(tab4[i] + " "); 
      }
      
      
      System.out.print( "\nbubbleSortInvertido: ");
      int tab5[] = {100,20,35,77,39,10,90};
      bubbleSortInvertido(tab5);
      for (int i = 0; i < tab5.length; i++){  		 
         System.out.print(tab5[i] + " "); 
      }
   
   
      System.out.print( "\ninsertSortInvertido: ");      
      int tab6[] = {1,50,35,77,39,3,100};
      insertSortInvertido(tab6);
      for (int i = 0; i < tab6.length; i++){  		 
         System.out.print(tab6[i] + " "); 
      }
      
      
     
     //BubbleSortRecursivo
      System.out.print("\nbubbleSortRecursivo: ");
      
      int tab7[] = {1,50,35,120,39,3,100,-9,-10,-19};
      bubbleSortRecursivo(tab7,0,9);
      for (int i = 0; i < tab7.length; i++){  		 
         System.out.print(tab7[i] + " "); 
      }
      
     //BubbleSortRecursivoSegundaForma
   
      System.out.print("\nbubbleSortRecursivoSegundaForma: ");
      
      int tab8[] = {1,50,35,120,39,3,100};
      recursiveBubbleSort(tab8,7);
      for (int i = 0; i < tab8.length; i++){  		 
         System.out.print(tab8[i] + " "); 
      }
      
      
      //BubbleSortRecursivoTerceiraForma
   
      System.out.print("\nbubbleSortRecursivoTerceiraForma: ");
      
      int tab9[] = {1,50,35,120,39,3,100,90,-9,9};
      terceiraFormaDeBubbleSortRecursivo(tab9,0,10);
      for (int i = 0; i < tab9.length; i++){  		 
         System.out.print(tab9[i] + " "); 
      }
   
   
   
   
   }

 
}