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


//Understanding Classes and Objects
// public class laptop {
//     String name = "";
//     String proc = "";
//     int ram = 0;
//     int price = 0;

//     public static void main(String[] args)
//     {
//         laptop lap1 = new laptop();
        
//         lap1.name = "Dell";
//         lap1.proc = "i5";
//         lap1.ram = 6;
//         lap1.price = 40000;

//         laptop lap2 = new laptop();
//         lap2.name = "Acer";
//         lap2.proc = "i7";
//         lap2.ram = 8;
//         lap2.price = 80000;
//         System.out.println(lap2.price);

//         laptop lap3 = new laptop();
//         lap3.price = 90000;
//         System.out.println(lap3.price);

//     }
// }

// Practicing Functions and Methods
public class hotel 
 { void greeting()
//  greeting is a function here
{
    System.out.println("Welcome to our hotel!");
    dummy();
} 

void dummy()
// calling a function inside another function i.e. greeting calling dummy
{
    System.out.println("This is a dummy function");
}


public static void main(String[] args) 
// where there is main from there code execution starts
{
    hotel myHotel = new hotel();
    
    // Creating an object of hotel class
    myHotel.greeting();
    
}
 }
//  if there is () after the name then it is a function or method
// if object is not created then function will not be executed bcz non static cant acess static void
    
   