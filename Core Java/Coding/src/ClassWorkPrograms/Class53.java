package ClassWorkPrograms;
import java.io.FileReader;
import java.io.FileWriter;

/*
 todays concept is about Character Streams
 
 Character Streams
 =================
 In Character Streams data will be transferred in the form of Characters and each data packer is of 2 bytes.
 
 Like Byte Streams here also we have two abstract classes
 	i)Reader class:-
 	----------------
 	the implementation class for reader class is "FileReader".
 		->this class contains the same methods(exaclty the same as ByteStreams)
 			1)read()
 			  takes as parameter 
 			  a)int
 			  b)Byte Streams
 	
 	ii)Writer class:-
 	----------------
 	the implementation class for writer class is "FileWriter".
 		->this class contains the same methods but here write method present here accept int  or String Single 
 		   parameter
 		   1)write()
	 		   takes as parameter
	 		   a)int
	 		   b)String
 	
 */
public class Class53 {
void fileOperations1() throws Exception
{
	FileReader fr=new FileReader("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\CharacterStreams.txt");
	System.out.println("connection created");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	System.out.println();
	System.out.println("Data Retrived");
	fr.close();
}
void fileOperations2() throws Exception
{
	FileWriter fw=new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\CharacterStreams.txt",true);
	System.out.println("Connection created");
	String str="\nThis line here is written by CharacterStream";
	fw.write(str);
	System.out.println("Data Entered");
	fw.close();
}
void fileOperations3() throws Exception
{
	System.out.println("Connection Created");
	FileReader fr=new FileReader("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\CharacterStreams.txt");
	FileWriter fw=new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\CharacterStreams2.txt",true);
	String str="\nThis line here is copied from CharacterStream.txt by using CharacterStream class";
	int i;
	while((i=fr.read())!=-1)
	{
		fw.write(i);
	}
	fw.write(str);
	System.out.println("Data Copied");
	fr.close();
	fw.close();
}
public static void main(String[] args) throws Exception
{
	Class53 obj=new Class53();
//	obj.fileOperations1();
//	obj.fileOperations2();
	obj.fileOperations3();
	
}
}
