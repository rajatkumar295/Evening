package datastructure;

import java.util.*;
class Que
{
	Scanner s=new Scanner(System.in);
    int r=0,f=0;
    int arr[]=new int[5];
    void enque(int num)
    {
    	if(r>=arr.length)
    	{
    		System.out.println("queue is full");
    	}
    	else
    	{
    		arr[r++]=num;
    	}
    }
    void deque()
    {
    	
    	if(f==r)
    	{
    		System.out.println("underflow");
    	}
    	else
    	{
    		System.out.println("element is:"+arr[f]);
    		arr[f++]=0;
    	}
    }
}
public class Deque {

	public static void main(String[] args) {
		Que q=new Que();
		q.enque(5);
		q.deque();
		q.deque();
	}

}
