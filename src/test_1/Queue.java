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
     System.out.print("�迭 ũ�� ���� : ");
     num=Sc.nextInt();
     queue= new int[num];
     while(true)
{
    	 System.out.print("1.Ǫ�� 2. �� 3.�����Ȳ ��� 4.���� : ");
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

      System.out.println("ũ�� ��á���ϴ�.");

}

else

{

      System.out.print("���� �Է� : ");

       queue[count]=Sc.nextInt();

       count++;

}

}



public void pop()

{

     if(count==0)

      {

             System.out.println("����� �����ϴ�.");

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

