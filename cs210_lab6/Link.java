package cs210_lab6;

 class Link {
	 public int data;
	 public Link next;
	 
	 public Link(int data)
	 {
		 this.data=data;
		 this.next=null;
	 }
	 public void displayLink()
	 {
		 System.out.print(data+ " ");
	 }
}
