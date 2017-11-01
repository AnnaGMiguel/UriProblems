import java.io.*;
import java.util.Stack;

public class Uri1062 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        PrintWriter out = new PrintWriter(System.out);

        String l;
        String[] coaches;
        int N, current, coach;
        boolean firstTest = true;
        while (!(l = in.readLine()).equals("0")) {
            N = Integer.parseInt(l);
            if (firstTest) {
                firstTest = false;
            } else {
                out.println();
            }
            while (!(l = in.readLine()).equals("0")) {
                Stack<Integer> stack = new Stack<>();
                coaches = l.split(" ");
                current = 0;
                coach = Integer.parseInt(coaches[current]);
                for (int i = 1; i <= N; i++) {
                    stack.push(i);

                    while (!stack.isEmpty() && coach == stack.lastElement()) {
                        if (++current < N) {
                            coach = Integer.parseInt(coaches[current]);
                        }
                        stack.pop();
                    }
                }
                out.println(stack.isEmpty() ? "Yes" : "No");
            }
        }
        out.println();
        out.close();

    }
}
