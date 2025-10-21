import java.util.Scanner;
class array {
    public static void main(String args[])
    { 
        //Get input for size of an array
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];

        for (int i = 0; i <= size-1; i=i+1)
        {
            marks[i] = scan.nextInt();
        }
    }
}
