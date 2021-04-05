import java.util.Scanner;

public class Example01{

    public static void main(String[] args){

        System.out.print("What your name ma, M8?? :");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println("your name is: " + name);
 
        System.out.println(name.length());
    }
}