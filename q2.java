import java.util.Scanner;

class q2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        String result = (num1 > num2) ? (num1 + " is greater") :
                        (num2 > num1) ? (num2 + " is greater") :
                        "Both numbers are equal";

        System.out.println(result);
        scan.close();
    }     
}