import java.util.*;
public class Calculator 
{
public static void main(String[] args)
{
int num1,num2,a=0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first numbers :");
num1 = sc.nextInt();
System.out.println("Enter the second numbers :");
num2 = sc.nextInt();
System.out.println("Enter the operator 1:+,2:-,3:*,4:/");
a=sc.nextInt();
switch(a)
{
case 1:
a=num1+num2;
System.out.println(num1+"+"+num2+"="+a);
break;
case 2:
a=num1-num2;
System.out.println(num1+"-"+num2+"="+a);
break;
case 3:
a=num1*num2;
System.out.println(num1+"*"+num2+"="+a);
break;
case 4:
a=num1/num2;
System.out.println(num1+"/"+num2+"="+a);
break;
default:
System.out.println("You enter wrong input");
}
System.out.println("The final result:"+a);
//System.out.println(num1+num2+"="+a);
}
}