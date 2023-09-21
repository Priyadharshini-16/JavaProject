import java.util.*;
public class transcation
{
public static void main(String args[])
{
int dep,tran=0,chtrans=0,bal=0,withdraw,n=1,i=0;
Scanner sc=new 	Scanner(System.in);
//System.out.println("Enter the Initial Deposite Amount:");
//dep=sc.nextInt();
while(i<n)
{
	System.out.println("Do you want the transaction 1)Yes 2)No");
	tran=sc.nextInt();
	if(tran==1)
	{
	
	//bal=dep;
	System.out.println("Choose anyone of the transaction 1)Deposit 2)Withdraw 3)Balance");
	chtrans=sc.nextInt();
	if(chtrans==1)
		{
			System.out.println("Enter the Deposite Amount:");
			dep=sc.nextInt();
			bal=bal+dep;
			System.out.println("Your current balance is:"+bal);
		}
		//2-Withdraw
		else if(chtrans==2)
		{
			System.out.println("Enter the Amount you want to withdraw:");
			withdraw=sc.nextInt();
				if(bal>=withdraw)
				{
				bal=bal-withdraw;
				System.out.println("Your current balance is:"+bal);
				}
				else
				{
				System.out.println("In-sufficient funds");
				}
		}
		//3-Balance
		else
		{
			System.out.println("Current Balance:"+bal);
		}
	}
	else
	{
		System.out.println("End of your transaction");
		break;
	}
}
	//1-YES
	/*if(tran==1)
	{
		//1-deposite
		if(chtrans==1)
		{
			System.out.println("Enter the Deposite Amount:");
			dep=sc.nextInt();
			bal=bal+dep;
			System.out.println("Your current balance is:"+bal);
		}
		//2-Withdraw
		if(chtrans==2)
		{
			System.out.println("Enter the Amount you want to withdraw:");
			withdraw=sc.nextInt();
				if(bal>=withdraw)
				{
				bal=bal-withdraw;
				System.out.println("Your current balance is:"+bal);
				}
		else
		{
		System.out.println("In-sufficient funds");
		}
		}
		//3-Balance
		if(chtrans==3)
		{
			System.out.println("Current Balance:"+bal);
		}
			//2-NO
		 else if(tran==2);
		{
			System.out.println("End of the transaction");
		}
	}
	else
	{	
		System.out.println("End of transaction");
	}	*/		
	
}
}
		