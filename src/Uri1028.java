import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1028 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        int num, mdc;

        num = Integer.parseInt(in.readLine());

        for (int i = 0; i < num; i++) {

            str = in.readLine();
            String[] str2 = str.split(" ");
            int f1 = Integer.parseInt(str2[0]);
            int f2 = Integer.parseInt(str2[1]);
            mdc = 0;
            while(f2 !=0){
                mdc = f2;
                f2=f1%f2;
                f1 = mdc;
            }
            System.out.printf("%d\n",f1);
        }

    }
}
