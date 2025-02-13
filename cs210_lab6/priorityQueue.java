package cs210_lab6;

public class priorityQueue {
	private Link first;
	
	public priorityQueue()
	{
		first=null;
	}
	public void insertHead(int num)
	{
		Link newLink=new Link(num);
		newLink.next=first;
		first=newLink;
	}
	public Link deleteHead()
	{
		if(first==null) {
			return null;
		}
		Link temp=first;
		first=first.next;
		return temp;
	}
	public void display() {
		Link current=first;
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
	public Link delete(int key)
	{
		Link current=first;
		Link previous=null;
		
		while(current!=null&&current.data!=key)
		{
			previous=current;
			current=current.next;
		}
		if(current==null)
		{
			return null;
		}
		if(current==first)
		{
			first=first.next;
		}
		else {
			previous.next=current.next;
		}
		return current;
	}
	public void InsertOrdered(int data) {
		Link newLink=new Link(data);
		Link previous=null;
		Link current=first;
		
		while(current!=null&& data>current.data)
		{
			previous=current;
			current=current.next;
		}
		
		if(previous==null)
		{
			first=newLink;
		}
		else {
			previous.next=newLink;
		}
		newLink.next=current;
	}
}
