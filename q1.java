// import java.util.Scanner;

// class q1 {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.nextLine();
//         int age = scan.nextInt();
//         scan.nextLine();
//         String address = scan.nextLine();
//         System.out.println("My name is "+ name);
//         System.out.println("My age is "+ age);
//         System.out.println("I live in "+ address);

//     }
// }

// Return Keywords
// void can never return a value

// public class q1 {

//     int getsoap(int money)
//     {
//         int soap_price = 18;
//         int rem = 20-18;
//         return rem;
//     }

//     public static void main(String[] args) 
//     {
//         q1 obj = new q1();
//         int remainder = obj.getsoap(20);
//         System.out.println(remainder);
//     }
// }
import java.util.Scanner;

class q1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt(); 
        scan.nextLine(); //WHY BCZ INT AFTER INPUT HAS BLANK SPACE AND IT CONSIDERS THIS BLANK SPACE AFTER INPUT AS CHARCATER AND DIRECTLT STORES IN ADDRESS, TO SOLVE WE CREATE EMPTYLINE TO STORE THIS EMPTY BLANK SPACE
        String address = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My Age is "+age);
        System.out.println("My Address is "+address);
    }
    
}