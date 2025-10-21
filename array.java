import java.util.Scanner;
import java.util.Random;
class array {
    public static void main(String args[])
    { 
       Random rand = new Random();
       int newnum = 0;

       while (newnum != 5)
       {
           newnum = rand.nextInt(11);
           System.out.println(newnum);
       }
    }

}
