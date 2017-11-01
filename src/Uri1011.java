import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1011 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double R, V;


        R = Double.parseDouble(in.readLine());


        V = (4.0/3)*3.14159*(R*R*R);


        System.out.printf("VOLUME = %.3f\n", V);

    }
}
