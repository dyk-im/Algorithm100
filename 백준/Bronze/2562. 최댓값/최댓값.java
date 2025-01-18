import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		int count = 0; int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
				count = i + 1;
			}
		}
		bw.write(max+"\n");
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}