import java.util.*;
class AlphabetOrNot{
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch= s.next().charAt(0);
        if (Character.isAlphabetic(ch))
         {
            System.out.println(ch + " is an alphabet.");
        } else 
        {
            System.out.println(ch+ " is not an alphabet.");
        }
    }
}