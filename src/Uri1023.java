import java.io.*;

public class Uri1023 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n, x, y,c = 0, aux =0 ;
        int[] v1;
        int[] v2;
        int[][] m;
        double a,b;
        n = Integer.parseInt(in.readLine());
        String[] str;
        while (true) {
            if (n == 0) break;
            if (c == 0) {
                c++;
            } else {
                out.println();
            }
            m = new int[n][2];
            aux++;
            a =0.0; b=0.0;
            v1 =new int[n];
            v2 = new int[n];
            for (int i = 0; i < n; i++) {
                str = in.readLine().split(" ");
                x = Integer.parseInt(str[0]);
                y = Integer.parseInt(str[1]);
                a += x;
                b += y;
                v1[i] = x;
                v2[i]= y/x;

            }
            int tamFinal = n, aux1 =0;

            for (int i = 0; i < n; i++) {
                aux1 = v1[i];
                for (int j = i+1; j < n; j++) {
                    if (v2[i] == v2[j]) {
                      // tamFinal--;
                       aux1 += v1[j];
                       //v1[j] = v1[j+1];
                    }
                }
                m[i][0] = aux1;
                m[i][1] = v2[i];

            }
            Selection_Sort_Matriz(tamFinal,m);
            out.printf("Cidade# %d:\n",aux);
            for (int i =0; i < tamFinal-1; i++){
                out.printf("%d-%d ",m[i][0],m[i][1]);
            }
            out.printf("%d-%d",m[tamFinal-1][0],m[tamFinal-1][1]);
            out.printf("\n");
            out.printf("Consumo medio: %.2f m3.\n",b/a);
            n = Integer.parseInt(in.readLine());

        }
        out.close();

    }
    static void Selection_Sort_Matriz(int n, int v[][]) {
        int i, j, min, aux,aux1;

        for (i = 0; i < n; i++) {

            min = i;
            for (j = i+1; j < n; j++) {
                if(v[j][1] < v[min][1]) {
                    aux = v[min][1];
                    v[min][1] = v[j][1];
                    v[j][1] = aux;
                    aux1 = v[min][0];
                    v[min][0] = v[j][0];
                    v[j][0] = aux1;
                }
            }

        }

    }
}
