import java.util.*;
public class pattern
{
public static void main(String args[])
{
int n=5,space=1;
//1.RIGHT-TRI PATTERN OF STARS
System.out.println("RIGHT-TRI PATTERN OF STARS");
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++) //--here the condition of j is to print i 
     {
	System.out.print("* ");
      }
   System.out.println();
   }

//2.SQUARE STAR PATTERN
System.out.println("SQUARE STAR PATTERN");
for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++) // --in 2nd loop of j condition is with n
     {
	System.out.print("* ");
      }
   System.out.println();
   }

//3.NUMBER RIGHT-TRI PATTERN
System.out.println("NUMBER RIGHT-TRI PATTERN");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
  System.out.print(i+" ");
  }
System.out.println();
}

//4.SAME NUMBER IN PYRAMID
System.out.println("SAME NUMBER IN PYRAMID");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
  System.out.print(j+" ");
  }
System.out.println();
}

//5.HALF DIAMOND PATTERN IN SAME NUMBERS
System.out.println("HALF DIAMOND PATTERN IN SAME NUMBERS");
for(int i=1;i<=n;i++)
{
  for(int j=1;j<=i;j++)
  {
    System.out.print(j+ " "); 
  }
System.out.println();
}
for(int i=n-1;i>=1;i--)
{
  for(int j=1;j<=i;j++)
{
  System.out.print(j+ " "); 
}
System.out.println();
}

//6.PYRAMID STARS 
System.out.println("PYRAMID STARS");
for(int i=0;i<n;i++)
{
for(int j=n-i;j>1;j--)
{
  System.out.print(" ");
  }
for(int j=0; j<=i; j++ )   
{
System.out.print("* ");
}
System.out.println();
}

//7.PYRAMID NUMBERS PATTERN
System.out.println("PYRAMID NUMBERS PATTERN");
for(int i=0;i<n;i++)
{
for(int j=n-i;j>1;j--)
{
  System.out.print(" ");
  }
for(int j=1; j<=i; j++ )   
{
System.out.print(i+" ");
}
System.out.println();
}

//8.SAME NUMBER PYRAMID
System.out.print("SAME NUMBER PYRAMID");
for(int i=0;i<n;i++)
{
for(int j=n-i;j>1;j--)
{
  System.out.print(" ");
  }
for(int j=1;j<=i;j++)   
{
System.out.print(j+" ");
}
System.out.println();
}

//9.DIAMOND STARS PATTERN
System.out.println("DIAMOND STARS PATTERN");

space=n-1;  
for(int j=1;j<=n;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space--;  
for(int i=1;i<=2*j-1;i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space=1;  
for(int j=1;j<=n-1;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space++;  
for(int i=1;i<=2*(n-j)-1;i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
} 
 
//10.DIAMOND NUMBER PATTERN
System.out.println("DIAMOND NUMBER PATTERN");
space = n - 1;  
for(int j=1;j<=n;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space--;  
for(int i=1;i<=2*j-1;i++)  
{  
System.out.print(i+"");  
}  
System.out.println("");  
}  
space = 1;  
for(int j=1;j<=n-1;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space++;  
for(int i=1;i<=2*(n-j)-1;i++)  
{  
System.out.print(i+"");  
}  
System.out.println("");  
}

//11.SAME NUMBER IN DIAMOND PATTERN
System.out.println("SAME NUMBER IN DIAMOND PATTERN");
//changes in lower tri
space = n - 1;  
for(int j=1;j<=n;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space--;  
for(int i=1;i<=2*j-1;i++)  
{  
System.out.print(j+"");  
}  
System.out.println("");  
}  
space = 1;
 for(int j=1;j<=n-1;j++)  
{  
for(int i=1;i<=space;i++)  
{  
System.out.print(" ");  
}  
space++;  
for(int i=1;i<=2*(n-j)-1;i++)  
{  
System.out.print(i+"");  
}  
System.out.println("");  
}

//12.INVERTED RIGHT-TRI PATTERN IN STARS
System.out.println("INVERTED RIGHT-TRI PATTERN IN STARS");

for(int i=n-1;i>=0;i--)
{
 for(int j=0;j<=i;j++) 
  {
   System.out.print("* ");
  }
System.out.println();
}

//13.INVERTED RIGHT-TRI PATTERN IN NUMBERS
System.out.println("INVERTED RIGHT-TRI PATTERN IN NUMBERS");

for(int i=n-1;i>=0;i--)
{
 for(int j=1;j<=i;j++) 
  {
   System.out.print(i+" ");
  }
System.out.println();
}

//14.INVERTED RIGHT-TRI PATTERN IN SAME NUMBERS
System.out.println("INVERTED RIGHT-TRI PATTERN IN SAME NUMBERS");

for(int i=n-1;i>=0;i--)
{
 for(int j=1;j<=i;j++) 
  {
   System.out.print(j+" ");
  }
System.out.println();
}

//15.HALF DIAMOND PATTERN IN  NUMBERS
System.out.println("HALF DIAMOND PATTERN IN  NUMBERS");

for(int i=1;i<=n;i++)
{
  for(int j=1;j<=i;j++)
  {
    System.out.print(i+ " "); 
  }
System.out.println();
}
for(int i=n-1;i>=1;i--)
{
  for(int j=1;j<=i;j++)
{
  System.out.print(i+ " "); 
}
System.out.println();
}

//16.HALF DIAMOND PATTERN IN SAME NUMBERS
System.out.println("HALF DIAMOND PATTERN IN SAME NUMBERS");

for(int i=1;i<=n;i++)
{
  for(int j=1;j<=i;j++)
  {
    System.out.print("* "); 
  }
System.out.println();
}
for(int i=n-1;i>=1;i--)
{
  for(int j=1;j<=i;j++)
{
  System.out.print("* "); 
}
System.out.println();
}

}//public 
}//public
	







