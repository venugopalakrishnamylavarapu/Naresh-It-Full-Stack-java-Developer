package basic;

import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class ImageServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream sos=response.getOutputStream();//Here byte stream created from server to browser	
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\WallPapers\\983848.jpg");//it opens a file for reading	
		int n=fis.available();//it returns file size
		byte[] b=new byte[n];//it allocates the memory in a ram according to file size
		fis.read(b);//it will read image from file
		sos.write(b);//it will pass the image to browser
		fis.close();
	}

}
