import java.util.Scanner;
class array {
    public static void main(String args[])
    { 
        Scanner Scan = new Scanner(System.in);
        int[] Numbers = new int[5];

        for (int i=0; i<=4; i=i+1)
        {
            Numbers[i] = Scan.nextInt();
        }

        for (int i=0; i<=4; i=i+1)
        {
            System.out.println(Numbers[i]);
        }

    }
}
