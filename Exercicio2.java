package br.edu.fatecpg.tarefa2;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		String [][] usuarios= new String[6][2];
		boolean loginValido = false, senhaValida= false;
		
		for(int l=0; l<=5; l++ ) { 
			for( int c=0; c<=1; c++) {
				System.out.print("Entre com o login e senha: ");
				usuarios[l][c]=ler.nextLine();
			}
		}
			System.out.print("Entre com o login: ");
			String login = ler.nextLine();
			System.out.print("Entre com o Senha: ");
			String senha = ler.nextLine();
			
			for( int l=0; l<=5; l++) {
				if(usuarios[l][0].equals(login)) {
					loginValido=true;
					 if(usuarios[l][1].equals(senha)) {
						 senhaValida=true;
					 }
				    break;
				    				
				}
						
			}
			
			if(loginValido && senhaValida) {
				System.out.println("LOGIN E SENHA VALIDOS");
				
			}else if(!senhaValida) {
				System.out.println("SENHA INVALIDA");
			}else if(!loginValido) {
				System.out.println("LOGIN INVALIDO");
		}else {
			System.out.println("LOGIN E SENHA INVALIDADOS");
		}
		}	
	}
	
