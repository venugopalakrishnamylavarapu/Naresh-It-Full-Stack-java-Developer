package ClassWorkPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 Object Streams
 ==============
 Object Streams are used to write a Java Class object into a file this process is known as 
 Serialization.
 
 Serialization
 -------------
 1)The process of writing an object into a file is called serialization.
 2)in simple it is a process of converting an object from java supported version to network suppourted version or 
   file supported version is called Serialization.
 3)In order to perform serialization we need to use Object Streams.
 4)Transient variables(variables which is having transient keyword) will not participate in Serialization.
 
 ObjectStream contains two classes
 		a)Object
 
 */
public class Class54A
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Implementing Object Streams");
		
		Class54B bobj1=new Class54B();
		Class54C cobj1=new Class54C();
		
		System.out.println(bobj1.a+"  "+bobj1.b);//10 20
		System.out.println(cobj1.x+"  "+cobj1.y);//100 200
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\ObjectStream.ser"));
		System.out.println("Connection created");
		
		oos.writeObject(bobj1);
		oos.writeObject(cobj1);
		
		System.out.println("Serialization completed");
		oos.close();
		
		System.out.println("-----------------Deserialization started");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\ObjectStream.ser"));
		
		Class54B bobj2=(Class54B)ois.readObject();
		Class54C cobj2=(Class54C)ois.readObject();
		
		System.out.println(bobj1.a+"  "+bobj2.b);
		System.out.println(cobj1.x+"  "+cobj1.y);
		ois.close();
	}
}
