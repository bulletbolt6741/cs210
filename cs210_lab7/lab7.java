package cs210_lab7;

import java.util.Scanner;

public class lab7{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		linked_lists Lists=new linked_lists();
		Lists.add("Bunny",26,"CSSE",2);
		Lists.add("Larry",18,"ARTS",1);
		Lists.add("Steve",32,"ComputationalThinking",4);
		String str=sc.nextLine();
		
		while(!str.equals("exit"))
		{
			int counter=0;
			if(counter>0)
			{
				str=sc.nextLine();
			}
			counter++;
			if(str.equals("PrintList"))
			{
				Lists.printList();
				str=sc.nextLine();
			}
		
		
		
		if(str.equals("NewLink"))
		{
			String name=sc.next();
			
			int age=sc.nextInt();
		
			String degree=sc.next();
			
			int yearOfStudy=sc.nextInt();
			
			int position=sc.nextInt();
			
			Lists.listPosition(name, age, degree, yearOfStudy, position);
			str=sc.nextLine();
		}
		
		
		
			  
			else if(!str.equals("NewLink")||!str.equals("exit")||!str.equals("PrintList"))  {
				String str2=sc.nextLine();
				String str3=sc.nextLine();
				if(str3.equalsIgnoreCase("print")||str3.equalsIgnoreCase("remove"))
				{
					Lists.Action(str, str2, str3);
				}
				str=sc.nextLine();
			}
		}
		
		
		
	}

    }