class Addition
{
 int a=100;
 void demo()
 {
  int a=200;
  System.out.println("The value in instance:"+this.a);
  System.out.println("The value in local is:"+a);
  }
}
class Main
{
  public static void main(String args[])
  {
   Addition a=new Addition();
   a.demo();
   }
}