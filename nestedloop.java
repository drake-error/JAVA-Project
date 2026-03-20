// class nestedloop {
//     public static void main(String[] args)
//     {
//         for(int i=1;i<=2;i=i+1)
//         {
//             for(int count=1;count<=2;count = count +1)
//             {
//                 System.out.println("Darwin");
//             }
//         }
//     }
//

class nestedloop{
    public static void main(String[] args)
    {
        for(int j=1;j<=3;j=j+1) //STEP 0: LOOP j: J=1 , cond gets TRUE and goes into BRANCH LOOP
        {
            for(int i=1;i<=j;i=i+1) //LOOP I: STEP 1:   i=1 , 1<=1(TRUE) prints *
            //STEP 2: i=1+1=2 , 2<=1(j) COND(FALSE) LOOP BREAKS GOES TO LOOP j
            //IN LOOP J Goes for j=j+1 i.e. j=1+1=2 (Latest value of J is 1 acc to STEP 0) ,2<=3(TRUE)
            //STEP 3: i=1 , 1<=2(TRUE) prints *
            //STEP 4: i=1+1=2 , 2<=2(TRUE) prints ** (IF PRINTLN WAS THERE THEN IT WOULD HV PRINTED * 
                                                                                                //  * )
                                                                                                //AGAIN LOOP BREAKS AND FOLLOWS STEP 0.
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
