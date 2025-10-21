import java.util.Scanner;
import java.util.Random;

class q3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int count =0;
        do {
            System.out.println("Enter a number>10:");
            count = scan.nextInt();
        }while(count <=10); 

    }
}