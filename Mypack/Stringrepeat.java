package Mypack;

import java.util.Scanner;

public class Stringrepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		int flag=0;
		
		int length=x.length();
		for(int i=1;i<=length-1;i++)
		{
			char in=x.charAt(i);
			for(int j=0;j<i;j++)
				
					{
				char kl=x.charAt(j);
				if(in==kl)
				{
					flag=flag+1;
					if(flag==1)
					{
					System.out.print(in);
					
				}
					
				}
				
					}
		}
	}

}
