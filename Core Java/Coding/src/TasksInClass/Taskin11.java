package TasksInClass;

//find the output without using run(console)

public class Taskin11 {
	Taskin11(int a){
		System.out.println("Hi");
		new Taskin11(10,20);
	}
	Taskin11(int a,int b){
		System.out.println("Hello");
	}
	Taskin11(String s){
		System.out.println("s");
		new Taskin11(100);
	}
	public static void main(String[] args) {
		new Taskin11("Java is Awesome!!");
	}

}
