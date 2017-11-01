import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Uri1063 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int a,d;
        String b,c;
        a = Integer.parseInt(in.readLine());
        while(a != 0) {
            d = 0;
            b = in.readLine();
            c = in.readLine();
            b = b.replaceAll(" ","");
            c = c.replaceAll(" ","");
            Stack pilha = new Stack();

            for (int i = 0; i < a; i++) {
                pilha.push(b.charAt(i));
                System.out.printf("I");
                while (pilha.size() > 0 && c.charAt(d) == (char) pilha.lastElement()) {
                    d++;
                    pilha.pop();
                    System.out.printf("R");
                }
            }
            System.out.println(pilha.size() > 0 ? " Impossible" : "");
            a = Integer.parseInt(in.readLine());
        }

    }

}