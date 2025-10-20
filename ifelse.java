class ifelse {
    public static void main(String[] args) {
        int oddcount =0;
       for(int i=1; i<=10; i=i+1)
       {
        // print even numbers only
        if(i%2==0)
        { 
         // System.out.println("Even Number:"+i);
        }
        else
        {
            oddcount = oddcount+1;
            //System.out.println("Odd Number:"+i);
            System.out.println(oddcount);
        }
       }
          
    }
}