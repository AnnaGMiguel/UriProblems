import java.io.*;
import java.util.Arrays;

public class Uri1256 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String str;
        String[] elements;
        int aux;
        int N = Integer.parseInt(in.readLine());

        while(N-- > 0){

            str = in.readLine();
            String[] str2 = str.split(" ");
            int M = Integer.parseInt(str2[0]);
            String[] keys = new String[M];
            Arrays.fill(keys, "");
            elements = in.readLine().split(" ");
            for (String element : elements) {
                aux = Integer.parseInt(element) % M;

                keys[aux] += " -> " + element;
            }
            for (int i = 0; i < M; i++) {
                out.println(i + keys[i] + " -> \\");
            }
            if (N != 0) {
                out.println();
            }

        }
        out.close();
    }

}