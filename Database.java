import java.sql.*;

public class Database {
    private String dbuser;
    private String dbpassword;
    private Connection conn;

    public Database(String dbuser, String dbpassword) {
        this.dbuser = dbuser;
        this.dbpassword = dbpassword;
        connectToDatabase();
    }
    
    private void connectToDatabase() {
        System.out.println("Connecting to database with user: " + dbuser);

        try {
            conn =
            DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                                        "user="+dbuser+"&password="+dbpassword);

            // Do something with the Connection


        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public void execute(String query){
        System.out.println("Executing query: " + query);
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("transaction ID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
