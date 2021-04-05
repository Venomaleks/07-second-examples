import java.util.Scanner;

public class Example03{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("can you tipe a word any? :");
        String word1 = scan.nextLine();
    
        System.out.println("can you do it agen but diffrent? :");
        String word2 = scan.nextLine();
    
        System.out.println(word1 + "\t" + word2);
 
        if(word1.equalsIgnoreCase(word2)){

            System.out.println("words are equal");
        }else{

            System.out.println("words are NOT equal");
        }

    }
}