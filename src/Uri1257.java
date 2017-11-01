import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1257 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str = null;
        int num;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++){
            int val = Integer.parseInt(in.readLine());
            int n=0;

            for (int j = 0; j < val; j++){

                str = in.readLine();
                for(int k = 0; k < str.length(); k++){

                    n += (str.charAt(k) - 'A');
                    n += j;
                    n += k;
                }
            }

            System.out.printf("%d\n",n);
        }
    }
}
