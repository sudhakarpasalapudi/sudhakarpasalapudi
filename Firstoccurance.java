import java.util.Scanner;
public class Firstoccurance 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		boolean [] visited=new boolean[st.length()];//Boolean array to mark visited characters
		for(int i=0;i<st.length();i++)//Traversing the string
		{
			if(visited[i]==false)//If not visited
			{
				for(int j=i+1;j<st.length();j++)
				{
					if(st.charAt(i)==st.charAt(j))//Checking for duplicate characters
					{
						visited[i]=true;
					}
				}
			}
			if(visited[i]==false)//First occurance
			{
				System.out.println(i);
				break; //Exiting the loop after first occurance
			}	
		}
	}
}










