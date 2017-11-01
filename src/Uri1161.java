import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Uri1161 {
    
    
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        BigInteger soma, fac, fac1;
        String str;
        str = in.readLine();String[] str2 = str.split(" ");
        BigInteger aux = BigInteger.valueOf(Integer.parseInt(str2[0]));
        BigInteger aux1 = BigInteger.valueOf(Integer.parseInt(str2[1]));


        while(true){

            fac = factorial(aux);
            fac1 = factorial(aux1);
            soma = fac.add(fac1);

            System.out.printf("%d\n",soma);

            str = in.readLine();
            if(str  == null) break;
            str2 = str.split(" ");
            aux = BigInteger.valueOf(Integer.parseInt(str2[0]));
            aux1 = BigInteger.valueOf(Integer.parseInt(str2[1]));
            soma = BigInteger.valueOf(0);
            fac = BigInteger.valueOf(0);
            fac1 = BigInteger.valueOf(0);
        }

    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }


}

