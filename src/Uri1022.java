import java.io.*;

public class Uri1022 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        PrintWriter out = new PrintWriter(System.out);

        String str;
        char aux;
        int num, n1,d1,n2,d2,mdc;
        int  n, d;
        num = Integer.parseInt(in.readLine());
        n=0;d=0;
        for (int i = 0; i < num; i++) {

            str = in.readLine();
            String[] str2 = str.split(" ");
            n1 = Integer.parseInt(str2[0]);
            d1 = Integer.parseInt(str2[2]);
            aux = str2[3].charAt(0);
            n2 = Integer.parseInt(str2[4]);
            d2 = Integer.parseInt(str2[6]);

            if (aux == '+'){
                n = ((n1*d2)+(n2*d1));
                d = (d1*d2);
                mdc = Math.abs(Mdc(n,d));
                n1 = n/mdc;
                d1 =d/mdc;

            }else if(aux == '-'){
                n = ((n1*d2)-(n2*d1));
                d = (d1*d2);
                mdc = Math.abs(Mdc(n,d));
                n1 = n/mdc;
                d1 =d/mdc;

            }else if(aux == '*'){
                n = ((n1*n2));
                d = (d1*d2);
                mdc = Math.abs(Mdc(n,d));
                n1 = n/mdc;
                d1 =d/mdc;

            }else if(aux == '/'){
                n = ((n1*d2));
                d = (d1*n2);
                mdc = Math.abs(Mdc(n,d));
                n1 = n/mdc;
                d1 =d/mdc;

            }
            out.printf("%d/%d = %d/%d\n",n,d,n1,d1);

        }
        out.close();

    }

    public static int Mdc(int f1,int f2){
        int mdc = 0;
        while(f2 !=0) {
            mdc = f2;
            f2 = f1 % f2;
            f1 = mdc;
        }
        return f1;

    }
}
