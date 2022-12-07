package ClassWorkPrograms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 Data Streams
 ============
 ->Data Streams are used to transfer primitive data types in a secure manner.DataStreams are also known as Filter Streams.
 
 *In Data Streams there are two interfaces
 	a)DataInput
 			implementation class is
 			DataInputStream ---------> FileInputStream
 			 				  source 
 	
 	b)DataOutput
 			implementation class is
 			DataOutputStream ---------> FileOutputStream
 			 				  source 
 			 				  
Order is important to retrive if not given in a correct order then we'll get unformed data.
 			
 
 
 */
public class Class54 
{
	void fileOperations() throws Exception
	{
		System.out.println("Implementing DataStreams");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\DataStreams.txt"));
		 dos.writeInt(1000);
		 dos.writeChar('A');
		 dos.writeBoolean(true);
		 dos.writeInt(2000);
		 
		 System.out.println("Data entered in a secured manner");
		 dos.close();
		 System.out.println("-------------------------------------------------");
		 DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\DataStreams.txt"));
		 
		 System.out.println(dis.readInt());
		 System.out.println(dis.readChar());
		 System.out.println(dis.readBoolean());
		 System.out.println(dis.readInt());
		 
		 System.out.println("Data Retrived");
		 dis.close();
	}
	public static void main(String[] args) throws Exception
	{
		new Class54().fileOperations();
	}
}
