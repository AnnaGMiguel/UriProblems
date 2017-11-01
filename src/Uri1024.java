import java.io.*;

public class Uri1024 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine()), half, length;
        char[] M;
        char t;
        while (N-- > 0) {
            M = in.readLine().toCharArray();
            length = M.length;
            half = length / 2;
            for (int i = 0; i < length; i++) {
                if (Character.isLetter(M[i])) {
                    M[i] = (char) ((int) M[i] + 3);
                }
            }
            for (int i = 0; i < half; i++) {
                t = M[i];
                M[i] = M[M.length - i - 1];
                M[M.length - i - 1] = t;
            }
            for (int i = (half); i < length; ++i) {
                M[i] = (char) ((int) M[i] - 1);
            }
            for (char Mi : M) {
                out.print(Mi);
            }
            out.println();
        }
        out.close();
    }
}
