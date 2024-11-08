import java.util.*;
class Factorial
{
 public static void main(String args[])
 {
  int i=1,n,sum=1;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a number:");
  n=s.nextInt();
  while(i<=n)
  { 
   sum=sum*i;
   i++;
   }
   System.out.println("the factorial value is:"+sum);
}
}
