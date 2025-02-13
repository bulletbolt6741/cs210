 package cs210lab_5_2;
import java.util.*;
public class main {
	           

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        int n=10;
		        Queue queue= new Queue(n);
		        Stack stack = new Stack(n);
		        while (true) {
		            String input = scan.nextLine();
		            queue.insert(input);
		            if (input.equals("Arrived")) {
		                break;
		            }

		            if (input.equals("Go Back")) {
		                if (!stack.isEmpty()) {
		                    stack.pop();
		                }
		            } else {
		                stack.push(input);
		            }
		        }
		        System.out.println("");
		        while (!stack.isEmpty()) {
		            System.out.println(reverse(stack.pop()));
		        }
		        System.out.println("");
		        System.out.println("Original");
		        queue.display();
		    }
		    static String reverse(String direction) {
		        switch (direction) {
		            case "Go North":
		                return "Go South";
		            case "Go South":
		                return "Go North";
		            case "Go East":
		                return "Go West";
		            case "Go West":
		                return "Go East";
		            default:
		                return "";
		        }
		    }
		

	}

