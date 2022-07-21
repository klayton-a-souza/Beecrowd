import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1002
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n*(Math.pow(raio, 2));
        
        System.out.printf("A=%.4f\n",area);

    }
}
