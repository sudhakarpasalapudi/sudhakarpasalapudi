import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
	public static char[] Scanner()//method to take input from user
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		char [] a=new char[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element in index "+i);
			a[i]=sc.next().charAt(0);
		}
		return a;
	}
	public static void Duplicates(char [] a,char [] b)
	{
		int count=0;
		//checking the values in both the arrays
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					count++;//count will get increased when any duplicate occurs
			}
		}
		if(count>0)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void main(String[] args) {
		char [] a=Scanner();//character array
		char [] b=Scanner();
		System.out.println(Arrays.toString(a));//to print an array in array format
		System.out.println(Arrays.toString(b));
		Duplicates(a,b);//method calling
	}

}
