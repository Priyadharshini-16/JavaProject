import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Result
{
public static void main(String args[])
{
 String name,deg,adr,mail;
 long mob;
 Scanner obj=new Scanner(System.in);
try
{
System.out.println("****BOI-DATA****");
System.out.print("Enter your Name:");
name=obj.nextLine();
System.out.print("Enter your Qualification:");
deg=obj.nextLine();
System.out.print("Enter your Address:");
adr=obj.nextLine();
System.out.print("Enter your E-Mail:");
mail=obj.nextLine();
System.out.print("Enter your Phone no:");
mob=obj.nextLong();
FileWriter flw=new FileWriter("C:\\javanotes\\EX1.txt");
flw.write("***Bio-Data**"+"\n\n");
flw.write("Name:"+name+"\n");
flw.write("Degree:"+deg+"\n");
flw.write("Address:"+adr+"\n");
flw.write("E-Mail:"+mail+"\n");
flw.write("Mobile:"+mob+"\n");
flw.close();
}
/*File fl=new File("C:\\javanotes\\EX1.txt");
Scanner read=new Scanner(fl);
while(read.hasNextLine())
{
 String dt=read.nextLine();
System.out.println(dt);
}
read.close();
}*/
catch(IOException e)
{
System.out.print("Error");
e.printStackTrace();
}
}
}