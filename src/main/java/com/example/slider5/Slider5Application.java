package com.example.slider5;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Slider5Application {

	public static void main(String[] args) {
		SpringApplication.run(Slider5Application.class, args);

		Scanner sc = new Scanner(System.in);

		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();

		msgComeco();

		System.out.print("Digite o tipo de cliente: ");
		String cliente = sc.nextLine().trim().toLowerCase();

		System.out.print("Digite o consumo: ");
		double consumo = 0;
		try {
			consumo = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Entrada inválida para o consumo. Encerrando.");
			sc.close();
			return;
		}

		double descontoReal = calculadoraDescontos.calcularDesconto(consumo, cliente);

		System.out.println("\n\n");
		System.out.printf("Cliente:  %s\n", cliente);
		System.out.printf("Consumo:  %.2f\n ", consumo);
		System.out.printf("Desconto: %.2f\n", descontoReal);

		sc.close();
	}

	private static void msgComeco() {
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("************* Calcular desconto ************");
		System.out.println("******************************************");
		System.out.println("");
		System.out.println("1 - REGULAR");
		System.out.println("2 - VIP");
		System.out.println("3 - FUNCIONARIO");
		System.out.println("");
	}
}
