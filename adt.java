import java.util.*;
public class adt
{
public static void main(String args[])
{
int num=0,res=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
num=sc.nextInt();
for(int i=1;i<num;i++)
{
res=res+i;
System.out.println("Addition:"+res);
}
}
}