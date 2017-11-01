import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Uri1244 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n;
        String[] str;

        n = Integer.parseInt(in.readLine());
        while(n-- !=0){
            str = in.readLine().split(" ");
            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.length() - s1.length();
                }
            });
            for (int i = 0; i < str.length; i++) {
                out.print(str[i]);
                if(i != str.length - 1 ) out.print(" ");
                else out.print("\n");
            }


        }
        out.close();
    }
}
