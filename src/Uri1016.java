import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1016 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int D, T;

        D = Integer.parseInt(in.readLine());

        T = D*2;


        System.out.printf("%d minutos\n", T);

    }
}
