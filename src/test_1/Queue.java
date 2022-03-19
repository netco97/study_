package test_1;

import java.util.Scanner;

public class Queue 
{

	int queue[];
	int choice,num;
	int count=0;

	Scanner Sc = new Scanner(System.in);
public Queue() 
{
     System.out.print("배열 크기 생성 : ");
     num=Sc.nextInt();
     queue= new int[num];
     while(true)
{
    	 System.out.print("1.푸쉬 2. 팝 3.현재상황 출력 4.종료 : ");
    	 choice=Sc.nextInt();
if(choice==1)

{

     push();

}

 else if(choice==2)

{

     pop();

}

else if(choice==3)

{

     prn();

}

else

{

     break;

}

}

}



public void push()

{

     if(count==queue.length)

{

      System.out.println("크기 다찼습니다.");

}

else

{

      System.out.print("정수 입력 : ");

       queue[count]=Sc.nextInt();

       count++;

}

}



public void pop()

{

     if(count==0)

      {

             System.out.println("지울게 없습니다.");

      }

      else

     {

             int arr[]=new int [100];

      for(int i=0;i<queue.length;i++)

      {

             arr[i]=queue[i];

      }

      for(int i=0;i<queue.length;i++)

      {

            queue[i]=arr[i+1];

       }

       count--;

}



}



public void prn()

{

      for(int i=0;i<queue.length;i++)

{

      System.out.print(queue[i]+" ");

}

      System.out.println();

}

}

