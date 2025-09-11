import java.util.*;

class q2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double marks = scan.nextDouble();
        String department = scan.next(); 
        System.out.print("My Name is "+name);
        System.out.print("\nMy Marks is "+marks/10 +"/10");
        System.out.print("\nMy Department is "+department);
    }
}