import java.util.Scanner;

public class Example04{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("can you tipe a word any but end whit (feal)? :");
        String word1 = scan.nextLine();

        if(word1.endsWith("feal")){

            System.out.println("nice you can follow instructions !");
        }else{

            System.out.println("HI BOMMER, dont care do yaaa XD !");
        }
 
    }
}