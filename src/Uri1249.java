import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1249 {
    public static void main(String[] args) throws IOException {

       System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        str = in.readLine();
        char[] aux = new char[str.length()];
        while(true) {

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);
                if ((c >= 65 && c <= 77) || (c >= 97 && c <= 109)) {
                    c += 13;
                } else if ((c >= 78 && c <= 90) || (c >= 110 && c <= 122)) {
                    c -= 13;
                }
                aux[i] = c;
            }

            for (int j =0; j< aux.length;j++) {
                System.out.printf("%s", aux[j]);
            }
            System.out.printf("\n");

            str = in.readLine();
            if(str == null) break;
            aux = new char[str.length()];

        }

    }
}
