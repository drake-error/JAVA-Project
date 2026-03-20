// public class functions{
//     int a = 10;
//     int b = 20;

//     void sum()
//     {
//         System.out.println(a+b);
//     }

//     public static void main(String[] args)
//     {
//         functions obj1 = new functions(); //to create object syntax is class_name object_name = new class_name();
//         obj1.sum();
//     }
// } 

public class functions{
    // class called garden not FUNCTIONS

    int apple_price  = 20;
    int apple_count = 5;

    void total_money()
    {
        System.out.println(apple_price * apple_count);
    }

    public static void main(String[] args) 
    {
        functions obj = new functions(); // CREATIN OBJECT SYNTAX: CLASS_NAME OBJECT_NAME = NEW CLASS_NAME();
        obj.total_money();
    }
}