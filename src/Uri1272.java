import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1272 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str,aux;
        String aux2;//aux3;
        int num;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){
            aux = null;
            aux2 = null;
            int k = 0;
            str = in.readLine().trim();
            String[] str2 = str.split(" ");
            String[] aux3 = new String[str2.length];

            for (int j =0; j < str2.length; j++){

                if(str2[j].equals("")) {
                    aux2= " ";

                }
                else{
                    aux = str2[j];
                    aux3[k] = aux.substring(0,1);
                    k++;
                }

            }
            if(aux == null) { System.out.printf("%s\n", aux2);}
            else {
                for(int l = 0; l< k; l++){
                    System.out.printf("%s", aux3[l]);
                }
                System.out.printf("\n");
            }

        }
    }
}
