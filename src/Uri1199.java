import java.io.*;

public class Uri1199 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s;
        int N;
        while (true) {
            s = in.readLine();
            if (s.matches("0x.*")) {
                s = s.substring(2);
                out.println(Integer.parseInt(s, 16));
            } else {
                N = Integer.parseInt(s);
                if (N < 0) {
                    break;
                } else {
                    out.println("0x" + Integer.toString(N, 16).toUpperCase());
                }
            }
        }
        out.close();
    }
}
