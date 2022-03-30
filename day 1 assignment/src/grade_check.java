import java.util.*;
public final class grade_check {
	public static void main(String[] args)
	{	int avg=0;int x = 0;
		int arr[]= new int[20];
		Scanner SC = new Scanner(System.in);
		int n=SC.nextInt();
		for(int i=0;i<=n;i++) 
		{	System.out.println("Enter the grade of student"+i);
			if(0<=n && n<=100) 
			{x=SC.nextInt();
				System.out.println("it is in grad");
				avg+=x;
			}
			else
			{
				System.out.println("Invalid grade,try again");
				i=i-1;
			}
		}
		avg = avg/n;
		System.out.println("The average is "+ avg);
	}

}

