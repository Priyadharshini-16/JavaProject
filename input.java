import java.util.*;
public class input
{
public static void main(String agrs[])
{
int card,pin;
String username;

Scanner obj=new Scanner(System.in);
System.out.print("Enter the username:");
username=obj.nextLine();
System.out.println("Enter Card no:");
card=obj.nextInt();
System.out.println("Enter your card pin:");
pin=obj.nextInt();

if((card == 12345 && pin == 0000) ||(username=="user"))
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
}
}
