import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1003
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double pesoNotaA = 3.5;
        double pesoNotaB = 7.5;
        double somaPesos = 11;
        

        double MEDIA = ((pesoNotaA * A) + (pesoNotaB*B))/somaPesos;

        System.out.printf("MEDIA = %.5f\n",MEDIA);

        sc.close();


    }
}
