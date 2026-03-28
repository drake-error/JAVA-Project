//METHOD OVERLOADING OR FUNCTION OVERLOADING
import java.util.Scanner;

public class hardq1{

    void display()
    {
        System.out.println("one");
    }
    void display(int a)
    {
      System.out.println("two");  
    }

    public static void main(String[] args)
    {
        hardq1 obj1 = new hardq1();
        obj1.display(67);
    }
}