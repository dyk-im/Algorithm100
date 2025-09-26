import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] sA = new int[N+1];
		int[] aA = new int[N+1];
		sA[0] = 0;

		for(int i = 1; i < N+1; i++){
			sA[i] = Integer.parseInt(st2.nextToken());
		}

		aA[0] = 0;
		for(int i = 1; i<N+1; i++){
			aA[i] = aA[i-1] + sA[i];
		}

		int[] anList = new int[M];
		for(int i=0; i<M; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st3.nextToken());
			int y = Integer.parseInt(st3.nextToken());
			anList[i] = aA[y]-aA[x-1];
		}
		for(int i = 0; i<M; i++){
			System.out.println(anList[i]);
		}
		br.close();
	}
}