import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1); // 배열 초기값을 -1로 설정

		for (int i = 0; i < s.length(); i++) {
			int b = s.charAt(i) - 'a';
			if (arr[b] == -1) {
				arr[b] = i; // 알파벳이 처음 등장한 위치 저장
			}
		}

		for (int i = 0; i < 26; i++) {
			bw.write(arr[i] + " "); // 결과 출력
		}

		bw.flush();
		bw.close();
		br.close();
	}
}