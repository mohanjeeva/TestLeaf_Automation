package week2.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String input = "I am a software tester", output="";
		String inputArr[] = input.split(" ");
		for(int i=0;i<inputArr.length;i++)
		{
			if(i%2==0)
			{
				output += inputArr[i] + " ";
			}
			else
			{
				char arr[] = inputArr[i].toCharArray();
				String temp="";
				for(int j=(arr.length-1);j>=0;j--)
				{
					temp += Character.toString(arr[j]);
				}
				output += temp + " ";
			}
		}
		System.out.println(output.trim());
	}

}
