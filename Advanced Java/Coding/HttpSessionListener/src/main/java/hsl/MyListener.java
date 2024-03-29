package hsl;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {
	int count;
    public void sessionCreated(HttpSessionEvent se)  { 
    	count++;
    	HttpSession hs=se.getSession();
    	hs.setAttribute("users", count);
    }
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	count--;
    	HttpSession hs=se.getSession();
    	hs.setAttribute("users", count);
    }
	
}
