import java.util.*;
class LeapYear
{
  public static void main(String args[])
   {
     int year;
     System.out.println("enter a year");
     Scanner sc=new Scanner(System.in);
     year=sc.nextInt();
     if((year%4==0)&&(year%100!=0)||(year%400==0))
       {
        System.out.println("Given year is a leap year");
        }
     else
     {
       System.out.println("given year is a non-leap year");
     }
  
   }
}