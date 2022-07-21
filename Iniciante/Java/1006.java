import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1006
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pesoNotaA = 2;
        double pesoNotaB = 3;
        double pesoNotaC = 5;
        double somaPesos = 10;
        

        double MEDIA = ((pesoNotaA * A) + (pesoNotaB*B) + (pesoNotaC*C))/somaPesos;

        System.out.printf("MEDIA = %.1f\n",MEDIA);

        sc.close();


    }
}
