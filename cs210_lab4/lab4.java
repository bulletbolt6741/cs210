package cs210_Lab4;
import java.util.Scanner;

public class lab4 {
	public static void stringSorter(int n,String[] words) {
        n=words.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0; j<n-i-1; j++) {
                if(words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1]=temp;
                }
                else if(words[j].length()==words[j+1].length() && words[j].compareTo(words[j+1])>0) {
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]= temp;
                }
            }
        }
    }
	public static void stringSorterBackwards(int n,String[] words) {//modification for lab4
        n=words.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0; j<n-i-1; j++) {
                if(words[j].length() < words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1]=temp;
                }
                else if(words[j].length()==words[j+1].length() && words[j+1].compareTo(words[j])>0) {
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] words=new String[n];
        for(int i=0;i<n;i++) {
           words[i]=sc.nextLine();
        }
        stringSorter(n,words);
        for(int i=0;i<n;i++) {
            if(i>0&&i<100)
            {
                
            }
            System.out.print(words[i]+" ");
        }
        System.out.println();
      //modification for lab4
        stringSorterBackwards(n,words);
        for(int i=0;i<n;i++) {
            if(i>0&&i<100)
            {
                
            }
            System.out.print(words[i]+" ");
        }
            

        sc.close();
    }
}