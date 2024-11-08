import java.util.Scanner;
class Student
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int stdno;
     String stdname;
     int maths;
     int chemistry;
     int physics;
     System.out.println("Enter stdno:");
     stdno=sc.nextInt();
     System.out.println("Enter stdname:");
     stdname=sc.next();
     System.out.println("Enter Math marks:");
     maths=sc.nextInt();
     System.out.println("Enter chemistry marks:");
     chemistry=sc.nextInt();
     System.out.println("Enter physics marks:");
     physics=sc.nextInt();
     int total=maths+chemistry+physics;
     float avg=total/3;
     System.out.println("the total marks:"+total);
     System.out.println("the avg marks:"+avg);
     System.out.println("The Student No is:"+stdno); 
     System.out.println("The Student Name is:"+stdname);
     System.out.println("The Student  Math Marks is:"+maths);
     System.out.println("The Student  Physics Marks is:"+chemistry);
     System.out.println("The Student  Computer Marks is:"+physics);
   }
}
