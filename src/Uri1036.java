import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1036 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        double a,b,c,delta;


        str = in.readLine();
        String[] str2 = str.split(" ");
        a = Double.parseDouble(str2[0]);
        b = Double.parseDouble(str2[1]);
        c = Double.parseDouble(str2[2]);

        delta = (b*b)-(4*a*c);
        if(a == 0.0 || delta < 0.0){
            System.out.printf("Impossivel calcular\n");
        }
        else {
            double R1 = (-b+(Math.sqrt(delta)))/(2*a);
            double R2 = (-b-(Math.sqrt(delta)))/(2*a);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
