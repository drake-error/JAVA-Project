// import java.util.Scanner;

// class q2 {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int num1 = scan.nextInt();
//         int num2 = scan.nextInt();

//         String result = (num1 > num2) ? (num1 + " is greater") :
//                         (num2 > num1) ? (num2 + " is greater") :
//                         "Both numbers are equal";

//         System.out.println(result);
//         scan.close();
//     }     
// }

// date-1/11/2025
// Function Parameters

public class q2 {

    void sum(int num1, int num2)

    {
        System.out.println((num1 + num2));
    }

    void subtract(int num1, int num2)
    {
        System.out.println((num1 - num2));
    }

    void multiply(int num1, int num2)
    {
        System.out.println((num1 * num2));
    }

    void divide(int num1, int num2)
    {
        System.out.println((num1 / num2));
    }

    public static void main(String[] args) 
    {
        q2 obj = new q2();
        obj.sum(10,2);
        obj.subtract(10,2);
        obj.multiply(10,2);
        obj.divide(10,2);
    }
}