import java.io.*;
import java.util.Arrays;

public class Uri1548 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n, c;
        int m[];
        String str;
        n = Integer.parseInt(in.readLine());

        while(n-- !=0){

            c = Integer.parseInt(in.readLine());
            m = new int[c];
            str = in.readLine();
            String[] str1 = str.split(" ");
            for(int i =0; i< c; i++){
                m[i] = Integer.parseInt(str1[i]);
            }
            Arrays.sort(m);
            int a=0;
            for(int i =0; i< m.length/2; i++){
                int temp = m[i];
                m[i] = m[m.length-i-1];
                m[m.length-i-1] = temp;
            }
            for(int i =0; i< c; i++){
                if(Integer.parseInt(str1[i]) == m[i]){
                    a++;
                }
            }
            out.println(a);

        }
        out.close();
    }
}
