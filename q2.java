// // import java.util.Scanner;

// // class q2 {
// //     public static void main(String args[])
// //     {
// //         Scanner scan = new Scanner(System.in);
// //         int num1 = scan.nextInt();
// //         int num2 = scan.nextInt();

// //         String result = (num1 > num2) ? (num1 + " is greater") :
// //                         (num2 > num1) ? (num2 + " is greater") :
// //                         "Both numbers are equal";

// //         System.out.println(result);
// //         scan.close();
// //     }     
// // }

// // date-1/11/2025
// // Function Parameters

// learnt Function Parameters and created functions for arithmetic operations

// import java.util.Scanner;

// public class q2 {
//     public static void main(String argd[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();
//         int d = a*b*c;
//         int e = a+b+c;
//         System.out.print(d/e);

//     }
// }

import java.util.Scanner;

// class q2 {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.nextLine();
//         double score = scan.nextDouble();
//         scan.nextLine();
//         String department = scan.nextLine();
//         System.out.println("My Name is "+name);
//         System.out.println("My Score is "+score/10 +"/10");
//         System.out.print("My department is "+department);
//     }
// }

public class q2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String Meghana = scan.nextLine();

        if(Meghana.equals("Dead"))

        {
            System.out.print("Surya meets ramya");
        }
        else{
            System.out.print("Surya weds meghana");
        }
        scan.close();
    }
}