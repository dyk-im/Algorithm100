import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		String number = br.readLine();

		for(int i = 0; i < number.length(); i++){
			if(number.charAt(i) >= 65 && number.charAt(i) <= 67)
				sum += 3;
			else if(number.charAt(i) >= 68 && number.charAt(i) <= 70)
				sum += 4;
			else if(number.charAt(i) >= 71 && number.charAt(i) <= 73)
				sum += 5;
			else if(number.charAt(i) >= 74 && number.charAt(i) <= 76)
				sum += 6;
			else if(number.charAt(i) >= 77 && number.charAt(i) <= 79)
				sum += 7;
			else if(number.charAt(i) >= 80 && number.charAt(i) <= 83)
				sum += 8;
			else if(number.charAt(i) >= 84 && number.charAt(i) <= 86)
				sum += 9;
			else if(number.charAt(i) >= 87 && number.charAt(i) <= 90)
				sum += 10;
			else
				sum += 11;
		}

		bw.write(sum + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
