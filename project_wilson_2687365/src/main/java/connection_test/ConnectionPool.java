package connection_test;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
public class ConnectionPool {
    private static String url = "jdbc:mysql://localhost:3306/registro?serverTimezone=America/Bogota";
    private static String user = "wilson";
    private static String pass = "wilson1234";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);pool.setUsername(user);
            pool.setPassword(pass);
            pool.setInitialSize(5);
            pool.setMinIdle(5);
            pool.setMaxIdle(10); 
            pool.setMaxTotal(10);
        }
        return pool;
    }
    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
}
}  // ConnectionPool