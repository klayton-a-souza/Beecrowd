import java.io.IOException;
import java.util.Scanner;

public class p1017 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int tempoGastoNaViagem = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double distanciaPercorrida = tempoGastoNaViagem * velocidadeMedia;
		double litrosGastos = distanciaPercorrida / 12;
		
		System.out.print(String.format("%.3f\n", litrosGastos));

		sc.close();
	}
}
