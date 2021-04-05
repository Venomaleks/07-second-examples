import java.util.Scanner;

public class Example05{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("can you tipe a word any but start whit (Rafa)? :");
        String word1 = scan.nextLine();

        if(word1.startsWith("Rafa")){

            System.out.println("nice you can follow instructions !");
        }else{

            System.out.println("HI BOMMER, dont care do yaaa XD !");
        }
 
    }
}