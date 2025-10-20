class ifelse {
    public static void main(String[] args) {
         int evencount=0;
       for(int i=1; i<=10; i=i+1)
       {
        // print even numbers only
        if(i%2==0)
        {
            evencount = evencount+1; 
        }
       }

       System.out.println(evencount);

          
    }
}