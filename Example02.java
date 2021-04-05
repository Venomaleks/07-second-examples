import java.util.Scanner;

public class Example02{

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("can you tipe a word any? :");
    String word1 = scan.nextLine();

    System.out.println("can you do it agen but diffrent? :");
    String word2 = scan.nextLine();

    System.out.println(word1 + "\t" + word2);

    int x = word1.length();
    int y = word2.length();

    System.out.println( x + "\t" + y);


    /** // look on bothe lengths if equals in int valuse

        if(x == y){

            System.out.println("Waooo same length " + word1 + "\t" + word2);
        }else{

            System.out.println("Goood m8 not same dao: " + word1 + "\t" + word2);
        }
        */

    /** */ // look at if thay exakt same

        if(word1.equals(word2)){

            System.out.println("words are equal");
        }else{

            System.out.println("words are NOT equal");
        }

    }
}