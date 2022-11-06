package ClassWorkPrograms;
/* Jump Statements
   ===============
  1)break
  2)continue
  3)return
  
  */
public class Class26A {
	void meth1()
	{
		System.out.println("Implementing JUMP statements");
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				//break;	//will break the loop and comes out
				//continue; //will skip the specific if the condition is true
				//return; //will return to the calling function(main)
			}
			System.out.println("i value :"+i);
		}
		System.out.println("Compiler came out from for loop");
	}
public static void main(String[] args) {
	System.out.println("start");
	new Class26A().meth1();
	System.out.println("end");
}
}
