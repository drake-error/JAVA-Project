// import java.util.Scanner;

// public class forloop {
//     public static void main(String args[])
//     {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("Enter Number 1:");
//         int a = scan.nextInt();
//         System.out.println("Enter Number 2:");
//         int b = scan.nextInt();

//         for(int i =a; i<=b ; i=i+1)
//         {
//             System.out.println(i);
//         }
        
//     }
// }

import java.util.Scanner;

public class forloop {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int Oddcount = 0; //oddcount declared outside loop as 0
        for( int i=1 ; i<=10 ; i=i+1) // this loop prints 1 to 10
        {
            //print only even number as given in q 
        
        if(i%2==0) // in step 1 : i=1 , i<=10 therefore goes to if condition 1 divided by 2 is not 0 so in else oddcount becomes 1 (as 0+1=1)
        {          // step 2 : it goes for last loop statement where i=i+1 takes latest i value so i=1+1=2 goes for if con 2 div 2 = 0 hence prints 2
            System.out.println(i); // step 3 : goes for i=i+1 i.e i=2+1=3 goes for if(false) so checks else oddcount is now 1 fromstep 1 hence oddcount = 1+1=2
        }     // step 4: goes for i=i+1 i.e i=3+1=4 if(4%2==0) true HENCE PRINTS i which is 4
              // step 5 again goes for i=i=1 i.e i=4+1=5 if(False) hence goes for else Oddcount = latest_oddcountValue + 1 i.e oddcount = 2+1=3;
        else
        {
            Oddcount=Oddcount+1;
        }
        
    }
    System.out.println("Oddcount:"+Oddcount); // Prints Final oddcount value AFTER LOOP BREAKS 
}
}