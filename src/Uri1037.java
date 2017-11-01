import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1037 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double a;

        a = Double.parseDouble(in.readLine());

        if(a < 0.0 || a > 100.0){
            System.out.printf("Fora de intervalo\n");
        }
        else if(a >= 0.0 && a <= 25.0) {
            System.out.printf("Intervalo [0,25]\n");
        }else if(a > 25.0 && a <= 50.0 ) {
            System.out.printf("Intervalo (25,50]\n");
        }else if(a > 50.0 && a <= 75.0 ) {
            System.out.printf("Intervalo (50,75]\n");
        }else if(a > 75.0 && a <= 100.0 ) {
            System.out.printf("Intervalo (75,100]\n");
        }
    }
}
