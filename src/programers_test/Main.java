package programers_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		int N=Sc.nextInt();

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
			{
				count+=i;
			}
		}
		System.out.println(count);
		}
	}