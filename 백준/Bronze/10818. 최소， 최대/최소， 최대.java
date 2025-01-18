import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int idx = 0; idx < N; idx++) {
			arr[idx] = Integer.parseInt(st.nextToken());
		}
		int min = arr[0]; int max = arr[0];
		for(int idx = 1; idx < N; idx++) {
			if(min > arr[idx]){
				min = arr[idx];
			}
			else if(max < arr[idx])
				max = arr[idx];
		}
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
		br.close();
	}
}