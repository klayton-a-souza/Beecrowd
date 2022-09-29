import java.io.IOException;
import java.util.Scanner;

public class p1015 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String primeiraLinha = sc.nextLine();
		String coordenadasPrimeiroPonto[] = new String[2];

		coordenadasPrimeiroPonto = primeiraLinha.split(" ");

		double xPrimeiroPonto = Double.parseDouble(coordenadasPrimeiroPonto[0]);
		double yPrimeiroPonto = Double.parseDouble(coordenadasPrimeiroPonto[1]);

		String segundaLinha = sc.nextLine();
		String coordenadasSegundoPonto[] = new String[2];

		coordenadasSegundoPonto = segundaLinha.split(" ");

		double xSegundoPonto = Double.parseDouble(coordenadasSegundoPonto[0]);
		double ySegundoPonto = Double.parseDouble(coordenadasSegundoPonto[1]);

		double resultadoX = Math.pow((xSegundoPonto - xPrimeiroPonto), 2);
		double resultadoY = Math.pow((ySegundoPonto - yPrimeiroPonto), 2);

		double formula = Math.sqrt((resultadoX + resultadoY));
		System.out.println(String.format("%.4f", formula));

		sc.close();
	}
}
