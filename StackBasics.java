package dsa;

class Stack
{
	private Node top;
	private int height;
	
	class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	Stack(int value)
	{
		Node newNode=new Node(value);
		top=newNode;
		height=1;
	}
	
	public void printStack()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void push(int value)
	{
		Node newNode=new Node(value);
		if(height==0)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
		height++;
	}
	
	public Node pop()
	{
		if(height==0)
		{
			return null;
		}
		Node temp=top;
		top=top.next;
		temp.next=null;
		height--;
		
		return temp;
	}
	
	public void getTop()
	{
		System.out.println("Top :"+top.value);
	}
	
	public void getHeight()
	{
		System.out.println("Height :"+height);
	}
}
public class StackBasics {

	public static void main(String[] args) {
		Stack s=new Stack(4);
		s.push(5);
		s.push(13);
		s.push(20);
		s.pop();
		s.printStack();
		s.getTop();
		s.getHeight();
	}

}
