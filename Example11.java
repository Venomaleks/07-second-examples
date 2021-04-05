import static java.lang.Math.*;

import java.util.Random;
import java.util.Arrays;

public class Example11{

    public static void main(String[] args){

       
        int arr [] = new int[30];

        Random rand = new Random();

        int limit = 10;

        int i = 0;

        
        for(int x = 0; x < arr.length; x++){

            int y = rand.nextInt(limit);

            arr[x] = y;

            if (arr[x] == 5){

                i++;
            }
        }
        
        System.out.println("haw meany 5 are in array: " + i);

        System.out.println(Arrays.toString(arr));

    }
}