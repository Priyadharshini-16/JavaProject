import java.util.*;
public class cap1
{
public static void main(String args[])
{
String n,dup;
int a,s,card=0,pin=0,cnt=0,card1,pin1,cnt1=0;
Scanner sc=new Scanner(System.in);
	while(cnt<1)
	{
	System.out.print("Do you want to login as? ");
	System.out.println("1-Admin 2-Customer 3-Exit");
	a=sc.nextInt();
		if(a==2)
		{
			if(card==0)
			{	
			 System.out.println("Please Enter the Customer details in Admin Login ");
			}
			else
			{
				while(cnt1<2)
				{
				System.out.println("Enter your Card No:");
				card1=sc.nextInt();
				System.out.println("Enter your Card Pin No:");
				pin1=sc.nextInt();
				if(card==card1 && pin==pin1)
				{
					System.out.println("Valid user");
					cnt++;
					
					break;
				}
				else
				{
					System.out.println("Invalid user");
					cnt1++;
					if(cnt==3)
					{
					System.out.println("Account Locked");
					//cnt++;
					break;
					}
				}
				}
			}
		}
		else if(a==1)
		{
			dup=sc.nextLine();
			System.out.println("Enter Customer Name:");
			n=sc.nextLine();
			System.out.println("Enter your Account Number:");
			s=sc.nextInt();
			System.out.println("Enter your Card No:");
			card=sc.nextInt();
			System.out.println("Enter your Card Pin No:");
			pin=sc.nextInt();
			System.out.println("Details are updated Successfully!");
			//break;
			//cnt++;
		}
		else
		{
			break;
		}
	}


}
}