package week3.day1;

public class Calculator 
{
	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3)
	{
		System.out.println(num1+num2+num3);
	}
	public void mul(int num1, int num2)
	{
		System.out.println(num1*num2);
	}
	public void mul(int num1, double num2)
	{
		System.out.println(num1*num2);
	}
	public void sub(int num1, int num2)
	{
		System.out.println(num1-num2);
	}
	public void sub(double num1, double num2)
	{
		System.out.println(num1-num2);
	}
	public void div(int num1, int num2)
	{
		System.out.println(num1/num2);
	}
	public void div(double num1, int num2)
	{
		System.out.println(num1/num2);
	}

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		calc.add(5,6);
		calc.add(5,6,7);
		calc.mul(5,6);
		calc.mul(5,7);
		calc.sub(10,5);
		calc.sub(10.5,5);
		calc.div(10,2);
		calc.div(10.5,2);
	}

}

