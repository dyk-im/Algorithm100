import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int n = 1;

		while(n <= 9){
			System.out.println( N + " * " + n + " = " + (n*N));
			n++;
		}
	}
}