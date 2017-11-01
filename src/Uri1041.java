import java.io.*;

public class Uri1041 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] str = in.readLine().split(" ");
        double X = Double.parseDouble(str[0]);
        double Y = Double.parseDouble(str[1]);

        if(X== 0 && Y != 0){
            out.printf("Eixo Y\n");
        }else if(Y == 0 && X != 0){
            out.printf("Eixo X\n");
        }else if(X == 0 && Y == 0){
            out.printf("Origem\n");
        }else if(X > 0 && Y > 0){
            out.printf("Q1\n");
        }else if(X > 0 && Y < 0){
            out.printf("Q4\n");
        }else if(X < 0 && Y < 0){
            out.printf("Q3\n");
        }else if(X < 0 && Y > 0){
            out.printf("Q2\n");
        }
        out.close();
    }
}