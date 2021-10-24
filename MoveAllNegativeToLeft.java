import java.util.Scanner;

public class MoveAllNegatives {

	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of the array you want to create");
		n=sc.nextInt(); 
		int[] arr= new int[n]; 
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt(); 
		}
		int i=0; 
		int j=0; 
		while ( i<arr.length)
		{
			if( arr[i]<0)
			{
				int temp=arr[i]; 
				arr[i]=arr[j]; 
				arr[j]=temp; 
				j++;
			}
			i++;
		}
		for(int k=0; k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}
