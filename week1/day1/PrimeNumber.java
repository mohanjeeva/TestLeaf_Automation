package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input=s.nextInt();
		boolean flag=false;
		for (int i = 2; i <= (input/2); i++) {
			if((input%i)==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");
		s.close();
	}

}
