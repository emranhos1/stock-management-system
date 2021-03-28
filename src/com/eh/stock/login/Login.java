package com.eh.stock.login;

import com.eh.stock.admin.AdminDashboard;
import com.eh.stock.adminsupper.SupperAdminDashboard;
import com.eh.stock.employee.EmployeeDashboard;
import com.eh.stock.util.classes.OffsetUtil;
import com.eh.stock.util.classes.SYSLOG;
import com.eh.stock.util.dao.InsertQueryDao;
import com.eh.stock.util.dao.SelectQueryDao;
import com.eh.stock.util.dbconnection.conRs;
import com.eh.stock.util.message.AccessDenied;
import com.eh.stock.util.message.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class Login extends javax.swing.JFrame {

    private String phoneNo;
    private char[] pass;
    private String userPass;
    private String columnName;
    private String tableName;
    private String onCondition;
    private String whereCondition;
    private conRs conrs;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private int userId;
    private String role;
    private String roleShortName;
    private String values;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userpic = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        userpic1 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        loginPanel = new javax.swing.JPanel();
        loginbtn = new javax.swing.JLabel();
        signupPanel = new javax.swing.JPanel();
        signupbtn = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        ExitLabel = new javax.swing.JLabel();
        forgetPassLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(145, 77, 125));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(145, 77, 125));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eh/stock/util/images/com-name_100X100.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright by Md. Emran Hossain || emranhos1@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(171, 92, 92));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userpic.setBackground(new java.awt.Color(171, 92, 92));
        userpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eh/stock/util/images/user-icon24X24.png"))); // NOI18N
        userpic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        phoneNoTextField.setBackground(new java.awt.Color(171, 92, 92));
        phoneNoTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        phoneNoTextField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNoTextField.setToolTipText("username");
        phoneNoTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userpic1.setBackground(new java.awt.Color(171, 92, 92));
        userpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eh/stock/util/images/password-icon24X24.png"))); // NOI18N
        userpic1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passwordTextField.setBackground(new java.awt.Color(171, 92, 92));
        passwordTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        loginPanel.setBackground(new java.awt.Color(171, 92, 92));
        loginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginPanelMouseExited(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(171, 92, 92));
        loginbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtn.setText("LOG IN");
        loginbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        signupPanel.setBackground(new java.awt.Color(171, 92, 92));
        signupPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupPanelMouseExited(evt);
            }
        });

        signupbtn.setBackground(new java.awt.Color(171, 92, 92));
        signupbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupbtn.setText("SIGN UP");
        signupbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout signupPanelLayout = new javax.swing.GroupLayout(signupPanel);
        signupPanel.setLayout(signupPanelLayout);
        signupPanelLayout.setHorizontalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        signupPanelLayout.setVerticalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        exitPanel.setBackground(new java.awt.Color(171, 92, 92));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPanelMouseExited(evt);
            }
        });

        ExitLabel.setBackground(new java.awt.Color(171, 92, 92));
        ExitLabel.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        ExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitLabel.setText("X");
        ExitLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitLabel)
        );

        forgetPassLabel.setBackground(new java.awt.Color(171, 92, 92));
        forgetPassLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        forgetPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgetPassLabel.setText("Forget Password?");
        forgetPassLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        forgetPassLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPassLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(userpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(userpic, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addComponent(exitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(forgetPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userpic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTextField)
                            .addComponent(userpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(forgetPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseEntered
        OffsetUtil.BtnColorChange(loginPanel, 139, 235, 110);
    }//GEN-LAST:event_loginPanelMouseEntered

    private void loginPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseExited
        OffsetUtil.BtnColorChange(loginPanel, 171, 92, 92);
    }//GEN-LAST:event_loginPanelMouseExited

    private void signupPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseEntered
        OffsetUtil.BtnColorChange(signupPanel, 139, 235, 110);
    }//GEN-LAST:event_signupPanelMouseEntered

    private void signupPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseExited
        OffsetUtil.BtnColorChange(signupPanel, 171, 92, 92);
    }//GEN-LAST:event_signupPanelMouseExited

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
        OffsetUtil.BtnColorChange(exitPanel, 237, 100, 100);
    }//GEN-LAST:event_exitPanelMouseEntered

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
        OffsetUtil.BtnColorChange(exitPanel, 171, 92, 92);
    }//GEN-LAST:event_exitPanelMouseExited

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitPanelMouseClicked

    private void loginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseClicked
        phoneNo = phoneNoTextField.getText();
        pass = passwordTextField.getPassword();
        userPass = String.valueOf(pass);
        
        if(!phoneNo.isEmpty()){
            if (!userPass.isEmpty()) {
                columnName = " u.t_user_id, u.t_password, u.t_status, u.t_role_id, r.t_short_role_name ";
                tableName = " user u left join role r ";
                onCondition = " (u.t_role_id = r.t_role_id) ";
                whereCondition = " u.t_phone_no = ? and u.t_password = MD5(?) and t_status = '1' ";
                
                try {
                    conrs = SelectQueryDao.selectQueryWithJoinClauseForLogin(columnName, tableName, onCondition, whereCondition, phoneNo, userPass);
                    con = conrs.getCon();
                    rs = conrs.getRs();
                    pstm = conrs.getPstm();
                    
                   if (rs.next()) {
                        userId = rs.getInt("t_user_id");
                        roleShortName = rs.getString("t_short_role_name");

                        switch (roleShortName) {
                            case "SUPADM":
                                role = "supperAdmin";
                                break;
                            case "ADM":
                                role = "admin";
                                break;
                            case "EMP":
                                role = "employee";
                                break;
                        }

                        switch (role) {
                            case "supperAdmin": {
                                new SupperAdminDashboard().setVisible(true);
                                this.dispose();
                                break;
                            }
                            case "admin": {
                                new AdminDashboard(userId).setVisible(true);
                                this.dispose();
                                break;
                            }
                            case "employee": {
                                new EmployeeDashboard(userId).setVisible(true);
                                this.dispose();
                                break;
                            }
                        }

                        //=== login history ===//
                        columnName = " t_login_date, t_user_id ";
                        tableName = " login ";
                        values = "now(), '" + userId + "'";
                        InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                        SYSLOG.LOG("Login Successful with user id :"+ userId, Login.class.getName());
                        //=== login history ===//
                    } else {
                       new Message("Please contact Admin for active your account!", "not-user-icon128X128.png", false).setVisible(true);
                    } 
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    SYSLOG.LOG("From Login :"+ ex, Login.class.getName());
                } finally {
                    try {
                        con.close();
                        rs.close();
                        pstm.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        SYSLOG.LOG("From Login :"+ ex, Login.class.getName());
                    }
                }
            } else {
                new Message("Insert Password!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Insert Username!", "empty-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_loginPanelMouseClicked

    private void forgetPassLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPassLabelMouseClicked
        new AccessDenied().setVisible(true);
    }//GEN-LAST:event_forgetPassLabelMouseClicked

    private void signupPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseClicked
        new Signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel forgetPassLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JLabel signupbtn;
    private javax.swing.JLabel userpic;
    private javax.swing.JLabel userpic1;
    // End of variables declaration//GEN-END:variables
}
