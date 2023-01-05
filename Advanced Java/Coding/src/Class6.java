import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
public class Class6 {
    public static void main(String[] args) {
        try{
            Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM", "system", "tiger");
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
