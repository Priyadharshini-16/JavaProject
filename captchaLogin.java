import java.util.*;
public class captchaLogin
{
	public static void main(String args[])
	{
	 	int i=0;
	 	String uname,pwd;
	 	Scanner obj=new Scanner(System.in);
	 	while(i<6)
      		{
	 		System.out.println("Enter the UserName : ");
	 		uname=obj.nextLine();
	 		System.out.println("Enter the Password : ");
	 		pwd=obj.nextLine();
			if(i<3)
			{
				if(uname.equals("admin") && pwd.equals("admin"))
				{
		 		 System.out.println("Valid User");
				 break;
				}
				else
				{
		 		 System.out.println("In-Valid User");
				 i++;
					/*if(i==3)
					{
					System.out.println("Account Locked");
					}*/
				}
			}
			else
			{
				String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
				String captcha1;
				Random rnd=new Random();
				String captcha="";
				for(int j=0;j<5;j++)
				{
					int randindex=rnd.nextInt(alphabets.length());
					captcha=captcha+alphabets.charAt(randindex);
				}
				System.out.println("Captcha : "+captcha);
				System.out.println("Enter the above captcha : ");
	 		        captcha1=obj.nextLine();
				if(uname.equals("admin") && pwd.equals("admin") && captcha.equals(captcha1))
				{
		 		 System.out.println("Authorised User");
				 break;
				}
				else
				{
		 		 System.out.println("Un-Authorised User");
				 i++;
					if(i==6)
					{
					System.out.println("Account Locked");
					}
				}
			}
		}
	}
}