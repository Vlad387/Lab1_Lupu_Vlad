package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int nrDivizori= 0;

        System.out.println("Divizorii sunt: ");

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i + " ");
                nrDivizori++;
            }
        }
        if (nrDivizori==2)
        {
            System.out.println("\nNumarul este prim.");
        }
    }
}
