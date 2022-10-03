import java.io.IOException;
import java.util.Scanner;

public class p1016 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int distanciaDesejada = sc.nextInt();
		int distanciDoOutroCarro = distanciaDesejada * 2;
		System.out.println((distanciDoOutroCarro) + " minutos");

		sc.close();
	}
}
