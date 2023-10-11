import java.util.*;
public class unit
{
public static void main(String args[])
{
double tot=0,amt=0,totamt=0,slab1=225,slab2=900,slab3=600,slab4=1350,slab5=1800,slab6=800,ctot=0,slab7=2000;
System.out.println("***BILL CALCULATION***");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Consumed unit:");
tot=sc.nextInt();
ctot=tot;
System.out.println("From - To \t"+"Units \t"+"Rate \t"+"Amount");
	if(tot<=500)
	{
		if(tot>0 && tot<=100)
		{
			amt=tot*0;
			System.out.println("1 - 100 \t"+"100 \t"+"0 \t"+amt);
		}
		else if(tot>=101 && tot<=200)
		{
			tot=tot-100;
			amt=tot*2.25;
			totamt=amt;
			System.out.println("1 - 100 \t" + "100 \t" +"0 \t" + 0);
			System.out.println("101 - 200 \t" + tot + "\t" + "2.25 \t" + amt);
		}
		else if(tot>=201 && tot<=400)
		{
			tot=tot-200;
                        //amt=tot*slab1;
			amt=tot*4.5;
			totamt=slab1+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 200 \t" + "100 \t" + "2.25 \t" + slab1);
			System.out.println("201 - 400 \t" + tot + "\t" + "4.5 \t" + amt);
		}
		else if(tot>=401 && tot<=500)
		{ 
			tot=tot-400;
                        //amt=tot*slab1;
			amt=tot*6.0;
			totamt=slab1+slab2+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 200 \t" + "100 \t" + "2.25 \t" + slab1);
			System.out.println("201 - 400 \t" + "200 \t" + "4.5 \t" + slab2);
			System.out.println("401 - 500 \t" + tot + "\t" + "6.0 \t" + amt);
		}	
	
	

		System.out.println("\t\t\t Total\t"+totamt);
	}
	else
	{
		if(tot>=501 && tot<=600)
			{
			tot=tot-500;
			amt=tot*8.0;
			totamt=slab4+slab3+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 400 \t" + 300 + "\t" + "4.5 \t" + slab4);
                        System.out.println("401 - 500 \t" + 100 + "\t" + "6.0 \t" + slab3);
			System.out.println("501 - 600 \t" + tot + "\t" + "8.0 \t" + amt);
		}
		else if(tot>=601 && tot<=800)
		{
			tot=tot-600;
			amt=tot*9;
			totamt=slab4+slab3+slab2+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 400 \t" + 300 + "\t" + "4.5 \t" + slab4);
                        System.out.println("401 - 500 \t" + 100 + "\t" + "6.0 \t" + slab3);
    			System.out.println("501 - 600 \t" + 100 + "\t" + "8.0 \t" + slab2);
                        System.out.println("601 - 800 \t" + tot + "\t" + "9.0 \t" + amt);
		}
		else if(tot>=801 && tot<=1000)
		{ 
			tot=tot-800;
			amt=tot*10.0;
			totamt=slab4+slab3+slab2+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 400 \t" + 300 + "\t" + "4.5 \t" + slab4);
                        System.out.println("401 - 500 \t" + 100 + "\t" + "6.0 \t" + slab3);
    			System.out.println("501 - 600 \t" + 100 + "\t" + "8.0 \t" + slab2);
                        System.out.println("601 - 800 \t" + tot + "\t" + "9.0 \t" + amt);
		}
                else
		{
			tot=tot-1000;
			amt=tot*11.0;
			totamt=slab4+slab3+slab6+slab5+slab7+amt;
			System.out.println("1 - 100 \t" + "100 \t" + "0 \t" + 0);
			System.out.println("101 - 400 \t" + 300 + "\t" + "4.5 \t" + slab4);
                        System.out.println("401 - 500 \t" + 100 + "\t" + "6.0 \t" + slab3);
    			System.out.println("501 - 600 \t" + 100 + "\t" + "8.0 \t" + slab6);
			 System.out.println("601 - 800 \t" + 200 + "\t" + "9.0 \t" + slab5);
                        System.out.println("801 - 1000 \t" + 200 + "\t" + "10.0\t" + slab7);
			 System.out.println("1001 -"+ctot+"\t" + tot + "\t" + "11.0 \t" + amt);
		 }
		System.out.println("\t\t\t Total\t"+totamt);
	}
}		
}