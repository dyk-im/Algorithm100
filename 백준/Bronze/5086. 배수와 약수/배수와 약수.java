import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int A = 0, B = 0;

		while(A >= 0 || B >= 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			if(A==0 && B==0){
				break;
			}

			if (B % A == 0) {
				bw.write("factor"+"\n");
			} else if (A % B == 0) {
				bw.write("multiple"+"\n");
			} else {
				bw.write("neither"+"\n");
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
