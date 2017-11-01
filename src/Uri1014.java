import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1014 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int D;
        float C;
        double S;

        D = Integer.parseInt(in.readLine());
        C = Float.parseFloat(in.readLine());

        S = (D/C);


        System.out.printf("%.3f km/l\n", S);

    }
}
