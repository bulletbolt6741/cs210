package lab1;
import java.util.Scanner;
public class Luhns_algorithm {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a card number between 4 and 30 digits");
		 String str=sc.nextLine();
		 int total=0;
		 if(str.length()>=4&&str.length()<=30)
		 {	 
			 for(int i=str.length()-1;i>=0;i--)
			 {
				 int keep = Character.getNumericValue(str.charAt(i));
				 if((str.length()-i)%2==0)
				 {
					 keep=keep*2;
					 if(keep>9)
					 {
						 keep=keep-9;
					 }
					
				 }
				 total+=keep;
			 }
			 if(total%10==0)
			 /*modification for lab, using mod 5
			 
			 if(total%5==0)*/
			 {
				 System.out.println("VALID");
			 
			 }else
			 {
				 System.out.println("INVALID");
			 }
		 }
		 else {
			 System.out.println("INVALID");
		 }
		
	}

}
