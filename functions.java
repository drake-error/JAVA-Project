// public class functions{
//     int a = 10;
//     int b = 20;

//     void sum()
//     {
//         System.out.println(a+b);
//     }

//     public static void main(String[] args)
//     {
//         functions obj1 = new functions(); //to create object syntax is class_name object_name = new class_name();
//         obj1.sum();
//     }
// } 

// public class functions{
//     // class called garden not FUNCTIONS

//     int apple_price  = 20;
//     int apple_count = 5;

//     void total_money()
//     {
//         System.out.println(apple_price * apple_count);
//     }

//     public static void main(String[] args) 
//     {
//         functions obj = new functions(); // CREATIN OBJECT SYNTAX: CLASS_NAME OBJECT_NAME = NEW CLASS_NAME();
//         obj.total_money();
//     }
// } 

// Return Keywords
// void can never return a value
//WITH VARIABLE UR SENDING INFORMATION IS CALLED  FUNCTIONS WIT PARAMETERS

// public class functions {
//     // class called Store not fn

//     int getsoap(int money) // int money = 20
//     {
//         int soap_price = 18;
//         int rem = 20-18;
//         return rem; // rem=2;
//     }

//     public static void main(String[] args)  //ALWAYS PROGRAM STARTS FROM MAIN fn
//     {
//         functions obj = new functions(); //creating object for fn
//         int remainder = obj.getsoap(20); //using object we get all data inside call , from here call goes for int getsoap().ur SENDING 20 GETS STORED IN INT MONEY
//         System.out.println(remainder); // RETURN KEYWORD EXPLAINED
//     }
// } 

// public class functions{

//     void sum(int num1, int num2)

//     {
//         System.out.println((num1 + num2));
//     }

//     void subtract(int num1, int num2)
//     {
//         System.out.println((num1 - num2));
//     }

//     void multiply(int num1, int num2)
//     {
//         System.out.println((num1 * num2));
//     }

//     void divide(int num1, int num2)
//     {
//         System.out.println((num1 / num2));
//     }

//     public static void main(String[] args) 
//     {
//         functions obj = new functions();
//         obj.sum(10,2);
//         obj.subtract(10,2);
//         obj.multiply(10,2);
//         obj.divide(10,2);
//     }
// }

import java.util.Scanner;
public class functions {
    // Class is called FIND not fn
    void evenorodd(int num)
    {
        if(num%2==0)
        {
        System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();
        functions obj1 = new functions();
        obj1.evenorodd(num1);

    }

}