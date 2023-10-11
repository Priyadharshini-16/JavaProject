import java.util.*;
public class largest 
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter First number:");
a=sc.nextInt();
System.out.print("Enter Second number :");
b=sc.nextInt();
System.out.print("Enter Third number:");
c=sc.nextInt();
if(a>b && a>c)
{
System.out.print("A is greater"+a);
}
else if(b>c)
{
System.out.print("B is greater"+b);
}
else
{
System.out.print("C is greater"+c);
}
}
}