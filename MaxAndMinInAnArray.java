import java.util.Scanner;

public class MaxMinInAnArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array you want to create : ");
		int n = sc.nextInt(); 
		int[] arr = new int[n]; 
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt(); 
		}
		int max=Integer.MIN_VALUE; 
		int min=Integer.MAX_VALUE; 
		for(int i=0; i<arr.length ; i++)
		{
			max=Math.max(max, arr[i]); 
			min=Math.min(min, arr[i]); 
		}
		
		System.out.println("The Maximum element is "+ max + " and the minimum element is "+ min);
	}

}
