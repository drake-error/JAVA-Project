public class functions{
    int a = 10;
    int b = 20;

    void sum()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        functions obj1 = new functions(); //to create object syntax is class_name object_name = new class_name();
        obj1.sum();
    }
}