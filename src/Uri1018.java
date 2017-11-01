import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1018 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int V, aux, i = 0,j = 0,k = 0,
                l = 0,m = 0,n = 0,o = 0;

        V = Integer.parseInt(in.readLine());
        aux = V;
        while(true){
            if(aux == 0) break;

            if(aux >= 100){
                aux -= 100;
                i++;
            }else if(50 <= aux && aux < 100){
                aux -= 50;
                j++;
            }else if(20 <= aux && aux < 50){
                aux -= 20;
                k++;
            }else if(10 <= aux && aux < 20){
                aux -= 10;
                l++;
            }else if(5 <= aux && aux < 10){
                aux -= 5;
                m++;
            }else if(2 <= aux && aux < 5){
                aux -= 2;
                n++;
            }else if(1 <= aux && aux != 0){
                aux -= 1;
                o++;
            }

        }

        System.out.printf("%d\n", V);
        System.out.printf("%d nota(s) de R$ 100,00\n", i);
        System.out.printf("%d nota(s) de R$ 50,00\n", j);
        System.out.printf("%d nota(s) de R$ 20,00\n", k);
        System.out.printf("%d nota(s) de R$ 10,00\n", l);
        System.out.printf("%d nota(s) de R$ 5,00\n", m);
        System.out.printf("%d nota(s) de R$ 2,00\n", n);
        System.out.printf("%d nota(s) de R$ 1,00\n", o);

    }
}
