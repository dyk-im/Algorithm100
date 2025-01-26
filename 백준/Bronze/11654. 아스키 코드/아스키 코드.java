import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char a = br.readLine().charAt(0);

		bw.write(a+0+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}