import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Salary:");
        int salary = scan.nextInt();
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();

        if(salary>=20000 || age<25)
        {
            System.out.println("Eligible for loan");
            System.out.println("Enter Loan Amount:");
            int loan = scan.nextInt();

            if(loan<50000)
            {
                System.out.println("Loan Available");
            }
            else
            {
                System.out.println("Loan Not Available");
            }
        }
        else
        {
            System.out.println("No loan");
        }
    }
}