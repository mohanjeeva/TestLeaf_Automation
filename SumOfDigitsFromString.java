package week1.day2.Assignment;

import java.util.Scanner; //test12le79af65

public class SumOfDigitsFromString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		int sum = 0;
		str = str.replaceAll("[a-zA-Z]", "");
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			sum+=Character.getNumericValue(arr[i]);
		}
		System.out.println(sum);
		s.close();
	}

}
