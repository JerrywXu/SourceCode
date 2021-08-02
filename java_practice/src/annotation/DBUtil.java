package annotation;

import java.sql.Connection;

/**
 * @author jerry
 * @Package annotation
 * @date 2021/8/2 21:16
 */
public class DBUtil {
    @DataSource(
            driver = "com.mysql.jdbc.Driver",
            url = "jdbc:mysql://localhost:3306/bjpg",
            user = "root",
            password = "root"
    )
    public Connection getConnection(){
        return null;
    }
}
