import java.sql.*;

public class Gestion 
{
	public Connection connect ;

	public Gestion () throws SQLException 
	{
		this.connect = getConnection();
	}
	 
	private static Connection getConnection() throws SQLException 
	{
		return DriverManager.getConnection("jdbc:hsqldb:file:db/Draws", "default", "");   
	}
	    
	public void Creation() throws SQLException
	{
		Statement statement = connect.createStatement();
		statement.execute("CREATE TABLE IF NOT EXISTS  Affichage (name VARCHAR(50))");
	    statement.execute("CREATE TABLE IF NOT EXISTS cercle (name VARCHAR(50), center_x INT, center_y INT, radius INT, drawName VARCHAR(50))");
	    statement.execute("CREATE TABLE IF NOT EXISTS  carree (name VARCHAR(50), point_x INT, point_y INT, side INT, drawName VARCHAR(50))");
	    statement.execute("CREATE TABLE IF NOT EXISTS rectangle (name VARCHAR(50), point_x INT, point_y INT, side INT, secondSide INT, drawName VARCHAR(50))");
	    statement.execute("CREATE TABLE IF NOT EXISTS  Triangle (name VARCHAR(50), vertex_x INT, vertex_y INT, height INT, side INT, drawName VARCHAR(50))");

	}
	
	public void SUppression() throws SQLException
	{
		Statement statement = connect.createStatement();
		statement.execute("DROP TABLE Affichage");
		statement.execute("DROP TABLE carree");
		statement.execute("DROP TABLE cercle");
		statement.execute("DROP TABLE rectangle");
		statement.execute("DROP TABLE triange");

	}
	public void Fermeture() throws SQLException
	{
		 Connection c = DriverManager.getConnection("jdbc:hsqldb:file:db/Draws;shutdown=true", "default", "");
		 c.clearWarnings();
	}
	
	

}
