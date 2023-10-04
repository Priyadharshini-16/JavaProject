import java.util.*;
public class tomorrow
{
public static void main(String args[])
{
String a="TOMORROW";
int count=0;
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)=='O')
{
count++;
for(int j=0;j<count;j++)
{
System.out.print("*");
}
}
else 
{
System.out.print(a.charAt(i));
}
}
}
}