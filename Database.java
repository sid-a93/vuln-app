import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "myuser";
    private static final String PASS = "mypass";

    public static Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        properties.put("user", USER);
        properties.put("password", PASS);
        return DriverManager.getConnection(DB_URL, properties);
    }
}