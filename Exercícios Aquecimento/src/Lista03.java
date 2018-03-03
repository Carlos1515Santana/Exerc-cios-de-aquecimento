/*
 03) Faça um programa que receba 2 valores e retorne o maior entre eles. 
*/

import javax.swing.*;
public class Lista03 {
   public static void main(String []args){
	   int a , b;
	   a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	   b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
	   
	  try{ if( a > b){
		   System.out.println("O maior número:" + a); 
	   }
	    else {
		   System.out.println("O maior número:" + b);
	   }
	   
	  } catch(Exception e)  {
	       System.out.println("Ocorreu um erro");
	    }
	  }
   }

