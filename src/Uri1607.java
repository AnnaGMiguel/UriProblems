import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1607 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        int num, operations, aux;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){
            operations = 0;
            aux = 0;
            str = in.readLine();
            String[] str2 = str.split(" ");
            String aux1 = str2[0];
            String aux2 = str2[1];

            for (int j =0; j < aux1.length(); j++){

                aux = (aux2.charAt(j)-aux1.charAt(j));
                if(aux < 0){
                    operations += aux+26;
                }
                else{
                    operations += aux;
                }
            }

            System.out.printf("%d\n", operations);

        }
    }
}
