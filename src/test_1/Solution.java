package test_1;

import java.util.Scanner;

public class Solution 
{
	private int num;
	Scanner Sc = new Scanner(System.in);
	public Solution() 
	{
		num=Sc.nextInt();
		System.out.println(solution(num)); //true false 반환값 출력
	}
    public boolean solution(int x) {
        boolean answer = true;
		int check=0;
		
		String str;
		str = Integer.toString(x);
		int num[] = new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			num[i]=Character.getNumericValue(str.charAt(i));
            check += num[i];
		}
		
		if(x%check==0)
		{
			answer=true;
		}
		else
		{
			answer=false;
		}
		
        return answer;
    }
}