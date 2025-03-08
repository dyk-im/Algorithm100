import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<N; i++ ){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		int sum = 0;
		int count = 0;
		while(start < end){
			sum = arr[start]+ arr[end];
			if(sum != M){
				if(sum > M)
					end--;
				else
					start++;
			}
			if(sum == M){
				count++;
				start++;
				end--;
			}
		}
		
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
