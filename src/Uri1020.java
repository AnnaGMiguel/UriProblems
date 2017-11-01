import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1020 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int Ad, a = 0,m = 0,d = 0;

        Ad = Integer.parseInt(in.readLine());

        while (true){
            if(Ad == 0) break;

            if (Ad >= 365){
                Ad -= 365;
                a++;
            }else if(Ad >= 30 && Ad < 365){
                Ad -= 30;
                m++;
            }else if(Ad >= 1 && Ad < 30){
                Ad --;
                d++;
            }

        }

        System.out.printf("%d ano(s)\n",a);
        System.out.printf("%d mes(es)\n",m);
        System.out.printf("%d dia(s)\n",d);

    }
}
