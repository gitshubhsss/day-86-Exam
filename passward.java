package slips;
import java.util.*;
public class passward
{

	public static void main(String[] args)
	{
		String use,pass;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the username and passward");
		use=shubham.next();
		pass=shubham.next();
		String s1=new String();
		String s2=new String();
		if(use.equals("shubham")==true&&pass.equals("dhoni")==true)
        {
			System.out.println("LOGIN SUCCESSFULLY");
        }
		else
		{
			System.out.println("Invalid username and passward");
		}
	}

}
