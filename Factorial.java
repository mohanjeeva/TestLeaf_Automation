package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int input=5, fact=1, temp=input;
		for(int i=1;i<=temp;i++)
		{
			fact*=input;
			input--;
		}
		System.out.println(fact);
	}

}
