package week1.day2.Assignment;

import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String key = s.nextLine(), word=s.nextLine();
		int count = 0;
		char[] arr=word.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			String temp=Character.toString(arr[i]);
			if(key.equals(temp))
				count++;		
		}
		System.out.println("Occurance of key "+key+" is "+count );
		s.close();
	}

}
