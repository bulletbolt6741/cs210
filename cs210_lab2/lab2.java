   package cs210_Lab2;
import java.util.Scanner;
public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int input = sc.nextInt();
		int count=1;/*edit for lab 2*/
		if(Integer.toString(input).length()>=2&&Integer.toString(input).length()<=10)
		{	
			System.out.print(input+" ");
			while(input>1)
			{
				if(input%2==0)
				{
					input/=2;
				}
				else {
					input*=3;
					input++;
				}
				count++;/*edit for lab 2*/
				System.out.print(input+" ");
				
			}
		}System.out.println(" Numbers in the sequence: "+count);/*edit for lab 2*/
	}

}
