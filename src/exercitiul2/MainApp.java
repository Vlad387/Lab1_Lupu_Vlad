package exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("src/exercitiul2/in.txt"));
        PrintWriter out = new PrintWriter("src/exercitiul2/out.txt");
        int suma=0, n=0;
        int minim= Integer.MAX_VALUE;
        int maxim=Integer.MIN_VALUE;

        while(scanner.hasNextInt())
        {
            int x= scanner.nextInt();
            suma=suma+x;
            n++;
            if(x<minim)
            {
                minim=x;
            }
            if(x>maxim)
            {
                maxim=x;
            }
        }
        double media=(double) suma / n;

        System.out.println("Suma = "+suma);
        System.out.println("Media = "+media);
        System.out.println("Minim = "+minim);
        System.out.println("Maxim = "+maxim );

        out.println("Suma = " + suma );
        out.println("Media = "+ media);
        out.println("Minim = "+ minim);
        out.println("Maxim = "+maxim);

        scanner.close();
        out.close();




    }
}
