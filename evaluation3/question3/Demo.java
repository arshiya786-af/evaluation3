package evaluation3.question3;
import java.util.Scanner;
public class Demo {
public static void main(String args[])
{
	Demo d=new Demo();
	System.out.println("Enter Month");
	Scanner sc=new Scanner(System.in);
	String Month=sc.next();
	try {
		if("Month"=="Months")
	d.showDetails();
	}
	catch(NoClassDefFoundError a)
	{
		System.out.println("Invalid Month Name");
	}
	
}
public void showDetails() {
	
	switch("Months"){
		case "Jan":System.out.println("“This is the 1st Month of the Year January”");
		case "Feb":System.out.println("“This is the 2nd Month of the Year Febuary”");
		case "Mar":System.out.println("“This is the 3rd Month of the Year March”");
		case "Apr":System.out.println("“This is the 4th Month of the Year April”");
		case "May":System.out.println("“This is the 5th Month of the Year May”");
		case "Jun":System.out.println("“This is the 6th Month of the Year June”");
		case "Jul":System.out.println("“This is the 7th Month of the Year July”");
		case "Aug":System.out.println("“This is the 8th Month of the Year August”");
		case "Sep":System.out.println("“This is the 9th Month of the Year September”");
		case "Oct":System.out.println("“This is the 10th Month of the Year October”");
		case "Nov":System.out.println("“This is the 12th Month of the Year November”");
		case "Dec":System.out.println("“This is the 13th Month of the Year December”");
		break;
	}
}
}
