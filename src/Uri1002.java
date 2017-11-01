import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1002 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double A, R;

        R = Double.parseDouble(in.readLine());

        A = 3.14159*(R*R);

        System.out.printf("A=%.4f\n", A);

    }
}
