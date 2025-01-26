import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();
		int i = Integer.parseInt(br.readLine());
		char a = 'a';
		for(int j = 1; j <= S.length(); j++){
			if(j == i)
				a = S.charAt(j-1);
		}
		bw.write(a+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}