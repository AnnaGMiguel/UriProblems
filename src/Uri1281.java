import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Uri1281 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String aux, aux1;
        String[] quant;
        Map<String,Double> map =new HashMap<>();
        int num, n, m;
        Double soma =0.0;
        num = Integer.parseInt(in.readLine());
        while(num-- > 0){

            n = Integer.parseInt(in.readLine());
            for (int i =0;i <n;i++){
                aux =in.readLine();
                String[] aux2 =new String[aux.length()];
                aux2 = aux.split(" ");
                map.put(aux2[0],Double.parseDouble(aux2[1]));
            }

            m = Integer.parseInt(in.readLine());
            quant = new String[m];
            for (int j =0;j <m;j++){
                aux1 =in.readLine();
                String[] aux3 =new String[aux1.length()];
                aux3 = aux1.split(" ");
                quant[j] = aux3[1];
                soma += map.put(aux3[0],Double.parseDouble(aux3[1]))*Integer.parseInt(quant[j]);
            }

            out.printf("R$ %.2f\n",soma);
            soma=0.0;
        }
        out.close();

    }


}
