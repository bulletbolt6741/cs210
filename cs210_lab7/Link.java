package cs210_lab7;

public class Link {
    String name;
    int age;
    String degree;
    int yearOfStudy;
    
    Link next;
   

    public Link(String name, int age, String degree, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
        
        this.next = null;
    }

    
    public String toString() {
        return name + ", " + age + ", " + degree + ", " + yearOfStudy;
    }
}
