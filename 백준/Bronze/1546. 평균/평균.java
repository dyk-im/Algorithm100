import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		double[] scoreList = new double[N];
		double M = 0;
		double total = 0;

		for(int i=0; i<N ; i++) {
			scoreList[i] = Integer.parseInt(st.nextToken());
		}
		M = scoreList[0];
		for(int i=1; i<N ; i++) {
			if(scoreList[i] > M) {
				M = scoreList[i];
			}
		}

		for(int i=0; i<N ; i++) {
			total += scoreList[i];
		}

		System.out.println(total*100/M/N);

		br.close();
	}
}