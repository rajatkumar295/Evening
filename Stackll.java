package datastructure;
class node1
{
	int data;
	node1 prev;
    
}
class stack
{
	node1 top;
	void push(int num)
	{
		node1 n=new node1();
		n.data=num;
		if(top==null)
		{
			n.prev=top;
			top=n;
		}
	}
	void pop(){
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
			node1 temp=top;
			System.out.println("popped element is:"+temp.data);
			top=top.prev;
			temp=null;
		}
	}
	void display()
	{
		node1 n=top;
		while(top!=null)
		{
			System.out.println(top.data);
			top=top.prev;
		}
	}
}
public class Stackll {

	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.pop();
		s.pop();
		s.pop();
		s.display();
	}

}
