package com.eh.stock.admin;

import com.eh.stock.product.Product;
import com.eh.stock.util.classes.Logout;
import com.eh.stock.util.classes.OffsetUtil;
import com.eh.stock.util.classes.SYSLOG;
import com.eh.stock.util.dao.SelectQueryDao;
import com.eh.stock.util.dao.UpdateQueryDao;
import com.eh.stock.util.dbconnection.conRs;
import com.eh.stock.util.message.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class AllUser extends javax.swing.JFrame {
    private final int userID;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private String tableName;
    private String columnName;
    private String onCondition;
    private String whereCondition;
    private String columnNameANDcolumnValue;

    public AllUser(int adminId) {
        userID = adminId;
        initComponents();
        getAllUser();
        getGenderCombo();
        getRoleCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        logoutPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        productPanel = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        allUserPanel = new javax.swing.JPanel();
        allUserLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        updateBtn = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        userIdTextField = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        roleLabel = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();
        nidLabel = new javax.swing.JLabel();
        nidNoTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        footerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        headPanel.setBackground(new java.awt.Color(108, 163, 93));
        headPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(108, 163, 93));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin Dashboard");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headPanelLayout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(19, 19, 19)))
        );

        navPanel.setBackground(new java.awt.Color(38, 89, 24));
        navPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logoutPanel.setBackground(new java.awt.Color(38, 89, 24));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutPanelMouseExited(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eh/stock/util/images/logout-icon32X32.png"))); // NOI18N
        logoutLabel.setText("Logout");
        logoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        productPanel.setBackground(new java.awt.Color(38, 89, 24));
        productPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productPanelMouseExited(evt);
            }
        });

        productLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("Product");
        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        customerPanel.setBackground(new java.awt.Color(38, 89, 24));
        customerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerPanelMouseExited(evt);
            }
        });

        customerLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLabel.setText("Customer");
        customerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        allUserPanel.setBackground(new java.awt.Color(38, 89, 24));
        allUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allUserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allUserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allUserPanelMouseExited(evt);
            }
        });

        allUserLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        allUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        allUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allUserLabel.setText("All User");
        allUserLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout allUserPanelLayout = new javax.swing.GroupLayout(allUserPanel);
        allUserPanel.setLayout(allUserPanelLayout);
        allUserPanelLayout.setHorizontalGroup(
            allUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allUserLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        allUserPanelLayout.setVerticalGroup(
            allUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator3.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator4.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator5.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        homePanel.setBackground(new java.awt.Color(38, 89, 24));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanelMouseExited(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        homeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jSeparator6.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator7.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(161, 103, 103));
        bodyPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(161, 103, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New User", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        updatePanel.setBackground(new java.awt.Color(161, 103, 103));
        updatePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePanelMouseExited(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(186, 79, 84));
        updateBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        userIdLabel.setBackground(new java.awt.Color(161, 103, 103));
        userIdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        userIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIdLabel.setText("User Id : ");
        userIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userIdTextField.setEditable(false);
        userIdTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userIdTextField.setToolTipText("username");
        userIdTextField.setBorder(null);

        phoneNoLabel.setBackground(new java.awt.Color(161, 103, 103));
        phoneNoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNoLabel.setText("Phone No : ");
        phoneNoLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        phoneNoTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNoTextField.setToolTipText("username");
        phoneNoTextField.setBorder(null);

        firstNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        firstNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name : ");
        firstNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        firstNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameTextField.setToolTipText("username");
        firstNameTextField.setBorder(null);

        lastNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        lastNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("Last Name : ");
        lastNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lastNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameTextField.setToolTipText("username");
        lastNameTextField.setBorder(null);

        emailLabel.setBackground(new java.awt.Color(161, 103, 103));
        emailLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email  : ");
        emailLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emailTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTextField.setToolTipText("username");
        emailTextField.setBorder(null);

        addressLabel.setBackground(new java.awt.Color(161, 103, 103));
        addressLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLabel.setText("Address : ");
        addressLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane2.setViewportView(addressTextArea);

        genderLabel.setBackground(new java.awt.Color(161, 103, 103));
        genderLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("Gender : ");
        genderLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        genderComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));

        roleLabel.setBackground(new java.awt.Color(161, 103, 103));
        roleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleLabel.setText("Role : ");
        roleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        roleComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));

        nidLabel.setBackground(new java.awt.Color(161, 103, 103));
        nidLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nidLabel.setForeground(new java.awt.Color(255, 255, 255));
        nidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nidLabel.setText("NID No : ");
        nidLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nidNoTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nidNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nidNoTextField.setToolTipText("username");
        nidNoTextField.setBorder(null);

        statusLabel.setBackground(new java.awt.Color(161, 103, 103));
        statusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("Status :");
        statusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        statusComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Active", "Inactive" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nidNoTextField))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(userIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameTextField)))
                        .addGap(18, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nidNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(161, 103, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "User List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        userTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Id", "First Name", "Last Name", "Phone No", "Address", "Email", "Nid No", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1071, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jSeparator1.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator2.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        footerPanel.setBackground(new java.awt.Color(108, 163, 93));
        footerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("M/S ERE || Md. Emran Hossain || 01670932273 || emranhos1@gmail.com");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked

        String userId    = userIdTextField.getText();
        String phoneNo   = phoneNoTextField.getText();
        String firstName = firstNameTextField.getText();
        String lastName  = lastNameTextField.getText();
        String email     = emailTextField.getText();
        String address   = addressTextArea.getText();
        int genderCombo  = genderComboBox.getSelectedIndex();
        int roleCombo    = roleComboBox.getSelectedIndex();
        String nidNo     = nidNoTextField.getText();
        int statusCombo  = statusComboBox.getSelectedIndex();

        if (!userId.equals("")){
            if (!phoneNo.equals("")){
                if (OffsetUtil.validatePhone(phoneNo)){
                    if (!firstName.isEmpty()){
                        if (!lastName.isEmpty()){
                            if (!email.isEmpty()){
                                if (!address.isEmpty()){
                                    if (genderCombo !=0){
                                        if (roleCombo !=0){
                                            if (!nidNo.isEmpty()){
                                                if (statusCombo !=0){
                                                    tableName = " user ";
                                                    columnNameANDcolumnValue = " t_address='"+address+"', t_upd_date=now(), t_upd_user='"+userID+"',"
                                                            + "t_email='"+email+"',t_gender_code='"+genderCombo+"', t_lang2_fname = '" + firstName + "',"
                                                            + " t_lang2_lname='" + lastName+ "',t_nid_no='"+nidNo+"',t_role_id='"+roleCombo+"', t_status='"+statusCombo+"' ";
                                                    whereCondition = " t_user_id = '" + userId + "'";

                                                    try {
                                                        boolean isUpdate = UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                                                        if (isUpdate) {
                                                            new Message("User Update Successfully!", "success-icon-128X128.png", true).setVisible(true);
                                                            OffsetUtil.refreshTable(userTable);
                                                            getAllUser();
                                                            clearAll();
                                                        } else {
                                                            new Message("User Update Unsuccessfully!", "unsuccess-icon128X128.png", false).setVisible(true);
                                                        }
                                                    } catch (SQLException ex) {
                                                        Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
                                                        SYSLOG.LOG(""+ ex, AllUser.class.getName());
                                                    }
                                                } else {
                                                    new Message("Select Status!", "empty-icon128X128.png", false).setVisible(true);
                                                }
                                            } else {
                                                new Message("Insert Nid No!", "empty-icon128X128.png", false).setVisible(true);
                                            }
                                        } else {
                                            new Message("Select Role!", "empty-icon128X128.png", false).setVisible(true);
                                        }
                                    } else {
                                        new Message("Select Gender!", "empty-icon128X128.png", false).setVisible(true);
                                    }
                                } else {
                                    new Message("Insert Address!", "empty-icon128X128.png", false).setVisible(true);
                                }
                            } else{
                                new Message("Insert Email!", "empty-icon128X128.png", false).setVisible(true);
                            }
                        } else {
                            new Message("Insert Last Name!", "empty-icon128X128.png", false).setVisible(true);
                        }
                    } else {
                        new Message("Insert First Name!", "empty-icon128X128.png", false).setVisible(true);
                    }
                } else {
                    new Message("Phone No is not valid!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Insert Phone No!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try Sign up first then do this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void updatePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseEntered
        OffsetUtil.BtnColorChange(updatePanel, 139, 235, 110);
    }//GEN-LAST:event_updatePanelMouseEntered

    private void updatePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseExited
        OffsetUtil.BtnColorChange(updatePanel, 161, 103, 103);
    }//GEN-LAST:event_updatePanelMouseExited

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRow       = userTable.getSelectedRow();
        String userId         = model.getValueAt(selectedRow, 0).toString();

        columnName     = "u.*, g.t_lang2_name genderName, r.t_lang2_name roleName";
        tableName      = "user u LEFT JOIN gender g";
        onCondition    = "u.t_gender_code = g.t_gender_code LEFT JOIN role r ON u.t_role_id = r.t_role_id";
        whereCondition = "u.t_user_id='"+userId+"'";

        try {
            conRs user = SelectQueryDao.selectQueryWithJoinWhere(columnName, tableName, onCondition, whereCondition);
            con = user.getCon();
            rs = user.getRs();
            pstm = user.getPstm();

            if (rs.next()) {
                userIdTextField.setText(rs.getString("t_user_id"));
                phoneNoTextField.setText(rs.getString("t_phone_no"));
                firstNameTextField.setText(rs.getString("t_lang2_fname"));
                lastNameTextField.setText(rs.getString("t_lang2_lname"));
                emailTextField.setText(rs.getString("t_email"));
                addressTextArea.setText(rs.getString("t_address"));
                genderComboBox.setSelectedItem(rs.getString("genderName"));
                String role = rs.getString("roleName");
                if (role != null){
                    roleComboBox.setSelectedItem(rs.getString("roleName"));
                } else {
                    roleComboBox.setSelectedItem("Select One");
                }
                statusComboBox.setSelectedItem((rs.getString("t_status").equals("1")) ? "Active" : "Inactive");
                nidNoTextField.setText(rs.getString("t_nid_no"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, AllUser.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, AllUser.class.getName());
            }
        }
    }//GEN-LAST:event_userTableMouseClicked

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        OffsetUtil.BtnColorChange(homePanel, 38, 89, 24);
    }//GEN-LAST:event_homePanelMouseExited

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        OffsetUtil.BtnColorChange(homePanel, 139, 235, 110);
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        new AdminDashboard(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePanelMouseClicked

    private void allUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseExited
        OffsetUtil.BtnColorChange(allUserPanel, 38, 89, 24);
    }//GEN-LAST:event_allUserPanelMouseExited

    private void allUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseEntered
        OffsetUtil.BtnColorChange(allUserPanel, 139, 235, 110);
    }//GEN-LAST:event_allUserPanelMouseEntered

    private void allUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseClicked

    }//GEN-LAST:event_allUserPanelMouseClicked

    private void customerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseExited
        OffsetUtil.BtnColorChange(customerPanel, 38, 89, 24);
    }//GEN-LAST:event_customerPanelMouseExited

    private void customerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseEntered
        OffsetUtil.BtnColorChange(customerPanel, 139, 235, 110);
    }//GEN-LAST:event_customerPanelMouseEntered

    private void customerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseClicked
        new Customer(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerPanelMouseClicked

    private void productPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseExited
        OffsetUtil.BtnColorChange(productPanel, 38, 89, 24);
    }//GEN-LAST:event_productPanelMouseExited

    private void productPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseEntered
        OffsetUtil.BtnColorChange(productPanel, 139, 235, 110);
    }//GEN-LAST:event_productPanelMouseEntered

    private void productPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseClicked
        new Product(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productPanelMouseClicked

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        OffsetUtil.BtnColorChange(logoutPanel, 38, 89, 24);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        OffsetUtil.BtnColorChange(logoutPanel, 222, 69, 27);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        Logout.logout(userID, AllUser.class.getName(), this);
    }//GEN-LAST:event_logoutPanelMouseClicked

    public final void getGenderCombo(){
        columnName  = "*";
        tableName   = "gender";
        
        try {
            conRs allGender = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con     = allGender.getCon();
            rs      = allGender.getRs();
            pstm    = allGender.getPstm();
            
            while (rs.next()) {
                String genderName = rs.getString("t_lang2_name");
                genderComboBox.addItem(genderName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, AllUser.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, AllUser.class.getName());
            }
        }
    }
    
    public final void getRoleCombo(){
        columnName  = "*";
        tableName   = "role";
        
        try {
            conRs allrole = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con     = allrole.getCon();
            rs      = allrole.getRs();
            pstm    = allrole.getPstm();
            
            while (rs.next()) {
                String roleName = rs.getString("t_lang2_name");
                roleComboBox.addItem(roleName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, AllUser.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, AllUser.class.getName());
            }
        }
    }

    public final void clearAll(){
        userIdTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        addressTextArea.setText("");
        genderComboBox.setSelectedIndex(0);
        roleComboBox.setSelectedIndex(0);
        nidNoTextField.setText("");
    }
    
    public final void getAllUser(){
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        
        columnName  = "u.t_user_id userId, u.t_address address, u.t_email email, u.t_lang2_fname firstName, u.t_lang2_lname lastName,"
                    + " u.t_nid_no NidNo, u.t_phone_no phoneNo, u.t_status status, r.t_lang2_name roleName";
        tableName   = "user u LEFT JOIN role r";
        onCondition = "u.t_role_id = r.t_role_id";
        
        try {
            conRs allUser = SelectQueryDao.selectQueryWithJoinClause(columnName, tableName, onCondition);
            con     = allUser.getCon();
            rs      = allUser.getRs();
            pstm    = allUser.getPstm();
            
            while (rs.next()) {
                int userId          = rs.getInt("userId");
                String firstName    = rs.getString("firstName");
                String lastName     = rs.getString("lastName");
                String phoneNo      = rs.getString("phoneNo");
                String address      = rs.getString("address");
                String email        = rs.getString("email");
                String nidNo        = rs.getString("NidNo");
                String role         = rs.getString("roleName");
                String status       = (rs.getString("status").equals("1")) ? "Active" : "Inactive";
                
                model.addRow(new Object[]{userId, firstName, lastName, phoneNo, address, email, nidNo, role, status});
                OffsetUtil.tableCellRenderer(userTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, AllUser.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AllUser.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, AllUser.class.getName());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel allUserLabel;
    private javax.swing.JPanel allUserPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel nidLabel;
    private javax.swing.JTextField nidNoTextField;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel productPanel;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JComboBox statusComboBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JTextField userIdTextField;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
