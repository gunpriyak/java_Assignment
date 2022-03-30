import java.util.Scanner;

public class nextdate {

	public static void main(String[] args) {
		int day, month, year;
		Scanner SC = new Scanner(System.in);

		System.out.println("Enter day");
		day = SC.nextInt();

		System.out.println("Enter month");
		month = SC.nextInt();

		System.out.println("Enter year");
		year = SC.nextInt();

		System.out.println("current date: " + day + "/" + month + "/" + year);
		int noOfDaysInMonth[]={-1, 31,28,31,30,31,30,31,31,30,31,30,31};

		  if(isLeapYear(year)){
			noOfDaysInMonth[2]=29;
		  }
		  
	  
		  day=day+1; 

	
		  System.out.println("next date: " + day + "/" + month + "/" + year);  
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;
	}



	}

