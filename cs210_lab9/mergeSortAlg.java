package cs210_lab9;

import java.util.*;

public class mergeSortAlg {

    public static void main(String[] args) {
      
        int n=200;
        
    	
        int[] array = new int[n];
        Random rand=new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        
        }
        
        mergeSort(array, 0, n - 1);
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        
    }
    private static void mergeSort(int[] array, int left, int right) {
        int size =right-left+1;
        System.out.println(size);
        
    	if (size<=10) {
    		selectionSort(array,left,right);
    		System.out.println("s");
    		
    	}
    	
    	else if((left<right)&&size>10) {
    		 System.out.println("m");
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
           
        }
    }
    public static void selectionSort(int inputArray[],int left ,int right)
    {
    	
    	for(int i=left; i<=right;i++)
    	{
    		int min=i;
    	
    		for(int j=i+1;j<inputArray.length;j++)
    		{
    			if(inputArray[j]<inputArray[min])
    			{
    				min=j;
    			}
    		}
    		int temp=inputArray[min];
    		inputArray[min]=inputArray[i];
    		inputArray[i]=temp;
    		
    	}
    }
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

