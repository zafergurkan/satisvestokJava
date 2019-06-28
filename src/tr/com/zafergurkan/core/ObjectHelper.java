package tr.com.zafergurkan.core;
import java.sql.Connection;
import tr.com.zafergurkan.interfaces.CoreInterfaces;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ObjectHelper extends CoreFields implements CoreInterfaces {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
