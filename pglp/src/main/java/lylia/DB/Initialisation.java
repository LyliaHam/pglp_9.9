
import java.sql.SQLException;

public class Initialisation  {
	public static void Init() throws SQLException
	{
		Gestion G = new Gestion() ;
		G.createTables();
	}
}
