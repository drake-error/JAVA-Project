// import java.util.Scanner;

// class hi {
//     public static void main(String args[])
//     {
//         // Create a Variable called num
//         // Find out whether num is divisible by 2 or not

//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         if(num%2==0)
//         {
//             System.out.print("Even");
//         }
//         else
//         {
//             System.out.print("Odd");
//         }
        
//     }

// }

import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

public class hi{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if(n%2==1)
        {
            System.out.print("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
            System.out.print("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20)
        {
            System.out.print("Weird");
        }
        else if(n%2==0 && n>20)
        {
            System.out.print("Not Weird");
        }
    }
}