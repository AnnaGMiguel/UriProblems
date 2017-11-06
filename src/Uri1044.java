import java.io.*;

public class Uri1044 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int A, B;
        String[] E;

        E = in.readLine().split(" ");

        A = Integer.parseInt(E[0]);
        B = Integer.parseInt(E[1]);

        if(A%B ==0 || B %A == 0){
            out.printf("Sao Multiplos\n");
        }
        else {
            out.printf("Nao sao Multiplos\n");
        }
        out.close();
    }
}
