// class ifelse {
//     public static void main(String[] args) {
//          int evencount=0;
//        for(int i=1; i<=10; i=i+1)
//        {
//         // print even numbers only
//         if(i%2==0)
//         {
//             evencount = evencount+1; 
//         }
//        }

//        System.out.println(evencount);

          
//     }
// }

import java.util.Scanner;

class ifelse {
    public static void main(String args[])
    {
        String f1 = new String("apple");
        String f2 = new String("apple"); // different address

        String a1 = "orange";
        String a2 = "orange"; //same address

        System.out.println(f1.equals(f2)); // reads the content
        System.out.println(f1==f2);
        System.out.println(a1==a2);
    }
}