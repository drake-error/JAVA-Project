// class nestedif {
//     public static void main(String args[])
//     {
//         boolean kfc = true;
//         boolean chicken = true;
//         boolean pepsi = true;

//         if(kfc==true)
//         {
//             System.out.println("Enter into KFC");

//            if(chicken==true)
//            {
//             System.out.println("Eating chciken");
//            if(pepsi==true)
//           {
//             System.out.println("Drinking pepsi");
//           }
//            }
//         }

//     }
// }

// import java.util.Scanner;

// public class nestedif{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int score = scan.nextInt();

//         if(score<50)
//         {
//             System.out.print("YOU NEED TO IMPROVE"); // input is 50 hence false
//         }
//         else if(score>=50 && score<=70)
//         {
//             System.out.print("Good Job!");// prints good job bcz input is 50 and condition mentioned for score>=50 matches with it 
//         }
//         else if(score>70)
//         {
//             System.out.print("Excellent performance"); // never executes in else-if
//         }
//     }
// }
import java.util.Scanner;

public class nestedif {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2= scan.nextInt();
        int s3= scan.nextInt();
        int s4= scan.nextInt();
        int s5= scan.nextInt();
        int average = (s1+s2+s3+s4+s5)/5;

        if(average<35)
        {
            System.out.print("Additional Classes required");
        }
        else{
            System.out.print("You are good to go");
        }
        scan.close();
    }
}