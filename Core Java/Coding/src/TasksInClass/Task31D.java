package TasksInClass;
/*
 given an array of integer,return the sum of the first 2 elements in the array.if the array length is less
 than 2,just sum up the elements that exist,return 0 if the array length is 0.
 test cases
 ==========
 1,2,3---------->3
 5,5------------>10
 8,2,1,4-------->10
 
 */
public class Task31D {
int meth3(int []arr)
{
	if(arr.length>=2)
		return (arr[0]+arr[1]);
	if(arr.length<2 && arr.length>0)
		return arr[0];
	return 0;
}
public static void main(String[] args) {
	int arr[]= {10};
	System.out.println(new Task31D().meth3(arr));
}
}
