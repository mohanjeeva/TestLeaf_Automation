package week1.day2.Assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(), str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2+=str.charAt(i);
		}
		if(str.equals(str2))
			System.out.println("Given number is palindrome");
		else 
			System.out.println("Not a Palindrome");
		
		s.close();
	}

}
