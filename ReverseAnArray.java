import java.util.Scanner;
public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of the array you want to create : ");
		int n=sc.nextInt(); 
		int[] arr = new int[n]; 
		for(int i=0; i<arr.length; i++ )
		{
			arr[i]=sc.nextInt();
		}
	 int end=n-1; 
	 int start=0; 
	 while ( start < end)
	 {
		 int temp = arr[start]; 
		 arr[start]=arr[end]; 
		 arr[end]=temp; 
		 end--; 
		 start++; 
	 }
	 for( int i =0 ; i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	}

}
