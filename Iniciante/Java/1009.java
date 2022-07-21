import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1009
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String nomeVendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasEfetuadas = sc.nextDouble();

        double TOTAL = salarioFixo + (vendasEfetuadas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);

        sc.close();
    }
}
