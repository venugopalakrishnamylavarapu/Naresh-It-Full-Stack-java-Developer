package ClassWorkPrograms;

import java.util.Arrays;

//parallel arraysorting
public class Class68E {
	void meth1()
	{
		int arr[]= {1,5,7,3,4,9,2,6,8};
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		/*Arrays.sort(arr);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		*/
		Arrays.parallelSort(arr,4,7);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Class68E obj=new Class68E();
		obj.meth1();
	}
}
