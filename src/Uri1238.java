import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1238 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str,s1;
        int num, a,b;


        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){

            str = in.readLine();
            String[] str2 = str.split(" ");
            String aux1 = str2[0];
            String aux2 = str2[1];
            a =0;
            b = 0;
            a = aux1.length() + aux2.length();
            if(aux1.length() > aux2.length()){
                b = aux2.length();
                s1 = aux1;

            }
            else{
                b = aux1.length();
                s1 = aux2;
            }

            char[] aux = new char[a];
            int k = 0;
            for (int j = 0; j < b; j++){

                aux[k] = aux1.charAt(j);
                aux[k+1] = aux2.charAt(j);
                k+=2;

            }
            for(int l = k; l < a; l++){

                aux[l] = s1.charAt(b);
                b++;
            }
            System.out.printf("%s\n", String.valueOf(aux));

        }

    }
}
