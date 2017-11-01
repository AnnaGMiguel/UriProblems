import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1871 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String valor, str;
        int n, m;

        str = in.readLine();
        String[] str2 = str.split(" ");
        n = Integer.parseInt(str2[0]);
        m = Integer.parseInt(str2[1]);

        while(true) {
            if (m == 0 && n == 0) break;
            valor = Integer.toString(m + n);

            for(int j = 0; j < valor.length(); j++){

                if(valor.charAt(j) == '0'){
                    valor = valor.replaceAll("0","");

                }
            }
            System.out.printf("%s\n", String.valueOf(valor));

            str = in.readLine();
            str2 = str.split(" ");
            n = Integer.parseInt(str2[0]);
            m = Integer.parseInt(str2[1]);
        }
    }

}
