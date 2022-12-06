package ClassWorkPrograms;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//this class is about byte streams
/*
see the image of stream api--bytestream in google class room to understand more accurately
  Byte Streams
  ------------
  In Byte Streams data will be transferred in the form of Bytes and each data packets is of 1 byte.
  Byte Streams contain two abstract classes
  which has classes.
  1)InputStream
      a)FileInputStream
          i)read()
            The return type of read() is int.it is going to return the ASCII values of the characters which are present in the file.
            if there are no characters present in the file then read() is going to return -1.
 2)OutputStream
      a)FileOutputStream
          i)write()
              ->int
              ->byte array
*/

public class Class52 {
	void fileOperations1() throws Exception
    {
        System.out.println("Reading the data from a file");
        FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Hello.txt");
        System.out.println("Connection created");
        int i;
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data is read");
        fis.close();
    }
    void fileOperations2() throws Exception
    {
        System.out.println("Writing the data from a file");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello1.txt",true);
        String k=" Iam from Btech Background";
       byte arr[]=k.getBytes(); //getByte() present in String Class.
        fos.write(arr);
        System.out.println("Data is updated");
        fos.close();
    }
    void fileOperations3() throws Exception
    {
        System.out.println("Copying the data from one file to another file");
        FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello1.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello2.txt");
        int i;
        while((i=fis.read())!=-1)
        {
            fos.write(i);
        }
        System.out.println("Data got copied");
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws Exception
    {
        Class52 aobj=new Class52();
       aobj.fileOperations1();
       aobj.fileOperations2();
       aobj.fileOperations3();
    }
    
    /*
    the below program in comments is written by me after the class got completed.for my fun purpose.
    
    	void fileReadMethod() throws Exception
   	{
   		FileInputStream obj=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello.txt");
   		int i;
   		while((i=obj.read())!=-1)
   		{
   			System.out.print((char)i);
   		}
   		obj.close();
   	}
   	void fileWriteMethod() throws Exception
   	{
   		FileOutputStream obj1=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello.txt",true);
   		String k="\n This is a new line write by FileOutputStream class";
   		byte arr[]=k.getBytes();
   		obj1.write(arr);
   		obj1.close();
   	}
   	void fileCopyMethod() throws Exception
   	{
   		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello.txt");
   		FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\Hello3.txt");
   		String l="\nthis file is copied from Hello.txt and this line is written by the FileOutputStream Class";
   		byte arr[]=l.getBytes();
   		int i;
   		while((i=fis.read())!=-1)
   		{
   			fos.write((char)i);
   		}
   		fos.write(arr);
   		fis.close();
   		fos.close();
   	}
   	public static void main(String[] args) throws Exception
   	{
   		Class52 aobj=new Class52();
   		aobj.fileReadMethod();
//   		aobj.fileWriteMethod();
   		aobj.fileCopyMethod();
   		
   	}
   */
}
