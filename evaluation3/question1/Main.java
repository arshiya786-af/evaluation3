package evaluation3;
 import java.util.InputMismatchException;
 import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number of elements in the array");
		int num=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int [] arr=new int[num];
		try {
			for(int i=0;i<num;i++)
			{
			arr[i]=sc.nextInt();
				System.out.println("Enter the index of the array element you want to access");
				int index=sc.nextInt();
				System.out.println("The array element at index"+index+"="+arr[index]);
				System.out.println("The array element successfully accessed");
				
			}
		}
			catch(ArrayIndexOutOfBoundsException a)
				{
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			}
			catch(NumberFormatException a)
			{
				System.out.println("java.lang.NumberFormatException");
			}
			
			
		
	}
}
