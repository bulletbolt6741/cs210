package cs210_lab8_3;

public class DoublyLink {
	    String name;
	    int age;
	    String degree;
	    int yearOfStudy;
	    DoublyLink next;
	    DoublyLink prev; 

	    public DoublyLink(String name, int age, String degree, int yearOfStudy) {
	        this.name = name;
	        this.age = age;
	        this.degree = degree;
	        this.yearOfStudy = yearOfStudy;
	        this.next = null;
	        this.prev = null; 
	    }

	    public void display() {
	        System.out.println(name + ", " + age + ", " + degree + ", " + yearOfStudy);
	    }
	}

