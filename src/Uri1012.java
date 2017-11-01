import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1012 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        double A,B,C, Tr, Q,Tra,Cir,R;

        str = in.readLine();
        String[] aux = str.split(" ");
        A = Double.parseDouble(aux[0]);
        B =Double.parseDouble(aux[1]);
        C = Double.parseDouble(aux[2]);

        Tr = (A*C)/2;
        Cir = 3.14159*(C*C);
        Tra = ((A+B)/2)*C;
        Q = B*B;
        R = A*B;


        System.out.printf("TRIANGULO: %.3f\n", Tr);
        System.out.printf("CIRCULO: %.3f\n", Cir);
        System.out.printf("TRAPEZIO: %.3f\n", Tra);
        System.out.printf("QUADRADO: %.3f\n", Q);
        System.out.printf("RETANGULO: %.3f\n", R);

    }
}
