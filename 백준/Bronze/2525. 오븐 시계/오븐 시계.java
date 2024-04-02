import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        int minute = A*60 + B + C;

        A = (minute/60)%24;
        B = (minute)%60;

        System.out.print(A+" "+B);
    }
}