import java.util.Scanner;

public class HighestFromThree {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=0,b=0,c=0;
	String first,second,third;
	System.out.println("Enter First Number:");
	first=sc.nextLine();
	a=Integer.parseInt(first);
	
	System.out.println("Enter Second Number:");
	second=sc.nextLine();
	b=Integer.parseInt(second);
	
	System.out.println("Enter Third Number:");
	third=sc.nextLine();
	c=Integer.parseInt(third);
	System.out.println("Largest value is");
	if(a>b && b>c)
	{
		System.out.println(a);
	}
	else if(b>c)
	{
		System.out.println(b);
	}
	else
	{
		System.out.println(c);
	}
	
	
	
	
}
}
