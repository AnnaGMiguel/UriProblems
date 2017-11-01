import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1277 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str,aux,str2;
        int num;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){
            aux = null;
            int val = Integer.parseInt(in.readLine());
            int n=0;
            str = in.readLine();
            str2 = in.readLine();
            String[] aux1 = str.split(" ");
            String[] aux2 = str2.split(" ");
            String[] aux3 = new String[val];

            for (int j = 0; j < val; j++){
                int p = 0, m=0;
                aux = aux2[j];

                for(int k = 0; k < aux.length(); k++){
                    if(aux.charAt(k) == 'P'){
                        p++;
                    }
                    if(aux.charAt(k) == 'M'){
                        m++;
                    }

                }
                if(p < ((aux.length()-m)*0.75)) {
                    aux3[n] = aux1[j];
                    n++;
                }
            }

            for(int l =0;l < n; l++) {
                if(l == n-1) System.out.printf("%s", aux3[l]);
                else System.out.printf("%s ", aux3[l]);
            }
            System.out.printf("\n");
        }
    }
}
