// public class hotel {
    
//     int coffee = 20;
//     int tea = 10;


//     public static void main(String[] args) 
//     {
//         //Creating an object of hotel class
//         hotel Server1 = new hotel();

//         System.out.println(Server1.coffee);

//         hotel Server2 = new hotel();
//         System.out.println(Server2.tea);
//     }
// }

public class laptop {
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;

    public static void main(String[] args)
    {
        laptop lap1 = new laptop();
        
        lap1.name = "Dell";
        lap1.proc = "i5";
        lap1.ram = 6;
        lap1.price = 40000;

        laptop lap2 = new laptop();
        lap2.name = "Acer";
        lap2.proc = "i7";
        lap2.ram = 8;
        lap2.price = 80000;
        System.out.println(lap2.price);

        laptop lap3 = new laptop();
        lap3.price = 90000;
        System.out.println(lap3.price);

    }
}


    
   