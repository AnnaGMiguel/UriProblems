import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Uri1258 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine());
        Tshirt[] tshirts;
        Tshirt tshirt;
        int n =0;
        while(true) {
            if (N == 0) break;
            if (n == 0) {
                n ++;
            } else {
                out.println();
            }
            tshirts = new Tshirt[N];
            for (int i = 0; i < N; i++) {
                String name = in.readLine();
                String aux = in.readLine();
                String[] str = aux.split(" ");
                String color = str[0];
                String size = str[1];
                tshirt = new Tshirt(size, color, name);
                tshirts[i] = tshirt;

            }
            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                @Override
                public int compare(Tshirt t1, Tshirt t2) {
                    String color1 = t1.getColor();
                    String color2 = t2.getColor();
                    int d = color1.compareTo(color2);
                    if (d != 0) {
                        return d;
                    } else {
                        String s1 = t1.getSize();
                        String s2 = t2.getSize();
                        if (s1.equals(s2)) {
                            return t1.getOwner().compareTo(t2.getOwner());
                        }
                        if (s1.equals("P") && s2.equals("M") || s1.equals("P") && s2.equals("G") || s1.equals("M") && s2.equals("G")) {
                            return -1;
                        }
                        return 1;
                    }
                }
            });
            for (Tshirt t : tshirts) {
                out.println(t);
            }

            N = Integer.parseInt(in.readLine());

        }
        out.close();
    }
}
class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
