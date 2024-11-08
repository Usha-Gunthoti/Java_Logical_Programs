import java.util.Scanner;
class Product
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int productno;
      String pname;
      float pcost;
      float pquantity;
      System.out.println("Enter Productno:");
      productno=sc.nextInt();
      System.out.println("Enter Pname:");
      pname=sc.next();
      System.out.println("Enter Pcost:");
      pcost=sc.nextFloat();
      System.out.println("Enter Pquantity:");
      pquantity=sc.nextFloat();
      float bill=pcost*pquantity;
      System.out.println("The Total Bill is:"+bill);
      System.out.println("The Product No is:"+productno);
      System.out.println("The Product Name is:"+pname);
      System.out.println("The Product Cost is:"+pcost);
      System.out.println("The Product Quantity is:"+pquantity);
    }
}