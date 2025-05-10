package utilities;

public class Calculator {
	public double base;
	public double altura;

	public Calculator(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return 2 * base + 2 * altura;
	}
}
