import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);
        H=sc.nextInt();
        M=sc.nextInt();

        if(M < 45) {
            if(H == 0)
                System.out.printf("%d %d", H+23, 60-(45-M));
            else
                System.out.printf("%d %d", H-1, 60-(45-M));
        }
        else
            System.out.printf("%d %d", H, M-45);
    }
}