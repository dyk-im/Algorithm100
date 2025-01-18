import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		for(int idx = 0; idx < M; idx++){
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for(int idx2 = i-1; idx2 < j; idx2++) {
				arr[idx2+1]=k;
			}
		}
		for(int idx = 0; idx< N; idx++){
			bw.write(arr[idx+1]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}