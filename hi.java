import java.util.Scanner;

class hi {
    public static void main(String args[])
    {
        // Create a Variable called num
        // Find out whether num is divisible by 2 or not

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
        
    }

}