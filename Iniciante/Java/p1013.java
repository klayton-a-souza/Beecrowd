import java.io.IOException;
import java.util.Scanner;

public class p1013 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String valores[] = new String[3];

		valores = input.split(" ");
		
		int a = Integer.parseInt(valores[0]);
		int b = Integer.parseInt(valores[1]);
		int c = Integer.parseInt(valores[2]);
		
		if((a > b) && (a > c)) {
			System.out.println(a + " eh o maior");
		}else if(b > c) {
			System.out.println(b + " eh o maior");
		}else {
			System.out.println(c + " eh o maior");
		}

		sc.close();
	}
}
