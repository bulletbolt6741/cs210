package cs210_Lab3;
import java.util.Scanner;
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int N =sc.nextInt();
		/*System.out.println*/ nthPrime(N);	
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}return true;
	}
	
	public static void nthPrime(int N)//int for original code
	{
		int count=0;
		int number=1;
		int nthprime=0;//for modification
		int nth2prime=0;
		while(count<2*N)
		{
			number++;
			if(isPrime(number))
			{
				count++;
				if(count==N)//for modification
				{
					nthprime=number;
				}
				if(count==2*N)
				{
					nth2prime=number;
				}
			}//return number;
		}System.out.println(nthprime+" is the "+N+"th prime number");//for modification
		System.out.println(nth2prime+" is the "+2*N+"th prime number");//for modification
		
		
		
	}

}
