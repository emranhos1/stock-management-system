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
public class SelectQueryDao {

    static DBConnection db = new DBConnection();
    static Connection con;
    static ResultSet rs;
    static PreparedStatement pstm;

    public static conRs selectQueryWithOutWhereClause(String columnName, String tableName) throws SQLException {
        //neededColumn :: company_id & whereClause :: company_id = (Select Max(company_id) from company)
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
        return conrs;
    }

    public static conRs selectQueryWithWhereClause(String columnName, String tableName, String whereCondition) throws SQLException {
        //neededColumn :: company_id & whereClause :: company_id = (Select Max(company_id) from company)
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName + " where " + whereCondition);
        //System.out.println("Select " + columnName + " from " + tableName + " where " + whereCondition);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
        return conrs;
    }

    public static conRs selectQueryWithJoinClauseForLogin(String columnName, String tableName, String onCondition, String whereCondition, String username, String password) throws SQLException {
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName + " on " + onCondition + " where " + whereCondition);
        //System.out.println("Select " + columnName + " from " + tableName + " on " + onCondition + " where " + whereCondition);
        pstm.setString(1, username);
        pstm.setString(2, password);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
        return conrs;
    }
    
    public static conRs selectQueryWithJoinWhere(String columnName, String tableName, String onCondition, String whereCondition) throws SQLException {
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName + " on " + onCondition + " where " + whereCondition);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
//        System.out.println("Select " + columnName + " from " + tableName + " on " + onCondition);
        return conrs;
    }
    public static conRs selectQueryWithJoinClause(String columnName, String tableName, String onCondition) throws SQLException {
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName + " on " + onCondition);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
//        System.out.println("Select " + columnName + " from " + tableName + " on " + onCondition);
        return conrs;
    }
    
    public static conRs selectQueryWithGroupBy(String columnName, String tableName, String groupBy) throws SQLException {
        con = db.myConn();
        pstm = con.prepareStatement("Select " + columnName + " from " + tableName + " GROUP BY " + groupBy);
        rs = pstm.executeQuery();
        conRs conrs = new conRs(con, rs, pstm);
//        System.out.println("Select " + columnName + " from " + tableName + " on " + onCondition);
        return conrs;
    }
}
