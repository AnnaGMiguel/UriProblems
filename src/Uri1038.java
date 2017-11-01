import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1038 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        int x,y;
        float t = 0;

        str = in.readLine();
        String[] str2 = str.split(" ");
        x = Integer.parseInt(str2[0]);
        y = Integer.parseInt(str2[1]);

        switch (x) {
            case 1:
                t = (float) (y * 4.00);
                break;
            case 2:
                t = (float) (y * 4.50);
                break;
            case 3:
                t = (float) (y * 5.00);
                break;
            case 4:
                t = (float) (y * 2.00);
                break;
            case 5:
                t = (float) (y * 1.50);
                break;
            default:
                break;

        }
        System.out.printf("Total: R$ %.2f\n", t);
    }
}
