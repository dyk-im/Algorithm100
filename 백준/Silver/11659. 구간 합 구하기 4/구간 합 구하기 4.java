import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N+1]; int[] sumArr = new int[N+1];
		sumArr[0]=0;
		st = new StringTokenizer(br.readLine());
		for(int idx = 1; idx <= N; idx++){
			arr[idx]=Integer.parseInt(st.nextToken());
			sumArr[idx]=sumArr[idx-1]+arr[idx];
		}
		int i, j, answer = 0;
		for(int idx = 0; idx < M; idx++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			answer = sumArr[j] - sumArr[i - 1];
			bw.write(Integer.toString(answer));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
