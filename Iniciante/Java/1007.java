import java.util.Scanner;
/*
 * Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1007
 */

public class Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA = ((A*B) - (C*D));

        System.out.println("DIFERENCA = "+DIFERENCA);
        
        sc.close();


    }
}
