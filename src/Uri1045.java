import java.io.*;

public class Uri1045 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        double A,B,C;
        String[] E;

        E = in.readLine().split(" ");

        A = Double.parseDouble(E[0]);
        B = Double.parseDouble(E[1]);
        C = Double.parseDouble(E[2]);

        if((A >= (B + C)) || (B >= (A + C)) || (C >= (B + A))){

            out.printf("NAO FORMA TRIANGULO\n");
        }
        else{
            if((A*A) == ((B*B)+(C*C)) || (B*B) == ((A*A)+(C*C)) || (C*C) == ((B*B)+(A*A))){
                out.printf("TRIANGULO RETANGULO\n");

            }else if ((A*A) > ((B*B)+(C*C)) || (B*B) > ((A*A)+(C*C)) || (C*C) > ((B*B)+(A*A))){
                out.printf("TRIANGULO OBTUSANGULO\n");
                if(A == B && B == C){
                    out.printf("TRIANGULO EQUILATERO\n");
                }else if(A == B || A == C || B == C){
                    out.printf("TRIANGULO ISOSCELES\n");
                }
            }else if ((A*A) < ((B*B)+(C*C)) || (B*B) < ((A*A)+(C*C)) || (C*C) < ((B*B)+(A*A))){
                out.printf("TRIANGULO ACUTANGULO\n");
                if(A == B && B == C){
                    out.printf("TRIANGULO EQUILATERO\n");
                }else if(A == B || A == C || B == C){
                    out.printf("TRIANGULO ISOSCELES\n");
                }
            }

        }
        out.close();
    }
}
