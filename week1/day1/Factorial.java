package week1.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input=s.nextInt(), fact=1, temp=input;
		for(int i=1;i<=temp;i++)
		{
			fact*=input;
			input--;
		}
		System.out.println(fact);
		s.close();
	}

}
