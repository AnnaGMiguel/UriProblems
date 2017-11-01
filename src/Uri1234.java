import java.io.*;

public class Uri1234 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String l;
        int count;
        while ((l = in.readLine()) != null) {
            String[] letters = l.split("");
            count = 0;
            for (String letter : letters) {
                if (letter.matches("\\w")) {
                    letter = count++ % 2 == 0 ? letter.toUpperCase() : letter.toLowerCase();
                }
                out.print(letter);
            }
            out.println();
        }
        out.close();
    }

}
