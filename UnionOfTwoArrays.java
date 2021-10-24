import java.util.*; 
public class UnionOfsortedTwoArrays {
	public static void main(String[] args) {
		int n,m; 
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the size of the first array");
		n= sc.nextInt(); 
		System.out.println("Enter the size of the second array");
		m=sc.nextInt(); 
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		System.out.println("Enter the elements of the first array");
		for( int i=0 ; i<n; i++)
		{
			arr1[i]=sc.nextInt(); 
		}
		System.out.println("Enter the elements of the Second array");
		for( int i=0 ; i<m; i++)
		{
			arr2[i]=sc.nextInt(); 
		}
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		int i=0, j=0; 
		while ( i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				if(arr.size()>0 &&  arr.get(arr.size()-1)!=arr1[i] )
				{
					arr.add(arr1[i]);  
				}
				else if( arr.size()==0)
				{
					arr.add(arr1[i]); 
				}
				i++; 
			}
			else if( arr1[i]>arr2[j])
			{
				if(arr.size()>0 &&arr.get(arr.size()-1)!=arr2[j] )
				{
					arr.add(arr2[j]); 
				}
				else if(arr.size()==0)
				{
					arr.add(arr2[j]); 
				}
				j++; 
			}
			else
			{
				if( arr.size()>0 && arr.get(arr.size()-1)!=arr1[i])
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
			}
		
		while(i<n)
		{
			if(arr.get(arr.size()-1)!=arr1[i])
				arr.add(arr1[i]); 
			i++; 
		}
		while( j<m)
		{
			if(arr.get(arr.size()-1)!=arr2[j])
			{
				arr.add(arr2[j]); 
			}
			j++; 
		}
		for(int k=0; k<arr.size(); k++)
		{
			System.out.println(arr.get(k)); 
		}
		}
}
