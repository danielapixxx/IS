import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Storage {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{
		Driver d = Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		}catch (ClassNotFoundException e){
			System.out.println("Driver non trovato");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DLibrary");
	}
}
