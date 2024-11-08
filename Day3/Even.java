import java.util.*;
class Even 
{
 public static void main(String args[])
 {
  int i=1;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a number:");
  do
  {
   if(i%2==0)
   {
    System.out.println(i);
   }
   i++;
   }while(i<=5);
}
}
