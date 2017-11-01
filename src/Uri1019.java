import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1019 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);


        int Ts, h = 0,m = 0,s = 0;

        Ts = Integer.parseInt(in.readLine());

        while (true){
            if(Ts == 0) break;

            if (Ts >= 3600){
                Ts -= 3600;
                h++;
            }else if(Ts >= 60 && Ts < 3600){
                Ts -= 60;
                m++;
            }else if(Ts >= 1 && Ts < 60){
                Ts --;
                s++;
            }

        }

        System.out.printf("%d:%d:%d\n",h,m,s);

    }
}
