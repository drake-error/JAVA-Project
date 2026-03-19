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
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5]; // declaring an array type integer which has 5 positions starting from 0

        for(int i=0; i<=4;i=i+1) // in loop: step 1: i=0 & 0<=4(cond is TRUE) so goes inside braces where i=0
        {
            marks[i]= scan.nextInt(); // marks[0] = askin i/p in terminal
        } //again goes for loop and starts from i=i=1 i.e. i=0+1 , 1<=0(True) goes inside braces i.e. marks[1] = askin i/p in terminal
//loop continues till i=4 and askin i/p for marks in position 5 i.e. marks[5]. all our i/p Numbers gets stored inside ARRAY BOXES
        for(int i=0; i<=4;i=i+1) //follows same loop and prints numbers INSIDE BOXES AT THOSE POSITIONS
        {
            System.out.println(marks[i]);
        }
    }
}
