import java.util.*;
class BubbleSort
{
	public static void main(String... ads)
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of elements : ");
		int num = sc.nextInt();
		System.out.println("Enter the elements : ");
		int arr[] = new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered elements are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		for(int i=0; i<num;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		System.out.println(" elements after bubble sorting are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}