import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1008
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = "+numeroFuncionario+"\nSALARY = U$ %.2f\n",salario);

        sc.close();


    }
}
