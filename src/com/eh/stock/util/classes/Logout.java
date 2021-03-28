package com.eh.stock.util.classes;

import com.eh.stock.login.Login;
import com.eh.stock.util.dao.SelectQueryDao;
import com.eh.stock.util.dao.UpdateQueryDao;
import com.eh.stock.util.dbconnection.conRs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class Logout {
    private static String columnName;
    private static String tableName;
    private static String whereCondition;
    private static conRs conrs;
    private static Connection con;
    private static ResultSet rs;
    private static PreparedStatement pstm;
    private static int loginTableId;
    private static String columnNameANDcolumnValue;
    
    public static void logout(int userId, String className, JFrame jFrameName) {
        
        try {
            columnName = " * ";
            tableName = " login ";
            whereCondition = " t_user_id = '"+ userId +"' and t_logout_date is null";
            conrs = SelectQueryDao.selectQueryWithWhereClause(columnName, tableName, whereCondition);

            con = conrs.getCon();
            rs = conrs.getRs();
            pstm = conrs.getPstm();

            while (rs.next()) {
                loginTableId = rs.getInt("t_login_table_id");

                tableName = " login ";
                columnNameANDcolumnValue = " t_logout_date = now() ";
                whereCondition = " t_login_table_id = '" + loginTableId + "'";
                UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                SYSLOG.LOG("Logout Successful with user id :"+ userId, className);
                //System.out.println("Logout Successful with user id :"+ userId +",  "+ className);
            }
        } catch (SQLException ex) {
            Logger.getLogger(className).log(Level.SEVERE, null, ex);
        } finally{
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(className).log(Level.SEVERE, null, ex);
            }
        }

        new Login().setVisible(true);
        jFrameName.dispose();
    }
}
