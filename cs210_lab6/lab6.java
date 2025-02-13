package cs210_lab6;
import java.util.*;
public class lab6 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of queue");
		int x =Integer.parseInt(sc.nextLine());
		priorityQueue queue=new priorityQueue();
		
		for(int i=0;i<=x;i++)
		{
			String str=sc.nextLine();
			if(str.equals("Remove"))
			{
				queue.deleteHead();
				
			}
			else {
				queue.InsertOrdered(Integer.valueOf(str));
			}
		}
		sc.close();
		queue.display();
	}
}
