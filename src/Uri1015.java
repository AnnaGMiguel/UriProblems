import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1015 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str,str2;

        double X1,X2,Y1,Y2, D;

        str = in.readLine();
        String[] aux1 = str.split(" ");
        str2 = in.readLine();
        String[] aux2 = str2.split(" ");


        X1 = Double.parseDouble(aux1[0]);
        Y1 = Double.parseDouble(aux1[1]);
        X2 = Double.parseDouble(aux2[0]);
        Y2 = Double.parseDouble(aux2[1]);


        D = Math.sqrt(Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2));


        System.out.printf("%.4f\n", D);

    }

}
