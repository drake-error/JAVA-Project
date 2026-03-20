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
        for(int j=1;j<=3;j=j+1)
        {
            for(int i=1;i<=j;i=i+1)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
