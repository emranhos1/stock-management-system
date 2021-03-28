package com.eh.stock.login;

import com.eh.stock.util.classes.OffsetUtil;
import com.eh.stock.util.classes.SYSLOG;
import com.eh.stock.util.dao.InsertQueryDao;
import com.eh.stock.util.dao.SelectQueryDao;
import com.eh.stock.util.dbconnection.conRs;
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
public class Signup extends javax.swing.JFrame {
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private String columnName;
    private String tableName;
    private String whereCondition;
    private String values;

    public Signup() {
        initComponents();
        getGenderCombo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        nidLabel = new javax.swing.JLabel();
        nidNoTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        signupPanel = new javax.swing.JPanel();
        signupbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        loginbtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        ExitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(145, 77, 125));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(145, 77, 125));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eh/stock/util/images/com-name_100X100.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright by Md. Emran Hossain || emranhos1@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(171, 92, 92));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        firstNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name : ");
        firstNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        firstNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameTextField.setToolTipText("username");
        firstNameTextField.setBorder(null);

        lastNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("First Name : ");
        lastNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lastNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameTextField.setToolTipText("username");
        lastNameTextField.setBorder(null);

        phoneNoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNoLabel.setText("Phone No : ");
        phoneNoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        phoneNoTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNoTextField.setToolTipText("username");
        phoneNoTextField.setBorder(null);

        addressLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLabel.setText("Address : ");
        addressLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        genderLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("Gender : ");
        genderLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        genderComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));

        nidLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nidLabel.setForeground(new java.awt.Color(255, 255, 255));
        nidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nidLabel.setText("NID No : ");
        nidLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        nidNoTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nidNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nidNoTextField.setToolTipText("username");
        nidNoTextField.setBorder(null);

        passwordLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password : ");
        passwordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

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

        signupbtn.setBackground(new java.awt.Color(186, 79, 84));
        signupbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupbtn.setText("SIGN UP");
        signupbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout signupPanelLayout = new javax.swing.GroupLayout(signupPanel);
        signupPanel.setLayout(signupPanelLayout);
        signupPanelLayout.setHorizontalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        signupPanelLayout.setVerticalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setBackground(new java.awt.Color(171, 92, 92));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Already have an account");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loginPanel.setBackground(new java.awt.Color(171, 92, 92));
        loginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        loginbtn.setBackground(new java.awt.Color(186, 79, 84));
        loginbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(nidNoTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNoTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTextField)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nidNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(108, 163, 93));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(108, 163, 93));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign up Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        exitPanel.setBackground(new java.awt.Color(108, 163, 93));
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

        ExitLabel.setBackground(new java.awt.Color(108, 163, 93));
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitPanelMouseClicked

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
        OffsetUtil.BtnColorChange(exitPanel, 237, 100, 100);
    }//GEN-LAST:event_exitPanelMouseEntered

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
        OffsetUtil.BtnColorChange(exitPanel, 108,163,93);
    }//GEN-LAST:event_exitPanelMouseExited

    private void signupPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseClicked
        String firstName = firstNameTextField.getText();
        String lastName  = lastNameTextField.getText();
        String phoneNo   = phoneNoTextField.getText();
        String address   = addressTextArea.getText();
        int gender       = genderComboBox.getSelectedIndex();
        String nidNo     = nidNoTextField.getText();
        char[] pass      = passwordField.getPassword();
        String userPass  = String.valueOf(pass);

        if (!firstName.isEmpty()){
            if (!lastName.isEmpty()){
                if (!phoneNo.isEmpty()){
                    boolean valPhone = OffsetUtil.validatePhone(phoneNo);
                    if (valPhone){
                        if (!address.isEmpty()){
                            if (gender !=0){
                                if (!nidNo.isEmpty()){
                                    if (!userPass.isEmpty()){
                                        columnName = " t_phone_no ";
                                        tableName = " user ";
                                        whereCondition = " t_phone_no = '"+phoneNo+"'";
                                        try {
                                            conRs hasPhone = SelectQueryDao.selectQueryWithWhereClause(columnName, tableName, whereCondition);
                                            con = hasPhone.getCon();
                                            rs = hasPhone.getRs();
                                            pstm = hasPhone.getPstm();

                                            if (!rs.next()) {
                                                columnName = " t_entry_date, t_gender_code, t_lang2_fname, t_lang2_lname, t_nid_no, t_password, t_phone_no, t_address, t_status ";
                                                tableName = " user ";
                                                values = "now(), '" + gender + "', '" + firstName +"', '"+ lastName +"', '"+ nidNo +"', MD5('"+ userPass +"'), '"+ phoneNo +"', '"+ address +"', '2' ";
                                                try {
                                                    boolean addUser = InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                                                    if (addUser){
                                                        new Message("Registration Successful!", "success-icon-128X128.png", true).setVisible(true);
                                                        clearAll();
                                                    } else {
                                                        new Message("Registration Unsuccessful!", "unsuccess-icon128X128.png", false).setVisible(true);
                                                    }
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                                                    SYSLOG.LOG(""+ ex, Signup.class.getName());
                                                }
                                            } else {
                                                new Message("Phone No is already exist please try another one!", "unsuccess-icon128X128.png", false).setVisible(true);
                                            }
                                        } catch (SQLException ex) {
                                            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                                            SYSLOG.LOG(""+ ex, Signup.class.getName());
                                        } finally {
                                            try {
                                                con.close();
                                                rs.close();
                                                pstm.close();
                                            } catch (SQLException ex) {
                                                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                                                SYSLOG.LOG(""+ ex, Signup.class.getName());
                                            }
                                        }
                                        
                                        
                                    } else{
                                        new Message("Insert Password!", "empty-icon128X128.png", false).setVisible(true);
                                    }
                                } else{
                                    new Message("Insert NID No!", "empty-icon128X128.png", false).setVisible(true);
                                }
                            } else{
                                new Message("Select Gender!", "empty-icon128X128.png", false).setVisible(true);
                            }
                        } else{
                            new Message("Insert Address!", "empty-icon128X128.png", false).setVisible(true);
                        }
                    } else{
                        new Message("Phone No is invalid!", "unsuccess-icon128X128.png", false).setVisible(true);
                    }
                } else{
                    new Message("Insert Phone No!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else{
                new Message("Insert Last Name!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else{
            new Message("Insert First Name!", "empty-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_signupPanelMouseClicked

    private void signupPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseEntered
        OffsetUtil.BtnColorChange(signupPanel, 139, 235, 110);
    }//GEN-LAST:event_signupPanelMouseEntered

    private void signupPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseExited
        OffsetUtil.BtnColorChange(signupPanel, 171, 92, 92);
    }//GEN-LAST:event_signupPanelMouseExited

    private void loginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPanelMouseClicked

    private void loginPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseEntered
        OffsetUtil.BtnColorChange(loginPanel, 139, 235, 110);
    }//GEN-LAST:event_loginPanelMouseEntered

    private void loginPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseExited
        OffsetUtil.BtnColorChange(loginPanel, 171, 92, 92);
    }//GEN-LAST:event_loginPanelMouseExited

    public final void clearAll(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        phoneNoTextField.setText("");
        addressTextArea.setText("");
        genderComboBox.setSelectedIndex(0);
        nidNoTextField.setText("");
        passwordField.setText("");
    }
    
    public final void getGenderCombo(){
        columnName = "t_lang2_name";
        tableName = "gender";
        
        try {
            conRs allGender = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con = allGender.getCon();
            rs = allGender.getRs();
            pstm = allGender.getPstm();
            
            while (rs.next()) {
                String genderName = rs.getString("t_lang2_name");
                genderComboBox.addItem(genderName);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Signup.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Signup.class.getName());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JLabel nidLabel;
    private javax.swing.JTextField nidNoTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JLabel signupbtn;
    // End of variables declaration//GEN-END:variables
}
