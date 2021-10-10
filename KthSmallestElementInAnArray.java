import java.util.*; 

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n; 
		int k; 
		System.out.println("Enter the value of K");
		k = sc.nextInt();
		System.out.println(" Enter the size of the array");
		n= sc.nextInt(); 
		int arr[] = new int[n]; 
		System.out.println("Enter the elements of the array");
		for( int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt(); 
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>(); 
		
		for( int i =0;i<k ; i++)
		{
			pq.add(arr[i]); 
		}
		
		for(int i=k ; i<arr.length; i++)
		{
			if(arr[i]>pq.peek())
			{
				pq.remove(); 
				pq.add(arr[i]); 
			}
		}
		System.out.println(pq.peek());	
	}
}
