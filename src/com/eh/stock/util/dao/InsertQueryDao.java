package com.eh.stock.util.dao;

import com.eh.stock.util.dbconnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class InsertQueryDao {

    static DBConnection db = new DBConnection();
    static Connection con;
    static ResultSet rs;
    static PreparedStatement pstm;

    public static boolean insertQueryWithOutWhereClause(String tableName, String columnName, String values) throws SQLException {

        con = db.myConn();
        pstm = con.prepareStatement("Insert into " + tableName + "(" + columnName + ") values(" + values + ")");
        //System.out.println("Insert into " + tableName + "(" + columnName + ") values(" + values + ")");
        pstm.execute();
        pstm.close();
        return true;
    }
}