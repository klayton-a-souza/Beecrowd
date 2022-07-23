import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1009
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String valores[] = new String[3];

        valores = input.split(" ");

        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        double pi = 3.14159;

        double TRIANGULO = (A * C) / 2;
        double CIRCULO = pi * (Math.pow(C, 2));
        double TRAPEZIO = ((A + B) * C) / 2;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

        sc.close();
    }
}
