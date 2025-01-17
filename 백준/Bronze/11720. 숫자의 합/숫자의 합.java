import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int total = 0;
		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();

		for (int idx = 0; idx < N; idx++) {
			int now = (int)(num.charAt(idx)-'0');
			total += now;
		}
		bw.write(String.valueOf(total));
		bw.flush();
		br.close();
		bw.close();
	}
}