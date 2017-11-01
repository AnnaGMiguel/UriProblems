import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1873 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        int num, a;


        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){

            str = in.readLine();
            String[] str2 = str.split(" ");
            String aux1 = str2[0];
            String aux2 = str2[1];

            if(aux1.equals(aux2)){
                System.out.printf("empate\n");

            }else if((aux1.equals("tesoura") && aux2.equals("papel")) || (aux1.equals("papel") && aux2.equals("pedra")) || (aux1.equals("lagarto") && aux2.equals("papel"))||
                    (aux1.equals("pedra") && aux2.equals("tesoura")) || (aux1.equals("lagarto") && aux2.equals("spock")) || (aux1.equals("spock") && aux2.equals("tesoura")) ||
                    (aux1.equals("spock") && aux2.equals("pedra")) || (aux1.equals("papel") && aux2.equals("spock")) || (aux1.equals("pedra") && aux2.equals("lagarto")) ||
                    (aux1.equals("tesoura") && aux2.equals("lagarto"))){
                System.out.printf("rajesh\n");

            }else{
                System.out.printf("sheldon\n");
            }

        }
    }
}
