import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int n,m ; 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array 1");
		n=sc.nextInt(); 
		System.out.println("Enter the size of the array 2");
		m=sc.nextInt(); 
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		System.out.println("Enter the elements of the array 1");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt(); 
			}
		System.out.println("Enter the elements of the array 2");
		for(int i=0; i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			}
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		
		int i =0,j=0; 
		while( i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				if(arr.size()>0 && arr.get(arr.size()-1)!=arr1[i])
				{
					arr.add(arr1[i]); 
				}
				else if(arr.size()==0)
				{
					arr.add(arr1[i]); 
				}
				i++; 
				j++; 
			}
			else if( arr1[i]<arr2[j])
			{
				i++; 
			}
			else
			{
				j++; 
			}
		}
		for(int k=0; k<arr.size() ; k++)
		{
			System.out.println(arr.get(k));
		}
		
	}

}
