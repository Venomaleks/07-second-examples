import static java.lang.Math.*;

import java.util.Scanner;

public class Example15{

    public static void main(String[] args){

 
        Scanner scan = new Scanner(System.in);

        System.out.println("What number in radius you want to find out in degrees: ");

        double x = scan.nextDouble();

        System.out.println(x);

        System.out.println(Math.toDegrees(x));
 
    }
}