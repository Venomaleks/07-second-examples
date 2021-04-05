import java.util.Random;

public class Example07{

    public static void main(String[] args){

        Random rand = new Random();

        int limit = 10;

        int sum = 0;

        for(int i = 0; i < 10; i++){

            int x = rand.nextInt(limit);

            System.out.println(x + "\t" + sum);

            sum = sum + x;

        }
 
        System.out.println(sum);
 
    }
}