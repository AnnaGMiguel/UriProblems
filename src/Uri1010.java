import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1010 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str,str2;
        int C1, U1,C2,U2;
        float P1,P2;
        double T;

        str = in.readLine();
        String[] aux1 = str.split(" ");
        str2 = in.readLine();
        String[] aux2 = str2.split(" ");


        C1 = Integer.parseInt(aux1[0]);
        U1 = Integer.parseInt(aux1[1]);
        P1 = Float.parseFloat(aux1[2]);
        C2 = Integer.parseInt(aux2[0]);
        U2 = Integer.parseInt(aux2[1]);
        P2 = Float.parseFloat(aux2[2]);

        T = (U1*P1)+(U2*P2);


        System.out.printf("VALOR A PAGAR: R$ %.2f\n", T);

    }
}
