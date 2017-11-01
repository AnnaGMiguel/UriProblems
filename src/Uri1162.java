import java.io.*;

public class Uri1162 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(in.readLine());
        int L, swaps;
        String[] P;
        while (N-- > 0) {
            L = Integer.parseInt(in.readLine());
            int[] positions = new int[L];
            P = in.readLine().split(" ");
            for (int i = 0; i < L; i++) {
                positions[i] = Integer.parseInt(P[i]);
            }
            swaps = bubbleSort(positions);

            out.println("Optimal train swapping takes " + swaps + " swaps.");
        }
        out.close();

    }
    private static int bubbleSort(int[] array) {
        int totalSwaps = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int swaps = 0;

            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swaps++;
                    totalSwaps++;
                }
            }

            if (swaps == 0) {
                return totalSwaps;
            }
        }
        return totalSwaps;
    }
}
