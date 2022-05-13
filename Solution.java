package test_1;

import java.util.Scanner;

public class Solution
{
	Scanner Sc = new Scanner(System.in);
	String str;
	public Solution()
	{
		System.out.print("숫자입력: ");
		str = Sc.next();
		int arr[] = sort(str);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
	public int[] sort(String str)
	{
		char s_arr[]= new char[str.length()];
		for(int i=0;i<s_arr.length;i++)
			{
				s_arr[i]= (str.charAt(i));
			}
		int arr[] = new int[str.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Character.getNumericValue(s_arr[i]);
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
 	}
}