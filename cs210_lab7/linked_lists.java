package cs210_lab7;

public class linked_lists {
    private Link head;

    public void add(String name, int age, String degree, int yearOfStudy) {
        Link newLink = new Link(name, age, degree, yearOfStudy);
        if (head == null) {
            head = newLink;
        } else {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;
        }
    }

    public void printList() {
        Link current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
    public void listPosition(String name, int age, String degree, int yearOfStudy,int position)
    {
    	Link newLink = new Link(name, age, degree, yearOfStudy);
    	
    	if(position<=0)
    	{
    		newLink.next=head;
    		head=newLink;
    		return;
    	}
    	Link current=head;
    	int index=0;
    	while(current!=null && index<position-1)
    	{
    		current=current.next;
    		index++;
    	}
    	if(current==null)
    	{
    		System.out.println("out of bounds");
    	}
    	else {
    		newLink.next=current.next;
    		current.next=newLink;
    	}
    	
    }
    
    
    public void Action(String attribute,String value,String action)
    {
    	if(action.equalsIgnoreCase("print"))
    	{
    		print(attribute,value);
    	}
    	else if(action.equalsIgnoreCase("remove"))
    	{
    		remove(attribute,value);
    	}
    	
    	
    	
    }
    public void print(String attribute, String value)
    {
    	Link current=head;
    	while(current!=null)
    	{
    		if(matches(current,attribute,value))
    		{
    			System.out.println(current);
    			return;
    		}
    		current=current.next;
    	}
    	
    }

    public void remove(String attribute, String value) {
        if (head == null) return;
        if (matches(head, attribute, value)) {
        	head=head.next;
        	return;
        }
        Link current=head;
        while (current.next!=null) {
        	if (matches(current.next, attribute, value)) {
            	current.next=current.next.next;
            	return;
            } 
        }
                
      }
    

    private boolean matches(Link link, String attribute, String value) {
        switch (attribute.toLowerCase()) {
            case "name":
                return link.name.equals(value);
            case "age":
                return String.valueOf(link.age).equalsIgnoreCase(value);
            case "degree":
                return link.degree.equals(value);
            case "yearofstudy":
                return String.valueOf(link.yearOfStudy).equalsIgnoreCase(value);
            default:
                return false;
        }
    }
}

