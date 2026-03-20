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