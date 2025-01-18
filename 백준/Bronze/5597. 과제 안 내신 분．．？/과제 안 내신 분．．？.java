import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[30];
		int a;
		for(int idx = 0; idx < 28; idx++){
			a = Integer.parseInt(br.readLine());
			arr[a-1]=1;
		}
		for(int idx = 0; idx < arr.length; idx++){
			if(arr[idx]!=1)
				bw.write((idx+1)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}