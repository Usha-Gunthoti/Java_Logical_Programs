import java.util.*;
class For
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n;
  System.out.println("enter a number:");
  n=s.nextInt();
  for(int i=1;i<=10;i++)
  { 
   System.out.println(n+"x"+i+"="+i*n);
  }
}
}
