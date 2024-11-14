import java.util.*;
class Addition
{
   int a,b,c;
   void add(int x,int y)
   {
      a=x;
      b=y;
      c=a+b;
      System.out.println("The Addition value is:"+c);
    }
}
class Main
{
    public static void main(String args[])
    {
       Addition a1=new Addition();
       a1.add(100,370);
     }
}