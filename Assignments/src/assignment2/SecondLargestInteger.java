package assignment2;
import java.util.Scanner;
public class SecondLargestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int temp;
		
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			 System.out.print(a[i]+" ");
			
			 
		}
		int first=a[0];
		int secondlargest=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]!=first)
			{
				secondlargest=a[i];
				break;
			}
		}
		System.out.println();
		System.out.println("second largest element in array:"+secondlargest);
		
		sc.close();

	}

}
