import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int T, A, B;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();

		for(int i = 0; i < T; i++){
			A = scanner.nextInt();
			B = scanner.nextInt();
			System.out.println(A + B);
		}
	}
}