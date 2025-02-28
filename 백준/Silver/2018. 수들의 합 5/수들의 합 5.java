import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		int count = 1;
        	int start = 1;
        	int end = 1;

        while(start < N){
            
            if(sum >= N){
                if(sum == N){
                    count++;
                }
                else{
                    start++;
                    end = start;
                    sum = start;
                }
            }
            end++;
            sum += end;
        }        
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
