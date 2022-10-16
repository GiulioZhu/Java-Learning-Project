import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private int ID;
    private float BALANCE;
    public DatabaseConnection(int id, float balance) {
        ID = id;
        BALANCE = balance;        
    }

    public void update() {
        Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:Balance.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
    
          statement.executeUpdate("drop table if exists Balance");
          statement.executeUpdate("create table Balance (ID INTEGER, BALANCE FLOAT)");
          statement.executeUpdate(String.format("insert into Balance values(%d, %f)", ID, BALANCE));
          statement.executeUpdate(String.format("insert into Balance values(%d, %f)", ID, BALANCE));
          ResultSet rs = statement.executeQuery("select * from Balance");
          while(rs.next())
          {
            // read the result set
            System.out.println("ID = " + rs.getInt("ID"));
            System.out.println("BALANCE = " + rs.getFloat("BALANCE"));
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
        }        
    }
}

/* To Run:
 * 1. Compile this file
 * 2. run: "java -classpath ".;sqlite-jdbc-3.39.3.0.jar" SampleJDBC"
*/

// Credits to xerial/sqlite-jdbc