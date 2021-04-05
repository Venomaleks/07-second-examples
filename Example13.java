import java.util.Random;

public class Example13{

    public static void main(String[] args){

        Random rand = new Random();

        int limit = 10;

        int i = 0;

        for(int x = 0; x < 10; x++){

            i = rand.nextInt(limit);

            System.out.println(i);

        }
    }
}