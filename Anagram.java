package week1.day2.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		String text1=s.nextLine(), text2=s.nextLine();
		if(text1.length()==text2.length())
		{
			char[] arr1=text1.toCharArray();
			char[] arr2=text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
					count++;
			}
			if(count==arr1.length)
				System.out.println("Given words are Anagram");
			else
				System.out.println("Given words are not Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		s.close();
	}

}
