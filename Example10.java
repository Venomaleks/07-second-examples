import static java.lang.Math.*;

import java.util.Scanner;

public class Example10{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the radeus of your circel");

        double y = scan.nextDouble();

        double a = 0;

         a=Math.PI*(Math.pow(y,y));
         
        System.out.println(a);

        System.out.println(Math.round(a));
    }
}