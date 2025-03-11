package daily.assignment;

import java.util.Scanner;

public class COS 
{
	int b =4;
	public static void main(String[] args) 
	{ 
		COS cs1=new COS();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		int COS =cs1.b*a;
		System.out.println("Circumference of Square is "+COS);
		s1.close();
	}
}
