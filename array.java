// import java.util.Scanner;
// import java.util.Random;
// class array {
//     public static void main(String args[])
//     { 
//        Random rand = new Random();
//        int newnum = 0;

//        while (newnum != 5)
//        {
//            newnum = rand.nextInt(11);
//            System.out.println(newnum);
//        }
//     }

// }

// import java.util.Scanner;

// public class array {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter your salary:");
//         int Salary = scan.nextInt();
//         System.out.print("Enter Your age:");
//         int age = scan.nextInt();
        

//         if(Salary>=20000 || age<=25)
//         {
//             System.out.print("Enter Loan Amount:");
//             int loan = scan.nextInt();             

//             if(loan<=50000)
//             {
//                 System.out.print("Your are eligible for loan");
//             }
                 
//               else if(loan>=50000)
//               {
//                 System.out.print("Maximum loan Amount is 50000");
//             }
//          }

//         else
//         {
//             System.out.print("Not Eligible for Amount");
//         }
//     }
// }

//proper strcture for IF-LOOP GOES LIKE 
// if (Salary >= 20000 || age <= 25) { // Layer 1: The "Entrance"
    
//     // Everything in here only happens if Layer 1 is TRUE
//     int loan = scan.nextInt();

//     if (loan <= 50000) { // Layer 2: Choice A
//         System.out.print("Eligible");
//     } // <--- This brace finishes Choice A
//     else if (loan > 50000) { // Layer 2: Choice B
//         System.out.print("Too high");
//     } // <--- This brace finishes Choice B

// } // <--- This brace finishes Layer 1

import java.util.Scanner;

class array {
    public static void main(String[] args)
    {
        int[] num = new int[3];
        Scanner scan = new Scanner(System.in);

        num[0]= scan.nextInt();
        num[1]= scan.nextInt();
        num[2]= scan.nextInt();

        System.out.println(num[0]+num[1]+num[2]);
    }
}