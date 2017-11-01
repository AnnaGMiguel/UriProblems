import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Uri1068 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        str = in.readLine();
        int aux;
        while(true) {
            aux =0;
            Stack stack = new Stack();
            for (int i = 0; i < str.length(); i++) {

                stack.push(str.charAt(i));
                if (str.charAt(i) == '(' || str.charAt(i) == ')') {
                    aux++;
                }
            }
            if(str.charAt(0) == ')' || str.charAt(str.length()-1) == '('){
                System.out.printf("incorrect\n");
            }
           else if(aux%2 == 0) {
                for (int j = 0; j < str.length();j++){
                    if((char)stack.pop() == ')' && (char)stack.lastElement() =='(') {
                        System.out.printf("incorrect\n");
                        break;
                    }
                }
                if(stack.empty()) {
                    System.out.printf("correct\n");
                }
            }else{
                System.out.printf("incorrect\n");
            }
            str = in.readLine();
            if(str == null) break;

        }

    }
}
