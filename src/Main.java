
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionPool jdbcConnectionPool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa", "secret");

        Connection connection = jdbcConnectionPool.checkOut();
        jdbcConnectionPool.checkIn(connection);
    }
}