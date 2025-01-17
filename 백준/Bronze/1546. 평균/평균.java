import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		double[] newScore = new double[N];
		int max= 0; double total = 0;
		
		st = new StringTokenizer(br.readLine());

		for (int idx = 0; idx < N; idx++) {
			score[idx] = Integer.parseInt(st.nextToken());
			max = Math.max(max, score[idx]);
		}
		for(int idx = 0; idx < N; idx++) {
			newScore[idx] = ((double)score[idx])/max * 100;
			total += newScore[idx];
		}
		double avg = total / N;

		bw.write(Double.toString(avg));
		bw.flush();
		br.close();
		bw.close();
	}
}