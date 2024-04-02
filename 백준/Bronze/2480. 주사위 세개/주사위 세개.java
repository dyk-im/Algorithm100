import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int price=0;

        if(A==B && B==C)
            price = 10000 + A*1000;
        else {
            if(A==B)
                price = 1000+ A * 100;
            else if(B==C)
                price = 1000+ B*100;
            else if(C==A)
                price = 1000+ C*100;
            else{
                if(A>B){
                    if(A>C)
                        price = A*100;
                    else
                        price = C*100;
                }
                else if(B>C)
                    price = B*100;
                else
                    price = C*100;
            }
        }
        System.out.print(price);
    }
}