package week3.day2.assignment;

import java.util.*;

public class MoveZeroToRight 
{
	public static void main(String[] args) 
	{
		int[] num = {4,0,3,0,1,5,2,0};
		ArrayList<Integer> alZero= new ArrayList<Integer>();
		ArrayList<Integer> alNonZero= new ArrayList<Integer>();
		for (int i=0;i<num.length;i++) 
		{	
			if(num[i]==0)
			{
				alZero.add(num[i]);
			}
			else
			{
				alNonZero.add(num[i]);
			}
		}
		for (Integer val : alNonZero) 
		{
			System.out.print(val+" ");
		}
		for (Integer val : alZero) 
		{
			System.out.print(val+" ");
		}
	}
}
