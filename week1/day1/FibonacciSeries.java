package week1.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int range=s.nextInt(), firstNumber=0, secondNumber=1;
		System.out.print(firstNumber+" "+secondNumber);
		for (int i = 2; i < range; i++)
		{
			int sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			System.out.print(" "+sum);
		}
		s.close();
	}
}
