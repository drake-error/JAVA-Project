import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();

        if(salary>20000 || age<25)
        {
            System.out.println("Eligible for loan");
            int loan = scan.nextInt();

            if(loan<500000)
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