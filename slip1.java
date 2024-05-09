//Write a Program to print all Prime numbers in an array of ‘n’ elements.
 //(use command line arguments
package slips;
import java.util.*;
public class slip1 {

	public static void main(String[] args)
	{
		int n,i;int flag=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter any number");
		n=shubham.nextInt();
		int a[]=new int[n];
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
			else if(flag==0)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
		}
	}

}
