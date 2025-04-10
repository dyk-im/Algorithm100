import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        String[][] x = new String[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                String[] a = bf.readLine().split(" ");
                x[i][0] = a[0];
                x[i][1] = a[1];
            }
        }

        Arrays.sort(x, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0] == o2[0])
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                else
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(String.valueOf(x[i][j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}