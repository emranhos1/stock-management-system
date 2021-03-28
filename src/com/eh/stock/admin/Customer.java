package com.eh.stock.admin;

import com.eh.stock.product.Product;
import com.eh.stock.util.classes.Logout;
import com.eh.stock.util.classes.OffsetUtil;
import com.eh.stock.util.classes.SYSLOG;
import com.eh.stock.util.dao.InsertQueryDao;
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
public class Customer extends javax.swing.JFrame {
    private final int userID;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private String tableName;
    private String columnNameANDcolumnValue;
    private String whereCondition;
    private String columnName;
    private String values;

    public Customer(int adminId) {
        userID = adminId;
        initComponents();
        getAllCustomer();
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
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        customerIdLabel = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        customerPhoneLabel = new javax.swing.JLabel();
        customerPhoneTextField = new javax.swing.JTextField();
        addPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        updateBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
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

        jSeparator7.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator6.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New Customer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        customerIdLabel.setBackground(new java.awt.Color(161, 103, 103));
        customerIdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerIdLabel.setText("Customer Id :");
        customerIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customerIdTextField.setEditable(false);
        customerIdTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerIdTextField.setBorder(null);

        customerNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        customerNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerNameLabel.setText("Customer Name :");
        customerNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customerNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerNameTextField.setBorder(null);

        customerPhoneLabel.setBackground(new java.awt.Color(161, 103, 103));
        customerPhoneLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerPhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerPhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerPhoneLabel.setText("Phone No :");
        customerPhoneLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customerPhoneTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerPhoneTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerPhoneTextField.setBorder(null);

        addPanel.setBackground(new java.awt.Color(161, 103, 103));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(186, 79, 84));
        addBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addBtn))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(161, 103, 103));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(161, 103, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        customerTable.setBackground(new java.awt.Color(204, 204, 204));
        customerTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Phone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        customerTable.setRowHeight(30);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        OffsetUtil.BtnColorChange(logoutPanel, 222, 69, 27);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        OffsetUtil.BtnColorChange(logoutPanel, 38, 89, 24);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        Logout.logout(userID, Customer.class.getName(), this);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void productPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseClicked
        new Product(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productPanelMouseClicked

    private void productPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseEntered
        OffsetUtil.BtnColorChange(productPanel, 139, 235, 110);
    }//GEN-LAST:event_productPanelMouseEntered

    private void productPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelMouseExited
        OffsetUtil.BtnColorChange(productPanel, 38, 89, 24);
    }//GEN-LAST:event_productPanelMouseExited

    private void customerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseClicked
        new Customer(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerPanelMouseClicked

    private void customerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseEntered
        OffsetUtil.BtnColorChange(customerPanel, 139, 235, 110);
    }//GEN-LAST:event_customerPanelMouseEntered

    private void customerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPanelMouseExited
        OffsetUtil.BtnColorChange(customerPanel, 38, 89, 24);
    }//GEN-LAST:event_customerPanelMouseExited

    private void allUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseClicked
        new AllUser(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_allUserPanelMouseClicked

    private void allUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseEntered
        OffsetUtil.BtnColorChange(allUserPanel, 139, 235, 110);
    }//GEN-LAST:event_allUserPanelMouseEntered

    private void allUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserPanelMouseExited
        OffsetUtil.BtnColorChange(allUserPanel, 38, 89, 24);
    }//GEN-LAST:event_allUserPanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        String cultomerId       = customerIdTextField.getText();
        String customerName     = customerNameTextField.getText();
        String customerPhone    = customerPhoneTextField.getText();
        
        if (cultomerId.equals("")){
            if (!customerName.isEmpty()){
                if(!customerPhone.isEmpty()){
                    boolean valPhone = OffsetUtil.validatePhone(customerPhone);
                    if (valPhone){
                        columnName  = " t_customer_name, t_customer_phone, t_entry_date, t_entry_user ";
                        tableName   = " customer ";
                        values      = "'" + customerName + "', '" + customerPhone +"', now(), '"+ userID +"' ";
                        try {
                            boolean addCat = InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                            if (addCat){
                                new Message("Customer Inserted!", "success-icon-128X128.png", true).setVisible(true);
                                OffsetUtil.refreshTable(customerTable);
                                getAllCustomer();
                                clearAll();
                            } else {
                                new Message("Customer not Inserted!", "unsuccess-icon128X128.png", false).setVisible(true);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                            SYSLOG.LOG(""+ ex, Customer.class.getName());
                        }
                    } else {
                        new Message("Phone No invalid!", "unsuccess-icon128X128.png", false).setVisible(true);
                    }
                } else {
                    new Message("Insert Customer Phone!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Insert Customer Name!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try update for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        OffsetUtil.BtnColorChange(addPanel, 139, 235, 110);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
        OffsetUtil.BtnColorChange(addPanel, 161, 103, 103);
    }//GEN-LAST:event_addPanelMouseExited

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked

        String cultomerId = customerIdTextField.getText();
        String customerName = customerNameTextField.getText();
        String customerPhone = customerPhoneTextField.getText();

        if (!cultomerId.equals("")){
            if (!customerName.isEmpty()){
                if(!customerPhone.isEmpty()){
                    boolean valPhone = OffsetUtil.validatePhone(customerPhone);
                    if (valPhone){
                        tableName = " customer ";
                        columnNameANDcolumnValue = " t_customer_name = '" + customerName + "', t_customer_phone='"
                                + customerPhone + "', t_upd_date=now(), t_upd_user='"+userID+"' ";
                        whereCondition = " t_customer_id = '" + cultomerId + "'";

                        try {
                            boolean isUpdate = UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                            if (isUpdate) {
                                new Message("Customer Update Successfully!", "success-icon-128X128.png", true).setVisible(true);
                                OffsetUtil.refreshTable(customerTable);
                                getAllCustomer();
                                clearAll();
                            } else {
                                new Message("Customer Update Unsuccessfully!", "unsuccess-icon128X128.png", false).setVisible(true);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                            SYSLOG.LOG(""+ ex, Customer.class.getName());
                        }
                    } else {
                        new Message("Phone No invalid!", "unsuccess-icon128X128.png", false).setVisible(true);
                    }
                } else {
                    new Message("Insert Customer Phone!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Customer Name Not be Empty!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try Add for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void updatePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseEntered
        OffsetUtil.BtnColorChange(updatePanel, 139, 235, 110);
    }//GEN-LAST:event_updatePanelMouseEntered

    private void updatePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseExited
        OffsetUtil.BtnColorChange(updatePanel, 161, 103, 103);
    }//GEN-LAST:event_updatePanelMouseExited

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int selectedRow = customerTable.getSelectedRow();

        customerIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        customerNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        customerPhoneTextField.setText(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_customerTableMouseClicked

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        new AdminDashboard(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePanelMouseClicked

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        OffsetUtil.BtnColorChange(homePanel, 139, 235, 110);
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        OffsetUtil.BtnColorChange(homePanel, 38, 89, 24);
    }//GEN-LAST:event_homePanelMouseExited

    public final void clearAll(){
        customerIdTextField.setText("");
        customerNameTextField.setText("");
        customerPhoneTextField.setText("");
    }
    
    public final void getAllCustomer(){
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        
        columnName = "t_customer_id, t_customer_name, t_customer_phone, t_entry_date, t_entry_user, t_upd_date, t_upd_user";
        tableName = "customer";
        
        try {
            conRs allCustomer = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con     = allCustomer.getCon();
            rs      = allCustomer.getRs();
            pstm    = allCustomer.getPstm();
            
            while (rs.next()) {
                int customerId          = rs.getInt("t_customer_id");
                String customerName     = rs.getString("t_customer_name");
                String customerPhone    = rs.getString("t_customer_phone");
                
                model.addRow(new Object[]{customerId, customerName, customerPhone});
                OffsetUtil.tableCellRenderer(customerTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Customer.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Customer.class.getName());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel allUserLabel;
    private javax.swing.JPanel allUserPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel customerPhoneLabel;
    private javax.swing.JTextField customerPhoneTextField;
    private javax.swing.JTable customerTable;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel productPanel;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
