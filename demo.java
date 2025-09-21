import java.util.Scanner;
class demo {
    public static void main(String[] args) 
    {
        //Check whether Number 1 and Number 2 are equal or not

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 == num2)
        {
            System.out.println("Both the numbers are equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        
    }
    
}

      