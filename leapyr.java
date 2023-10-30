import java.util.*;
public class leapyr
{
public static void main(String args[])
{
int yr,tot;
Scanner obj=new Scanner(System.in);
System.out.print("Enter a year:");
yr=obj.nextInt();
tot=yr%4;
if(tot==0)
{
 if(yr%100==0)
 {
 System.out.print("It is Century year");
 }
 else
 {
 System.out.print("It is not Century year");
 }
} 
else
{
 System.out.print("It is not a leap year");
}
}}