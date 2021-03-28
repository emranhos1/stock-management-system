package com.eh.stock.util.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class DBConnection {

    Connection con = null;
    static final String url = "jdbc:mysql://localhost:3306/";
//  it's MySql driver class, make sure MySql JDBC Driver libery add in class path
    static final String driver = "com.mysql.jdbc.Driver";
//    ==============user can chage this vareable value as there need======================
    static final String dbName = "grosary-shop-exam";//user database name or schema name
    static final String dbUserName = "root";//user database user name 
    static final String dbPassword = "medisys";//user database password

    public Connection myConn() throws SQLException {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + dbName, dbUserName, dbPassword);
            return con;//it return connection
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
