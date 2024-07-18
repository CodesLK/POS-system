package pos.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database{
    public  Database() throws SQLException {
    }
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "");
            Statement stmt =conn.createStatement();


    public Statement Connection() throws SQLException {
        return stmt;
    }
        public String insertdata(String insertquery) throws SQLException {
            String rs = String.valueOf(stmt.executeQuery(insertquery));
            conn.close();
            return rs;
        }


    }
