package week1.day2.Assignment;

import java.util.Scanner;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
				System.out.print(arr[i]);
			else
				System.out.print((Character.toString(arr[i])).toUpperCase());
		}
		s.close();
	}

}
