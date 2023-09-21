import java.util.Scanner;

public class MarkArray {

public static void main(String[] args) 
{
// TODO Auto-generated method stub
System.out.println("****Welcome to our Portal****");
int mark[]=new int[3];
int total=0;
String sName,sRegno,result="";
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Student Name :");
sName=obj.nextLine();
System.out.println("Enter the Student Register Number :");
sRegno=obj.nextLine();
for(int i=0;i<mark.length;i++)
{
System.out.println("Enter the mark["+i+"] :");
mark[i]=obj.nextInt();
}
System.out.println("****OUTPUT****");
System.out.println("Student Name : "+sName);
System.out.println("Student Register Number : "+sRegno);
for(int i=0;i<mark.length;i++)
{
System.out.print("mark["+i+"] : "+mark[i]+"\t");
if(mark[i]>=35)
{
result="Pass";
}
total=total+mark[i];
}
float aveg=(float)total/3;
System.out.print("Total : "+total+"\t");
System.out.print("Average : "+aveg+"\t");
for(int i=0;i<mark.length;i++)
{

if(mark[i]>=35)
{
result="Pass";
}
else
{
result="Fail";
break;
}
}
System.out.print("Result : "+result+"\t");

}

}
