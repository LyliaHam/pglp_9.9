import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DAO<T> {
	
	public T create(T obj);

	public T update(T obj);

	public T delete(String name);

	public T find(String name);

	public static Connection getConnection() {
		
	    Connection connexion = null;
	    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	    try {
	      Class.forName(driver);
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	    try {
	      connexion = DriverManager.getConnection("jdbc:derby:shapedb;create=true");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return connexion;
	  }
}	  
