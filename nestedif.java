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

import java.util.Scanner;

public class nestedif{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if(score<50)
        {
            System.out.print("YOU NEED TO IMPROVE");
        }
        else if(score>=50 && score<=70)
        {
            System.out.print("Good Job!");
        }
        else if(score>70)
        {
            System.out.print("Excellent performance");
        }
    }
}
