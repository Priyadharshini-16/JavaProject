import java.util.*;
public class factsum
{
public static void main(String args[])
{
int i,n,mulsum=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter first numer:");
i=obj.nextInt();
System.out.println("Enter End numer:");
n=obj.nextInt();
	while(i<=n)
	{
		if(i==n)
		{
			if(i%2==1)
			{
				mulsum=mulsum+i;
			System.out.print(i+"=");
			}
			else
			{
				mulsum=mulsum*i;
			System.out.print(i+"=");
			}
		}
		else
		{
			if(i%2==1)
			{
			mulsum=mulsum+i;
			System.out.print(i+"*");
			}
			else
			{
			System.out.print(i+"+");
			mulsum=mulsum*i;
			}
		}
		//mul=mul*i;
	i++;
	}
System.out.print(mulsum);
}
}