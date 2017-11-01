import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1581 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

       String aux = null, aux1 = null;
        int num, n;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){
            n =0;
            int val = Integer.parseInt(in.readLine());
            String[] str = new String[val];
            for (int j = 0; j < val; j++){
                    str[j] = in.readLine();
                    aux1 = str[j];
            }
            for(int k = 0; k < str.length; k++){
                if(str[k].equals(aux1)){
                    n++;
                    aux = str[k];
                }
            }

            if(n != val) System.out.printf("ingles\n");
            else System.out.printf("%s\n",aux);
        }
    }
}
