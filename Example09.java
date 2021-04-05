import static java.lang.Math.*;

import java.util.Scanner;

public class Example09{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("tipe a number");

        int y = scan.nextInt();

        System.out.println("tipe a nather one");
        int x = scan.nextInt();

        System.out.println(Math.pow(x, y));
 
    }
}