import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];
		int count = 0;
		int result = 0;
		for(int i = 0; i < 10; i++){
			int n = Integer.parseInt(br.readLine());
			arr[i] = n%42;
		}
		for(int i = 0; i < 10; i++){
			count = 0;
			for(int j = i+1; j<10; j++){
				if(arr[i] == arr[j])
					count++;
			}
			if(count == 0)
				result++;
		}
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}