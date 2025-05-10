package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite as medidas do Triângulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do Triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);

		System.out.println("Maior Triângulo: " + ((areaX >= areaY) ? "X" : "Y"));
	}

}
