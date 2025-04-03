import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while(true) {
            if(N % 5 ==0) {     
                count+= N /5;
                break;
            } else if(N < 0) {  
                count = -1;
            }
            N -= 3;
            count++;

        }
        System.out.println(count);

    }
}