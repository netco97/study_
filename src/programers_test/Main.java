package programers_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		String s;
		s=Sc.nextLine();
		String str[] = s.split("");
		int index=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(" "))
			{
				index=0;
			}
			else if(index%2==0)
			{
				str[i]=str[i].toUpperCase();
				index++;
			}
			else if(index%2!=0)
			{
				str[i]=str[i].toLowerCase();
				index++;
			}
			System.out.print(str[i]);
		}
	}

}
