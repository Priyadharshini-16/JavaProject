import java.util.*;
public class table
{
public static void main(String args[])
{
int num,e;
Scanner sc=new Scanner(System.in);
System.out.print("Enter which number multiplication table:");
num=sc.nextInt();
System.out.print("Enter the end number:");
e=sc.nextInt();
for(int i=1;i<=e;++i)
{
  System.out.println(num+"*"+i+"="+num*i);
}
}
}