import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int[] rev = new int[N];
		for(int idx = 0; idx < N; idx++){
			arr[idx]=idx+1;
		}
		for(int idx = 0; idx < M; idx++){
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
            int loc=j-1;
			for(int idx2 = i; idx2 <= j; idx2++){				
                rev[loc--] = arr[idx2-1];
               
			}
			for(int idx2 = i; idx2 <= j; idx2++){
				arr[idx2-1]= rev[idx2-1];
			}
		}
		for(int idx = 0; idx < N; idx++){
			bw.write(arr[idx]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}