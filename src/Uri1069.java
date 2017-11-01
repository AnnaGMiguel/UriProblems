import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1069 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int num = Integer.parseInt(in.readLine());
        int a,b;
        while(true) {
            if(num == 0) break;
            a=0;
            b=0;
            String str = in.readLine();
            for(int i = 0; i< str.length();i++){
                if(str.charAt(i) == '<'){
                    a++;
                }else if(str.charAt(i) =='>'){
                    if(a > 0){
                        a--;
                        b++;
                    }
                }
            }
            System.out.printf("%d\n",b);
            num--;
        }


    }
}
