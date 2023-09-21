import java.util.*;
public class StudResult
{
public static void main(String args[])
{
//String sub[][]=new String[1][3];
String Header[]=new String[]{"Tamil","English","Maths","Science","SocialScience"};
Scanner obj=new Scanner(System.in);
int n,s;
String dummy;
System.out.println("Enter the Number of Students : ");
n=obj.nextInt();
System.out.println("Enter the Number of Subjects : ");
s=obj.nextInt();

int mark[][]=new int[n][s];
String sname[]=new String[n];
String Regno[]=new String[n];

	for(int i=0;i<mark.length;i++)
	{
		dummy=obj.nextLine();
		System.out.println("Enter the Student Name : ");
		sname[i]=obj.nextLine();
		System.out.println("Enter the Student Register Number : ");
		Regno[i]=obj.nextLine();
		for(int j=0;j<mark[i].length;j++)
		{
			System.out.println("Enter the mark of "+Header[j]+" : ");
			mark[i][j]=obj.nextInt();
		}
	}
	
for(int i=0;i<n;i++)
{
	System.out.print("StName"+" "+sname[i]+" "+"Regno"+" "+Regno[i]+"\t");
}
for(int h=0;h<s;h++)
{
	System.out.print(Header[h]+"\t");
}
	for(int i=0;i<mark.length;i++)  
	{
		//System.out.println();
		//System.out.println("StName"+sname[i]+"Regno"+Regno[i]+"\t");
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print(mark[i][j]+"\t");
			}
	}



}
}