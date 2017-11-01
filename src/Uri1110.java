import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Uri1110 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue1 = new LinkedList<Integer>();
        int num;
        num = Integer.parseInt(in.readLine());

        while(true){

            for(int i = 1; i <= num; i++){
                queue.add(i);
            }
            out.write("Discarded cards:");
            if(queue.size() == 1) out.newLine();

            while(queue.size() > 1 ) {
                queue1.add(queue.remove());
                queue.add(queue.remove());
                if (queue.size() == 1) {
                    out.write(", "+queue1.remove());
                    out.newLine();
                } else if(queue.size() == num-1){
                    out.write(" "+queue1.remove());
                }else{
                    out.write(", "+queue1.remove());
                }
            }
            if(queue.size() != 0) {
                out.write("Remaining card: "+ queue.remove());
                out.newLine();
                out.flush();
            }
            num = Integer.parseInt(in.readLine());
            if(num == 0) break;

        }

    }
}
