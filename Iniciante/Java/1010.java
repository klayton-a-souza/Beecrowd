import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1008
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada01 = sc.nextLine();
        String entrada02 = sc.nextLine();

        String e01[] = new String[3];
        String e02[] = new String[3];
        
        e01 = entrada01.split(" ");
        e02 = entrada02.split(" ");

        int codigoPeca01 = Integer.parseInt(e01[0]);
        int numeroPeca01 = Integer.parseInt(e01[1]);
        double valorUnitarioPeca01 = Double.parseDouble(e01[2]);

        int codigoPeca02 = Integer.parseInt(e02[0]);
        int numeroPeca02 = Integer.parseInt(e02[1]);
        double valorUnitarioPeca02 = Double.parseDouble(e02[2]);

        double valorTotalPeca01 = numeroPeca01*valorUnitarioPeca01;
        double valorTotalPeca02 = numeroPeca02*valorUnitarioPeca02;
        double valorTotal = valorTotalPeca01+valorTotalPeca02;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorTotal);

        sc.close();

    }
}
