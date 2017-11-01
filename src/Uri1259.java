import java.io.*;
import java.util.Arrays;

public class Uri1259 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);


        int N = Integer.parseInt(in.readLine());
        int[] num = new int[N];
        int[] aux = new int[N];
        int[] aux2 = new int[N];
        int j =0; int k =0;
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(in.readLine());
            if(num[i]%2 == 0){
                aux[j++] = num[i];
            }else{
                aux2[k++] = num[i];
            }

        }
        Arrays.sort(aux,0,j);
        Arrays.sort(aux2,0,k);
        for(int i = 0; i < j; i++){ out.println(aux[i]);}
        for(int i = k-1; i >= 0; i--){ out.println(aux2[i]);}
        out.close();
    }

}
