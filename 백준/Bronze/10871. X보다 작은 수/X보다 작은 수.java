import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int idx = 0; idx<N; idx++) {
			arr[idx]=Integer.parseInt(st.nextToken());
			if(arr[idx] < X ){
				bw.write(arr[idx]+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

