import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] matrix = new int[N+1][N+1];
		int[][] sumMatrix = new int[N+1][N+1];
		for(int idx = 1; idx <= N; idx++){
			st = new StringTokenizer(br.readLine());
			for(int idx2 = 1; idx2 <= N; idx2++){
				matrix[idx][idx2]=Integer.parseInt(st.nextToken());
				sumMatrix[idx][idx2]=sumMatrix[idx][idx2-1]+sumMatrix[idx-1][idx2]
					-sumMatrix[idx-1][idx2-1] + matrix[idx][idx2];
			}
		}
		int x1, y1, x2, y2, answer = 0;
		for(int idx =1; idx <= M; idx++){
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			answer = sumMatrix[x2][y2] - sumMatrix[x2][y1-1] - sumMatrix[x1-1][y2] + sumMatrix[x1-1][y1-1];
			bw.write(answer+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}