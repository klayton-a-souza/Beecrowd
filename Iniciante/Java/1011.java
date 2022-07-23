import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1009
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double raioEsfera = sc.nextDouble();

        double pi = 3.14159;
        double volumeEsfera = (4 / 3.0) * pi * Math.pow(raioEsfera, 3);

        System.out.printf("VOLUME = %.3f\n", volumeEsfera);

        sc.close();
    }
}
