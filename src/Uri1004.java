import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1004 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int A, B, prod;

        A= Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());

        prod = A * B;

        System.out.printf("PROD = %d\n", prod);

    }
}
