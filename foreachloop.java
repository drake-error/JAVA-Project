import java.util.Scanner;

public class foreachloop {
    public static void main(String[] args)
    {
        int num[]= {12,45,67,89};  //WHENEVER WE USE ARRAY INSTEAD OF USING FOR LOOP WITH THIS DIFFICULT, WE CAAN USE FOR-EACH LOOP

        for(int i=0;i<4;i++) 
        {
            System.out.println(num[i]); //WE WANT TO PRINT NUMBERS IN ARRAY THATS ALL.
        }
        for(int var:num) // numbers stored in array is integer(int) created a name variable(var) nd name of array declared is num
        {
            System.out.println(var);
        } /* what happens here is: num is the array inside ARRAY THERE IS 12,45,67,89 
        SO WHAT FOR-EACH LOOP DOES IS INSIDE ARRAY THERE IS 4 NUMBERS SO IN DEFAULT FOR-EACH LOOP RUNS 4TIMES
        WHEN IT RUNS FIRST TIME INSIDE VAR 12 WILL GET STORED , IN 2ND RUN INSIDE VAR=45 GETS STORED ,
        RD RUN VAR=67 AND IN FINAL 4TH RUN VAR=89 */ //ghgh
    }
}