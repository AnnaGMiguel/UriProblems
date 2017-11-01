import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1006 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        double A, B, C, M;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());

        M = (A*2 + B*3 + C*5) / 10;

        System.out.printf("MEDIA = %.1f\n", M);

    }
}
