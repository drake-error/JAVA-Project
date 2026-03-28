//METHOD OVERLOADING OR FUNCTION OVERLOADING
import java.util.Scanner;

public class hardq1{

    void sum(int a,int b)// fn name and parameter cant be same
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)//fn name can be same
    {
      System.out.println(a+b);  
    }

    public static void main(String[] args)
    {
        hardq1 obj1 = new hardq1();
        obj1.sum(67,10);
        obj1.sum(12,23,31); // if fn and parameter is same , obj1 gets confused and throws error ---> this is called METHOD/FN OVERLOADING
  
    }
}