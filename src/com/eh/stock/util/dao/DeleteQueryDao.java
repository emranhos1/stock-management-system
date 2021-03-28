package com.eh.stock.util.dao;

import com.eh.stock.util.dbconnection.DBConnection;
import com.eh.stock.util.dbconnection.conRs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class DeleteQueryDao {

    static DBConnection db = new DBConnection();
    static Connection con;
    static ResultSet rs;
    static PreparedStatement pstm;

    public static conRs deleteQueryWithWhereClause(String tableName, String whereCondition) throws SQLException {

        con = db.myConn();
        pstm = con.prepareStatement("Delete from " + tableName + " where " + whereCondition);
        pstm.executeUpdate();
        conRs conrs = new conRs(con, rs, pstm);
        return conrs;
    }
}
