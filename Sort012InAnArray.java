import java.util.Scanner;

public class Sort012InAnArray {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the size of the array you want to create :");
		Scanner sc = new Scanner(System.in); 
		n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt(); 
		}
		
		int low=0; 
		int mid =0; 
		int high = arr.length - 1;
		while(mid <= high)
		{
			switch(arr[mid])
			{
	
			case 0:
			{
				int temp=arr[mid]; 
				arr[mid]=arr[low]; 
				arr[low]=temp; 
				low++;
				mid++; 
				break; 
			}
			case 1: 
			{
				mid++; 
				break; 
			}
			case 2:
			{
				int temp = arr[mid]; 
				arr[mid]=arr[high]; 
				arr[high]= temp; 
				high--;
			}
			}
			}
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}	
		}
	}
