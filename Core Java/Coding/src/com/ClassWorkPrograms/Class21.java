package com.ClassWorkPrograms;
/*Control Statements:
=====================
Control flow statements chnage or break the flow of the execution by implementing



in java we are having 3 types of control statements


                    CONTROL STATEMENTS
                            |
                   3 types  |
                    ------------------
1)selection statements
----------------------
a)if
b)if-else
c)if-else-if
d)switch

2)Iteration Statements
----------------------
a)for
b)while
c)do-while
d)for each loop(1.5)

3)Jump Statements
------------------
a)break
b)continue
c)return


1)SELECTION STATEMENTS
=====================
==>Java selection statements allow to control the flow of programs execution based upon CONDITIONS
known only during run-time.
==>


and yes i missed the program because my network got out so no programs in this section sry.(Actually i know this topic well before so i dont mind it.)
in the next class there will be tasks on this topic

there was a section were sir discussed a little topic so i did that program here.

*/
public class Class21 {
void meth1(int i) {
	if(true)
	{
		System.out.println("if block executed");
	}
	else
	{
		System.out.println("else block executed");//this line here is considered as dead code because 
	}												//if condition will always be true and it will never reach else condition.
	System.out.println("meth1() executed");
}
	public static void main(String[] args) {
		Class21 obj=new Class21();
		obj.meth1(5);
	}

}
