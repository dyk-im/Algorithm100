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
		StringTokenizer st = new StringTokenizer(br.readLine());

		String A = st.nextToken();
		String B = st.nextToken();
		String revA = "";
		String revB = "";
		for (int i = 2; i >= 0; i--) {
			revA = revA + A.charAt(i);
		}
		for (int i = 2; i >= 0; i--) {
			revB = revB + B.charAt(i);
		}
		if(Integer.parseInt(revA) > Integer.parseInt(revB)) {
			bw.write(revA + "\n");
		}
		if(Integer.parseInt(revA) < Integer.parseInt(revB)) {
			bw.write(revB + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}