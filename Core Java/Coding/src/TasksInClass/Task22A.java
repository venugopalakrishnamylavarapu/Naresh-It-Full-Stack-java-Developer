package TasksInClass;

public class Task22A {
	    void meth1(int a, int b, int c) {
	        if(a>b)
	        {
	            if(a>c)
	                System.out.println(a+" is the biggest number among the three");
	            else
	                System.out.println(c+" is the biggest number among the three");
	        }
	        else
	        {
	            if(b>c)
	                System.out.println(b+" is the biggest number among the three");
	            else
	                System.out.println(c+" is the biggest number among the three");
	        }
	    }
	        public static void main (String[]args){
	            Task22A obj = new Task22A();
	            obj.meth1(100, 25400, 350);
	        }

}
