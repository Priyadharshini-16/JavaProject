import java.util.*;
public class pyrname
{
public static void main(String args[])
{
String sname;
Scanner obj=new Scanner(System.in);
System.out.print(" Enter a name:");
sname=obj.nextLine();
int n=sname.length();
//System.out.println(n);
for(int i=0;i<n;i++)
	{
	for(int j=0;j<=i;j++)
	{
	System.out.print(sname.charAt(j));
	}
	System.out.println(" ");
}
}
}