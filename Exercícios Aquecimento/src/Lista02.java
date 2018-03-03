

/*  Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do
produto consumida calculando o valor final a ser pago. */

import javax.swing.*;
   public class Lista02 {
	   public static void main(String[]args){
		   
		   double a , b , resultado;
		   String aux = "";
		   
		   try{
			  a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quilo do produto"));
			  b = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilos do produto"));
			  
			  resultado = a * b ;
			   
			  aux = aux + "Resposta: " + resultado;
			  
			  JOptionPane.showMessageDialog(null,aux);
		   }
		   
		   catch (Exception e) {
				System.out.println("Ocorreu algum erro!");
			}
		   
	   }
	   
   
  }
