import java.io.*;

public class Uri1253 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        PrintWriter out = new PrintWriter(System.out);

        String str;
        int n = Integer.parseInt(in.readLine());
        str = in.readLine();
        int num = Integer.parseInt(in.readLine());
        char[] aux = new char[str.length()];
        while(true) {

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);
                aux[i] = (char) (c-num);
                if(aux[i] < 65 ){
                    aux[i] += 26;
                }

            }

            for (int j =0; j< aux.length;j++) {

                out.printf("%s", aux[j]);
            }
            out.printf("\n");
            n--;
            if(n ==0) break;
            str = in.readLine();
            num = Integer.parseInt(in.readLine());
            aux = new char[str.length()];

        }
        out.close();
    }
}
