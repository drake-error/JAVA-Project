import java.util.Scanner;
class demo {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();  

        if (income>70000)
        {
            System.out.print("Scholarship is available");
        }
        else
        {
            System.out.print("not eligible for scholarship");
        } 
        
        
    }
    
}

      