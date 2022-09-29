import java.io.IOException;
import java.util.Scanner;

public class p1014 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int distanciaTotal = sc.nextInt();
		double combustivelGasto = sc.nextDouble();		
		double consumoMedio = (distanciaTotal/combustivelGasto);		
		System.out.println(String.format("%.3f km/l", consumoMedio));

		sc.close();
	}
}
