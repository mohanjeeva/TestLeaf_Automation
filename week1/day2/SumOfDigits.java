package week1.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int input=s.nextInt(),sum=0;
		while(input!=0)
		{
			int temp=input%10;
			sum+=temp;
			input/=10;
		}
		System.out.println(sum);
		s.close();
	}

}
