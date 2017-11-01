import java.io.*;
import java.util.Arrays;

public class Uri1042 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String str;
        str = in.readLine();
        String[] str2 = str.split(" ");
        int aux[] = new int[str2.length];
        for(int i = 0; i< str2.length; i++){
            aux[i] = Integer.parseInt(str2[i]);
        }
        Arrays.sort(aux);
        for(int j = 0; j < aux.length; j++){
            out.printf("%d\n",aux[j]);
        }
        out.println();
        for(int j = 0; j < aux.length; j++) {
            out.printf("%s\n", str2[j]);
        }
        out.close();


    }
}
