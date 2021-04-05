import static java.lang.Math.*;

import java.util.Scanner;


public class Example14{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What number in degrees you want to find out in radius: ");

        double x = scan.nextDouble();


        System.out.println(x);
        System.out.println(Math.toRadians(x));

    }
}