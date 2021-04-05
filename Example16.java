import static java.lang.Math.*;

import java.util.Scanner;
import java.util.Random;

public class Example16{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int limit = 50;

        System.out.println("What age are you: ");
        int ageUser1 = scan.nextInt();

        int ageUser2 = rand.nextInt(limit);

        System.out.println("So you are: " + ageUser1);
        System.out.println("This is a random persons age: " + ageUser2);
 
        if(ageUser1 != ageUser2){
    
            System.out.println(Math.max(ageUser1, ageUser2));

            if(ageUser1 > ageUser2){

                System.out.println("Bro you more adolt then him. W");
            }else{

                System.out.println("GET THE DIPER, better luck next time! L");
            }
        
        }else {

            System.out.println("You are the same age WHATTTTT, It is a tie");
        }
    }
}
