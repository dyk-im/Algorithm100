import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		int a, b, now, total = 0;

		for(int i = 0; i < N; i++){
			a = scanner.nextInt();
			b = scanner.nextInt();
			now = a*b;
			total = total + now;
		}
		if( X == total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}