import java.util.*;
class Biggest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter first number: ");
      int a=sc.nextInt();
    System.out.println("enter second number: ");
     int b=sc.nextInt();
      System.out.println("enter third number: ");
        int c=sc.nextInt();
    System.out.println("enter fourth number: ");
     int d=sc.nextInt();
     if(a>b)
      {
          if(a>c)
            {
              if(a>d)
               {
                   System.out.println("a is big");
               }
     else
     {
         System.out.println("d is big");
      }
  }
}
     else if(b>c)
      {
        if(b>d)
         {
            System.out.println("b is big");
        }
      else
         {
              System.out.println("d is big");
        }
      }
 else if(c>d)
    {
    System.out.println("c is big");
   }
    else 
    {
      System.out.println("d is big");
     }
   }
}
     
                  