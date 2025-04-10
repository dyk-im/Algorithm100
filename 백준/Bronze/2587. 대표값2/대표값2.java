import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        int center = 0;
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        center = arr[2];
        avg = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) / 5;

        System.out.println(avg);
        System.out.println(center);

    }
}