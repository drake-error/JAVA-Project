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
import java.util.Random;
class whileloop {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int newnum = 0;

        while(newnum!=5)
        {
            newnum = rand.nextInt(11);
            System.out.println(newnum);
        }
    }
}