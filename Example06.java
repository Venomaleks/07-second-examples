import java.util.Random;

public class Example06{

    public static void main(String[] args){

        int i = 0;

        Random rand = new Random();

        int limit = 10;

        do{

            int x = rand.nextInt(limit);

            System.out.println(x);


            i++;

        }while(i <= 10);
 
    }
}