import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Uri1040 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("input.txt"));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String str;
        double n1,n2,n3,n4,nota, media;

        str = in.readLine();
        String[] aux = str.split(" ");
        n1 = Double.parseDouble(aux[0]);
        n2 = Double.parseDouble(aux[1]);
        n3 = Double.parseDouble(aux[2]);
        n4 = Double.parseDouble(aux[3]);
        DecimalFormat df = new DecimalFormat("0.0");

        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10.0;

        System.out.printf("Media: "+df.format(media)+"\n");
        if(media >= 7.0){
            System.out.printf("Aluno aprovado.\n");
        }
        else if(media < 5.0){
            System.out.printf("Aluno reprovado.\n");
        }
        else if(media >= 5.0 && media < 7.0){
            System.out.printf("Aluno em exame.\n");
            nota = Double.parseDouble(in.readLine());
            System.out.printf("Nota do exame: "+nota+"\n");

            double media2;
            media2 = (media+nota)/2;

            if(media2 >= 5.0){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: "+df.format(media2)+"\n");
            }else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: "+df.format(media2)+"\n");
            }

        }

    }
}
