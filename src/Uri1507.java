import java.io.*;

public class Uri1507 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n,n1,c;
        String str;
        String[] str2;
        int[] temp;
        n = Integer.parseInt(in.readLine());
        while (n-- > 0){
            str = in.readLine();
            n1 = Integer.parseInt(in.readLine());
            str2 = new String[n1];

            for(int i =0; i < n1; i++) {
                str2[i] = in.readLine();
                if (str.contains(str2[i])) {
                    out.println("Yes");
                } else {
                    int k =0; c=0;
                    temp = new int[str2[i].length()];
                    for (int j = 0; j < str.length(); j++) {
                        if(k < str2[i].length()) {
                            if ((str.charAt(j) == str2[i].charAt(k))) {
                                c++;
                                temp[k]=j;
                                k++;
                            }
                        }
                    }
                    for (int l=0;l<temp.length;l++){
                        if(c!=0 && (temp[l] > temp[temp.length-1-l] || temp[l] == temp[temp.length-1-l])){
                               out.println("No");
                               break;
                        }
                        else {
                            out.println("Yes");
                            break;
                        }
                    }
                }
            }
        }
        out.close();
    }
}
