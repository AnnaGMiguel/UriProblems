import java.io.*;

public class Uri1043 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        double A,B,C,AREA,PER;
        String[] E;

        E = in.readLine().split(" ");

        A = Double.parseDouble(E[0]);
        B = Double.parseDouble(E[1]);
        C = Double.parseDouble(E[2]);

        if((A > (B - C) && A < (B + C))&& (B > (A - C) && B < (A + C)) &&
        (C > (B - A) && C < (B + A))){
            PER = A+B+C;
            out.printf("Perimetro = %.1f\n",PER);
        }
        else{
            AREA = ((A+B)*C)/2;
            out.printf("Area = %.1f\n",AREA);

        }
        out.close();
    }

}
