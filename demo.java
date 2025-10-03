import java.util.Scanner;
class demo {
    public static void main(String[] args) 
    {
        // Cricket or Football = Play
        // true or true = true (play)
        // true or false = true (play)
        // false or true = true (play)
        // false or false = false (do not play)

        boolean Cricket = false;
        boolean Football = false;

        if(Cricket || Football)
        {
            System.out.println("Play");
        }
        else
        {
            System.out.println("Do not Play");
        }
        
        
    }
    
}

      