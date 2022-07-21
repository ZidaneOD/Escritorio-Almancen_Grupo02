package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConMySQL {

    static ConMySQL instance = null;
    Connection connection = null;

    public ConMySQL() throws Exception {
        String url = "jdbc:mysql://localhost:3306/g4almacen";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, "root", "");
    }

    public static ConMySQL getInstance() throws Exception {
        if (instance == null) {
            instance = new ConMySQL();
        }
        return instance;

    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    protected void finalize() throws Throwable {
        connection.close();
        connection = null;
        super.finalize();
    }
}
