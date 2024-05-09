//) Write a program to accept ‘n’ name of cities from the user and sort them in ascending 
 //order.
package slips;
import java.util.*;
public class slip3 
{
	public static void main(String[] args)
	{
		String name;
		int n,i,j;
		String temp;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of cities");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" cities");
		String s1[]=new String[n];
		for(i=0;i<n;i++)
		{
			{
				s1[i]=shubham.next();//String accept
			}
		}
		System.out.println("Your entered cities ");
		for(i=0;i<n;i++)
		{
			{
				System.out.print("\t"+s1[i]);
			}
			System.out.println("");
		}
		System.out.println("Cities in assending order");
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		System.out.println("\nSorted array");
		for(i=0;i<n;i++)
		{
			
				System.out.print("\t"+s1[i]);
			
			
		}

	
	}
}
