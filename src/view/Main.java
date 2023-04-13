package view;

import java.util.Scanner;

import controller.ConverteController;

public class Main {

	public static void main(String[] args) {
		ConverteController co = new ConverteController();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número decimal (limite 1000): ");
	    int dec = scanner.nextInt();
	    
	      if (dec > 1000) {
	      System.out.println("Número fora do limite!");
	      return;
	      }
		String Bi = co.decToBin(dec);
		System.out.println("decimal:" + dec);
		System.out.println("Binario: "+ Bi);
	}

}
