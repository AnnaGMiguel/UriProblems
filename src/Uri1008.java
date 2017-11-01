import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1008 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int A, B;
        float C;
        double S;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Float.parseFloat(in.readLine());

        S = (B*C);

        System.out.printf("NUMBER = %d\n", A);

        System.out.printf("SALARY = U$ %.2f\n", S);

    }
}
