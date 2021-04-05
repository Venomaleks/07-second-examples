import java.util.Random;
import java.util.Arrays;

public class Example12{

    public static void main(String[] args){

        Random rand = new Random();

        boolean [] arrBool = new boolean[10];

        int a = 0;
        int b = 0;

        for(int x = 0; x < arrBool.length; x++){

            arrBool[x] = rand.nextBoolean();
            
            System.out.println(arrBool[x]);

            if(arrBool[x] == true){
                a++;
            } else{
                b++;
            }
        }
        
        System.out.println("haw meany belives: " + a);
        System.out.println("haw meany dissbelives: " + b);

    }
}