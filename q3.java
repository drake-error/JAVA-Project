// import java.util.Scanner;
// import java.util.Random;

// class q3 {
//     public static void main(String [] args)
//     {
//         Scanner scan = new Scanner(System.in);
//         int count =0;
//         do {
//             System.out.println("Enter a number>10:");
//             count = scan.nextInt();
//         }while(count <=10); 

//     }
// }

// public class q3 {
//     // class called garden not q3

//     int apple_price  = 20;
//     int apple_count = 5;

//     void total_money()
//     {
//         System.out.println(apple_price * apple_count);
//     }

//     public static void main(String[] args) 
//     {
//         q3 obj = new q3();
//         obj.total_money();
//     }
// }

// import java.util.Scanner;

// public class q3 {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int income = scan.nextInt();

//         if(income>7000)
//         {
//             System.out.print("Eligible for Scholarship");
//         }
//         else{
//             System.out.print("Not Eligible for Scholarship");
//     }
// }
// }

// import java.util.Scanner;

// public class q3 {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();

//         if(num%3==0 && num%5==0)
//         {
//             System.out.print("Number is divisible by 3 and 5");
//         }
//         else{
//             System.out.print("Number is not divisible by 3 and 5");
//         }
//     }
// }

import java.util.Scanner;

public class q3{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s1 = scan.nextLine();
        int x = scan.nextInt();
        scan.nextLine();

        String s2 = scan.nextLine();
        int y = scan.nextInt();
        scan.nextLine();

        String s3 = scan.nextLine();
        int z = scan.nextInt(); 

        System.out.println("======================");


        System.out.printf("%-15s%03d%n" , s1 ,x);
        System.out.printf("%-15s%03d%n" , s2 , y);
        System.out.printf("%-15s%03d%n" , s3 , z);

        System.out.printf("======================");
    }
}