package br.edu.fatecpg.tarefa2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int [][]matriz1 = new int[3][3];
		int [][]matriz2 = new int[3][3]; 
		int [][]resultadomatriz = new int[3][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int l=0; l<=2; l++) {
			for(int c=0; c<=2; c++) {
				System.out.println("Digite os numeros da matriz1: ");
				matriz1[l][c]=scan.nextInt();
			}
		}
		for(int l=0; l<=2; l++) {
			for (int c=0; c<=2; c++){
				System.out.println("Digite os numeros da matriz2");
				matriz2[l][c] = scan.nextInt();
			}
		}
		 System.out.println("MATRIZ1");
		  for(int[]dadosMatriz1:matriz1) {
			  for(int dadomatriz1:dadosMatriz1) {
				  System.out.print(dadomatriz1+" - ");
		  }
			  System.out.print("\n");
	}
		  System.out.println("MATRIZ2");
		   for(int[]dadosmatriz2:matriz2) {
			   for(int dadomatriz2:dadosmatriz2){
				   System.out.print(dadomatriz2+" - ");
			   }
			   System.out.print("\n");
		   }
		    for (int l=0; l<=2; l++) {
		    	for(int c=0; c<=2; c++) {
		    		resultadomatriz[l][c]= matriz1[l][c]+matriz2[l][c];
		    			    		
		    	}
		    }
		    System.out.println("resultadoMatriz");
		    for(int []dadosresultadosmatriz:resultadomatriz) {
		    	for(int dado:dadosresultadosmatriz){
		    		System.out.print(dado+" - ");
		    	}
		    	System.out.print("\n");
		    }
	}

}
