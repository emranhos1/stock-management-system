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
public class UpdateQueryDao {
    
    static DBConnection db = new DBConnection();
    static Connection con;
    static ResultSet rs;
    static PreparedStatement pstm;
    
    public static boolean updateQueryWithWhereClause(String tableName, String columnNameANDcolumnValue, String whereCondition) throws SQLException {
        
        //Update tableName set columnName = ?, columnName = ? where whereCondition
        //System.out.println("Update "+tableName+" set "+columnNameANDcolumnValue+" where "+whereCondition);
        con = db.myConn();
        pstm = con.prepareStatement("Update "+tableName+" set "+columnNameANDcolumnValue+" where "+whereCondition);
        pstm.executeUpdate();
        pstm.close();
        return true;
    }
}