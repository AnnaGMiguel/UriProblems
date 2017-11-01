import java.io.*;
import java.util.Arrays;


public class Uri1251 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = 0, c, j, tam, i, contador, tamFinal;
        int[][] m;
        int[] v;
        String str;
        str = in.readLine();
        while (true) {

            if (n == 0) {
                n++;
            } else {
                out.println();
            }
            c = 0;
            m = new int[str.length()][2];
            v = new int[str.length()];
            for (int k = 0; k < str.length(); k++) {
                c = str.charAt(k);
                if (c >= 32 && c < 128) {
                    v[k] = c;
                }
            }
            Arrays.sort(v);
            tam = v.length;
            tamFinal = tam;
            j = 0;
            for (i = 0; i < tam; i++) {
                contador = 1;
                if(i == (tam-1)){
                    m[j][0] = v[i];
                    m[j][1] = contador;
                    break;
                }
                while (v[i] == v[i+1]) {
                    i++;
                    contador++;
                    tamFinal--;
                    if(i == (tam-1)) break;
                }
                m[j][0] = v[i];
                m[j][1] = contador;
                j++;
            }

            Selection_Sort_Matriz(tamFinal, m);
            Order_Sort_Biggest(tamFinal,m);

            for (i = 0; i < tamFinal; i++) {
                out.printf("%d %d\n", m[i][0], m[i][1]);
            }
            str = in.readLine();
            if (str == null) break;
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

    static void Order_Sort_Biggest(int n, int v[][]) {
        int i, j, aux, aux1, maiorAscii;
        for (i = 0; i < n; i++) {
            maiorAscii = i;
            for (j = i+1; j < n; j++){
                if (v[j][1] == v[maiorAscii][1]){
                    if (v[j][0] > v[maiorAscii][0]){
                        aux = v[maiorAscii][1];
                        v[maiorAscii][1] = v[j][1];
                        v[j][1] = aux;
                        aux1 = v[maiorAscii][0];
                        v[maiorAscii][0] = v[j][0];
                        v[j][0] = aux1;

                    }
                }

            }
        }

    }
}
