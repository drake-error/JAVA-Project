// import java.util.Random;
// class whileloop{
//     public static void main(String[] args)
//     {
//         int j=1;
//         while(j<=10)
//         {
//             System.out.println(j);
//             j=j+1;
//         }

//     }
// }

//GENERATE A RANDOM NUMBER UNTIL NUMBER IS 5
// import java.util.Random;
// class whileloop {
//     public static void main(String[] args)
//     {
//         Random rand = new Random();
//         int newnum = 0;

//         while(newnum!=5)
//         {
//             newnum = rand.nextInt(11);
//             System.out.println(newnum);
//         }
//     }
// }

//DO-WHILE LOOP QUESTIONS:

// class whileloop{
//     public static void main(String[] args)
//     {
//         int count = 0;
//         do{
//             System.out.println("JHON");
//             count=count+1;
//         }while(count<=1);
//     }
// }

import java.util.Scanner;
import java.util.Random;

class whileloop{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        do{
            System.out.println("Enter The num > 10:"); // WHATEVER HAPPENS INSIDE DO WILL ALWAYS GET PRINTED IF COND IS TRUE OR FALSE
            count = scan.nextInt();
        }while(count<10); //IN DO-WHILE , THE WHILE LOOP COND SHLD WORK TO PRINT I/P STREAM WHILE READS BACKWARD!! 
    }
}
