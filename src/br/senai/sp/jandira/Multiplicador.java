package br.senai.sp.jandira;

import java.util.Scanner;

public class Multiplicador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int multiplicando, minMultiplicador, maxMultiplicador, valor1, valor2, tabuada;

		System.out.println("************************");
		System.out.println("        TABUADA         ");
		System.out.println("************************");

		System.out.println("Insira o multiplicando:");
		multiplicando = teclado.nextInt();

		System.out.println("Insira o número no qual deseja que a tabuada comece:");
		valor1 = teclado.nextInt();

		System.out.println("Insira o número no qual deseja que a tabuada termine:");
		valor2 = teclado.nextInt();
		System.out.println("");

		if (valor1 < valor2) {
			minMultiplicador = valor1;
			maxMultiplicador = valor2;
		} else {
			maxMultiplicador = valor1;
			minMultiplicador = valor2;
		}

		while (minMultiplicador <= maxMultiplicador) {
			tabuada = multiplicando * minMultiplicador;
			System.out.println(multiplicando+ " X " +minMultiplicador+ " = " +tabuada);
			minMultiplicador++;
		}

	}

}
