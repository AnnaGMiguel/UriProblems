import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1021 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int[] n = {100,50,20,10,5,2};
        int[] m = {100,50,25,10,5,1};
        double V;
        int q = 0;

        V = Double.parseDouble(in.readLine());

        System.out.printf("NOTAS:\n");
        for (int i =0; i< n.length;i++){
            q =(int) V/n[i];
            System.out.printf("%d nota(s) de R$ %d.00\n", q, n[i]);
            V -= q*n[i];
        }
        V = V*100;
        System.out.printf("MOEDAS:\n");
        for (int i =0; i< m.length;i++){
            q = (int)V/m[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", q, m[i]/100.0);
            V -= q*m[i];
        }
    }
}
