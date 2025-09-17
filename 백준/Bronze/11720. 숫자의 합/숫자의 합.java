import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String digit = br.readLine();
		int total = 0;

		for(int i = 0; i<digit.length(); i++) {
			total += digit.charAt(i)-'0';
		}
		System.out.println(total);

		br.close();
	}
}