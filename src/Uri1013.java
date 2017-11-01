import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1013 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        int A,B,C,R;

        str = in.readLine();
        String[] aux = str.split(" ");
        A = Integer.parseInt(aux[0]);
        B = Integer.parseInt(aux[1]);
        C = Integer.parseInt(aux[2]);

        R = (A+B+(Math.abs(A-B)))/2;

        R = (R+C+(Math.abs(R-C)))/2;

        System.out.printf("%d eh o maior\n", R);

    }
}
