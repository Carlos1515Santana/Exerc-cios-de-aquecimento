/*
 04) Faça um programa que receba 4 valores e retorne o menor entre eles.
 */

 

import javax.swing.JOptionPane;

public class Lista04 {
   public static void main(String [] args){
	     
	    String aux1 = " ";
	      int a; int b; int c ; int d , aux = 0;
	      a = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
	      b = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
	      c = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
	      d = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
	    
	    
	    
	    try{
	    
	    	aux = a;
	     
	    	 
	        if(aux > b)
	    {
	    		aux = b;
	    }
	    	if(aux>c)
	    {
	    		aux=c;
	    }
	    	if(aux>d)
	    {
	    		aux=d;
	    } 
	    	
	    	 System.out.println(aux);
	    	
	    }catch(Exception e){
	    	
	    }
	    
   }

 
}
