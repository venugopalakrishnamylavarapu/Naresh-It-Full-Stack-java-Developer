package ClassWorkPrograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 Buffered Streams
 ----------------
 
 Understanding Buffered Streams:-
 ---------------------------------
 1)A Buffer is a portion in the memory that is used to store stream of data.
 2)In io operations each read or write request is handled directly by the underlying operating system.
 3)This process can make the program less efficient,Because each io request which is handled by ByteStreams
   or CharacterStreams triggers disc access,network activity,or someother operations that are relatively expensive.
 4)To reduce this kind of problem java implemented Buffered IO Streams.
 5)Buffered Streams are exactly same like Byte Streams and Character Streams,but with more efficiency.
 
 
 					=>BufferedStreams are of two types:-
 					
 						-->a)BufferedByteStreams
 							1)BufferedInputStream	<--acts as a source for the (a)
 								i)FileInputStream   <--acts as a source for the above
 							2)BufferedOutputStream	<--acts as a source for the (a)
 								i)FileOutputStream	<--acts as a source for the above
 						-->b)BufferedCharacterStreams
 							1)BufferedReader	<--acts as a source for the (b)
 								i)FileReader	<--acts as a source for the above
 							2)BufferedWriter	<--acts as a source for the (b)
 								i)FileWriter	<--acts as a source for the above
 				
 				See the below syntax to understand it more easily.
 		
 	BufferedByteStreams ==>> i)  BufferedInputStream bis=new BufferedInputStream(new FileInputStream("filepath"));
 							 ii) BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("filepath"));
 	
 	BufferedCharacterStreams ==>> i)  BufferedReader br=new BufferedReader(new FileReader("filepath"));
 								  ii) BufferedWriter bw=new BufferedWriter(new FileWriter("filepath"));
 							
 */
public class Class53A {

		void fileOperations1() throws Exception
		{
			System.out.println("Implementind BufferedByteStreams for input");
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\BufferedStreams.txt"));
			System.out.println("Connection Created");
			int i;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			bis.close();
			System.out.println("Data Retrived");
		}
		void fileOperations2() throws Exception
		{
			System.out.println("Implementinf BufferedByteStreams for output");
			BufferedReader bos=new BufferedReader(new FileReader("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\BufferedStreams.txt"));
			BufferedWriter bwr=new BufferedWriter(new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\BufferedStreams1.txt",true));
			int i;
			while((i=bos.read())!=-1)
			{
				bwr.write(i);
			}
			System.out.println();
			System.out.println("Data is Copied");
			bwr.close();
		}
		public static void main(String[] args) {
			
		}
}
