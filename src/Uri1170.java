import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1170 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int num, dia;
        float a;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){

            a = Float.parseFloat(in.readLine());
            dia = 0;
            while(true){
                if(a <= 1) break;
                a = (a/2);
                dia++;
            }
            System.out.printf("%d dias\n", dia);
        }
    }
}
