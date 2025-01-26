import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		String s;
		char first, last;
		for(int i = 0; i < T; i++){
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			first = s.charAt(0);
			last = s.charAt(s.length()-1);
			bw.write(String.valueOf(first) + String.valueOf(last) +"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}