import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int idx = 0; idx < N; idx++){
            num[idx] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(int idx = 0; idx < N; idx++){
            if(num[idx] == v)
                count++;
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}