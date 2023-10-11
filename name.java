import java.util.*;
public class name
{
public static void main(String args[])
{
String sname;
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name:");
sname=sc.nextLine();
n=sname.length()-1;
System.out.println(n);
for(int i=0;i<=n;i++)
{
if(i!=n)
{
System.out.print(sname.charAt(i)+"*");
}
else
{
System.out.print(sname.charAt(i));
}
}
}
}