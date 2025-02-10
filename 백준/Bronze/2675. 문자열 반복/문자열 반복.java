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

		int T = Integer.parseInt(br.readLine());

		for(int idx = 0; idx < T; idx++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			String P="";
			for(int idx2 = 0; idx2 < S.length(); idx2++) {
				String now = String.valueOf(S.charAt(idx2));
				bw.write(now.repeat(R));
			}
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}