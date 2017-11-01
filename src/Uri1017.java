import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1017 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int D, T;
        double L;


        T = Integer.parseInt(in.readLine());
        D = Integer.parseInt(in.readLine());

        L = (T*D)/12.0;


        System.out.printf("%.3f\n", L);

    }
}
