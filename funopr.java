import java.util.*;
public class funopr
{
static int sum(int a,int b)
{
 int s=a+b;
 return s;
}
static int sub(int a,int b)
{
 int m=a-b;
 return m;
}
static int mul(int a,int b)
{
 int p=a*b;
 return p;
}
static int div(int a,int b)
{
int d=a/b;
return d;
}

public static void main(String args[])
{ 
 
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter 2 number:");
  int num1=sc.nextInt();
  int num2=sc.nextInt();
System.out.println("what you want 1-add,2-sub;3-multiple,4-division");
int opr=sc.nextInt();
switch(opr)
{
  case 1:
  int res=sum(num1,num2);
  System.out.print("result of addition:"+res);
  break;
  case 2:
  int tot=sub(num1,num2);
  System.out.print("result of subration:"+tot);
 break;
 case 3:
  int result=mul(num1,num2);
  System.out.print("result of multiplication:"+result);
 break;  
case 4:
  int avg=div(num1,num2);
  System.out.print("result of division:"+avg);
 break;  
default:
  System.out.print("Invalid input:");
}
}
}
