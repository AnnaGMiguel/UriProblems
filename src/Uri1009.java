import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1009 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String Name;
        double Sal,Sol, T;

        Name = in.readLine();
        Sal = Double.parseDouble(in.readLine());
        Sol = Double.parseDouble(in.readLine());

        T = Sal+(Sol*0.15);


        System.out.printf("TOTAL = R$ %.2f\n", T);

    }
}
