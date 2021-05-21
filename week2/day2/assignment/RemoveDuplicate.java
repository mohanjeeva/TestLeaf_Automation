package week2.day2.assignment;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String input = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String inpuArr[] = input.split(" ");
		for(int i=0;i<inpuArr.length;i++)
		{
			for(int j=0;j<inpuArr.length;j++)
			{
				if(inpuArr[i].equals(inpuArr[j]))
				{
					count++;
					if(count>1)
					{
						input=input.replaceAll((inpuArr[i]+" "), "");
					}
				}
			}
			count=0;
		}
		System.out.println(input);
	}

}
