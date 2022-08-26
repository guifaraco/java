package application;

import java.util.Scanner;

public class Ex3Prova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double massaFinal = 0.5, massaInicial, tempo = 0;
		
		System.out.println("Insira a massa em gramas: ");
		massaInicial = sc.nextDouble();
		
		while(massaInicial > massaFinal){
			massaInicial = massaInicial / 2;
			tempo = tempo + 50;
		}
		System.out.println("A massa final é: " + massaInicial);
		System.out.println("O tempo em horas é: " + (tempo / 3600));
		System.out.println("O tempo em minutos é: " + (tempo / 60));
		System.out.println("O tempo em segundos é: " + tempo);
		sc.close();
	}

}
