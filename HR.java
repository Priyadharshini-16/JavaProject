import java.util.*;
public class HR
{
public static void main(String args[])
{
String feild[]=new String[]{"Basic","Sal","Trvl","Hr"};
Scanner obj=new Scanner(System.in);
int n,s;
int tot=0;
String dup;
System.out.println("Enter the Number of Employees : ");
n=obj.nextInt();
System.out.println("Enter how many feilds you want:");
s=obj.nextInt();
int amt[][]=new int[n][s];
String ename[]=new String[n];
String empno[]=new String[n];

//***INPUT STATEMENT****//
for(int i=0;i<amt.length;i++)
{
dup=obj.nextLine();
System.out.println("Enter the name of the Employee:");
ename[i]=obj.nextLine();
System.out.println("Enter the Employee Number:");
empno[i]=obj.nextLine();
	for(int j=0;j<amt[i].length;j++)
        {
          System.out.println("Enter the Amount of "+ feild[j]+" : ");
          amt[i][j]=obj.nextInt();
         }
}
//***PRINTING STATEMENT****//

System.out.println("*****Output*****");
System.out.print("Employee Name \t");
System.out.print("Employee No \t");
for(int h=0;h<s;h++)
{
	System.out.print(feild[h]+"\t");
}

System.out.print("Net total"+"\t\t");
for(int i=0;i<amt.length;i++)
{
System.out.println();
System.out.print(ename[i]+"\t\t");
System.out.print(empno[i]+"\t\t");
	for(int j=0;j<amt[i].length;j++)
        {
         System.out.print(amt[i][j]+"\t");
	 tot=tot+amt[i][j];
         }
	System.out.print(tot+"\t");
}
}
}