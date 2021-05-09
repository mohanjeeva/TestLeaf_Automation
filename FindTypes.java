package week1.day2.Assignment;

public class FindTypes {

	public static void main(String[] args)
	{
		String test ="$$ Welcome to 2nd Class of Automation $$";
		int letter=0, space=0, num=0, specialchar=0;
		char[] arr=test.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isLetter(arr[i]))
				letter++;
			else if(Character.isSpaceChar(arr[i]))
					space++;
			else if(Character.isDigit(arr[i]))
				num++;
			else
				specialchar++;
		}
		System.out.println("Letter - "+ letter);
		System.out.println("Space - "+space);
		System.out.println("Digit - "+num);
		System.out.println("Special Character - "+specialchar);
	}

}
