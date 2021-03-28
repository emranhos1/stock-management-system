package com.eh.stock.product;

import com.eh.stock.admin.AdminDashboard;
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
public class Product extends javax.swing.JFrame {
    private final int userID;
    private String columnName;
    private String tableName;
    private String whereCondition;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private String columnNameANDcolumnValue;
    private String onCondition;
    private String values;

    public Product(int adminId) {
        userID = adminId;
        initComponents();
        getAllProduct();
        getCategoryComb();
        getBrandComb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        catBrandPanel = new javax.swing.JPanel();
        catBrandLabel = new javax.swing.JLabel();
        ProductsPanel = new javax.swing.JPanel();
        productsLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        purchasePanel = new javax.swing.JPanel();
        purchaseLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        sellPanel = new javax.swing.JPanel();
        sellLabel = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        proDescTextArea = new javax.swing.JTextArea();
        proCatComboBox = new javax.swing.JComboBox();
        proCatLabel = new javax.swing.JLabel();
        proDescLabel = new javax.swing.JLabel();
        proNameTextField = new javax.swing.JTextField();
        proStatusComboBox = new javax.swing.JComboBox();
        proStatusLabel = new javax.swing.JLabel();
        proNameLabel = new javax.swing.JLabel();
        proBrandComboBox = new javax.swing.JComboBox();
        proIdTextField = new javax.swing.JTextField();
        proIdLabel = new javax.swing.JLabel();
        proBrandLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        updateBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        footerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        headPanel.setBackground(new java.awt.Color(108, 163, 93));
        headPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(108, 163, 93));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Management");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        navPanel.setBackground(new java.awt.Color(38, 89, 24));
        navPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        catBrandPanel.setBackground(new java.awt.Color(38, 89, 24));
        catBrandPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catBrandPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catBrandPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catBrandPanelMouseExited(evt);
            }
        });

        catBrandLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        catBrandLabel.setForeground(new java.awt.Color(255, 255, 255));
        catBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catBrandLabel.setText("Category / Brand");
        catBrandLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout catBrandPanelLayout = new javax.swing.GroupLayout(catBrandPanel);
        catBrandPanel.setLayout(catBrandPanelLayout);
        catBrandPanelLayout.setHorizontalGroup(
            catBrandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catBrandLabel)
        );
        catBrandPanelLayout.setVerticalGroup(
            catBrandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ProductsPanel.setBackground(new java.awt.Color(38, 89, 24));
        ProductsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductsPanelMouseExited(evt);
            }
        });

        productsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        productsLabel.setForeground(new java.awt.Color(255, 255, 255));
        productsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsLabel.setText("Products");
        productsLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout ProductsPanelLayout = new javax.swing.GroupLayout(ProductsPanel);
        ProductsPanel.setLayout(ProductsPanelLayout);
        ProductsPanelLayout.setHorizontalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ProductsPanelLayout.setVerticalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator3.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator4.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator6.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator7.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator8.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        purchasePanel.setBackground(new java.awt.Color(38, 89, 24));
        purchasePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchasePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchasePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchasePanelMouseExited(evt);
            }
        });

        purchaseLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        purchaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        purchaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseLabel.setText("Purchase");
        purchaseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout purchasePanelLayout = new javax.swing.GroupLayout(purchasePanel);
        purchasePanel.setLayout(purchasePanelLayout);
        purchasePanelLayout.setHorizontalGroup(
            purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        purchasePanelLayout.setVerticalGroup(
            purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator9.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sellPanel.setBackground(new java.awt.Color(38, 89, 24));
        sellPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellPanelMouseExited(evt);
            }
        });

        sellLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sellLabel.setForeground(new java.awt.Color(255, 255, 255));
        sellLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellLabel.setText("Sell");
        sellLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout sellPanelLayout = new javax.swing.GroupLayout(sellPanel);
        sellPanel.setLayout(sellPanelLayout);
        sellPanelLayout.setHorizontalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sellPanelLayout.setVerticalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator9)
                    .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sellPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(catBrandPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProductsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(purchasePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(ProductsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catBrandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(161, 103, 103));
        bodyPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(161, 103, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New Product", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        proDescTextArea.setColumns(20);
        proDescTextArea.setRows(5);
        jScrollPane2.setViewportView(proDescTextArea);

        proCatComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proCatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));
        proCatComboBox.setBorder(null);

        proCatLabel.setBackground(new java.awt.Color(161, 103, 103));
        proCatLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proCatLabel.setForeground(new java.awt.Color(255, 255, 255));
        proCatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proCatLabel.setText("Category :");
        proCatLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        proDescLabel.setBackground(new java.awt.Color(161, 103, 103));
        proDescLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proDescLabel.setForeground(new java.awt.Color(255, 255, 255));
        proDescLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proDescLabel.setText("Description :");
        proDescLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        proNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proNameTextField.setBorder(null);

        proStatusComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Active", "Inactive" }));
        proStatusComboBox.setBorder(null);

        proStatusLabel.setBackground(new java.awt.Color(161, 103, 103));
        proStatusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        proStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proStatusLabel.setText("Product Status :");
        proStatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        proNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        proNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        proNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proNameLabel.setText("Product Name :");
        proNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        proBrandComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proBrandComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));
        proBrandComboBox.setBorder(null);

        proIdTextField.setEditable(false);
        proIdTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proIdTextField.setBorder(null);

        proIdLabel.setBackground(new java.awt.Color(161, 103, 103));
        proIdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        proIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proIdLabel.setText("Product Id :");
        proIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        proBrandLabel.setBackground(new java.awt.Color(161, 103, 103));
        proBrandLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proBrandLabel.setForeground(new java.awt.Color(255, 255, 255));
        proBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proBrandLabel.setText("Brand :");
        proBrandLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addComponent(addBtn)
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
            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proBrandComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(proIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(proStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proStatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(proNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proCatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proBrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator2.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(161, 103, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        productTable.setBackground(new java.awt.Color(204, 204, 204));
        productTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Description", "Category Name", "brand Name", "Product Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productTable.setRowHeight(30);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
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

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        OffsetUtil.BtnColorChange(homePanel, 139, 235, 110);
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        OffsetUtil.BtnColorChange(homePanel, 38, 89, 24);
    }//GEN-LAST:event_homePanelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        Logout.logout(userID, AdminDashboard.class.getName(), this);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        OffsetUtil.BtnColorChange(logoutPanel, 222, 69, 27);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        OffsetUtil.BtnColorChange(logoutPanel, 38, 89, 24);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        new AdminDashboard(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePanelMouseClicked

    private void catBrandPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBrandPanelMouseClicked
        new Category_Brand(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_catBrandPanelMouseClicked

    private void catBrandPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBrandPanelMouseEntered
        OffsetUtil.BtnColorChange(catBrandPanel, 139, 235, 110);
    }//GEN-LAST:event_catBrandPanelMouseEntered

    private void catBrandPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBrandPanelMouseExited
        OffsetUtil.BtnColorChange(catBrandPanel, 38, 89, 24);
    }//GEN-LAST:event_catBrandPanelMouseExited

    private void ProductsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseClicked
        
    }//GEN-LAST:event_ProductsPanelMouseClicked

    private void ProductsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseEntered
        OffsetUtil.BtnColorChange(ProductsPanel, 139, 235, 110);
    }//GEN-LAST:event_ProductsPanelMouseEntered

    private void ProductsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseExited
        OffsetUtil.BtnColorChange(ProductsPanel, 38, 89, 24);
    }//GEN-LAST:event_ProductsPanelMouseExited

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        OffsetUtil.BtnColorChange(addPanel, 139, 235, 110);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
        OffsetUtil.BtnColorChange(addPanel, 161, 103, 103);
    }//GEN-LAST:event_addPanelMouseExited

    private void updatePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseEntered
        OffsetUtil.BtnColorChange(updatePanel, 139, 235, 110);
    }//GEN-LAST:event_updatePanelMouseEntered

    private void updatePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseExited
        OffsetUtil.BtnColorChange(updatePanel, 161, 103, 103);
    }//GEN-LAST:event_updatePanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        String proId        = proIdTextField.getText();
        String proName      = proNameTextField.getText();
        String proDesc      = proDescTextArea.getText();
        int CatComboBox     = proCatComboBox.getSelectedIndex();
        int brandComboBox   = proBrandComboBox.getSelectedIndex();
        int proStatusCombo  = proStatusComboBox.getSelectedIndex();
        if (proId.equals("")){
            if (!proName.isEmpty()){
                if (CatComboBox !=0){
                    if (brandComboBox !=0){
                        if ((proStatusCombo != 0)){
                            String catCombo     = OffsetUtil.splitComboData(proCatComboBox.getSelectedItem().toString());
                            String brandCombo   = OffsetUtil.splitComboData(proBrandComboBox.getSelectedItem().toString());

                            columnName  = " t_product_name, t_description, t_category_id, t_brand_id, t_status, t_entry_date, t_entry_user ";
                            tableName   = " product ";
                            values      = "'" + proName + "', '" + proDesc + "', '"+ catCombo +"', '"+ brandCombo +"', '"+ proStatusCombo +"', now(), '"+ userID +"'";
                            try {
                                boolean addCat = InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                                if (addCat){
                                    new Message("Product Inserted!", "success-icon-128X128.png", true).setVisible(true);
                                    OffsetUtil.refreshTable(productTable);
                                    getAllProduct();
                                    clearAll();
                                } else {
                                    new Message("Product not Inserted!", "unsuccess-icon128X128.png", false).setVisible(true);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                                SYSLOG.LOG(""+ ex, Product.class.getName());
                            }
                        } else {
                            new Message("Select Product Status!", "empty-icon128X128.png", false).setVisible(true);
                        }
                    } else {
                        new Message("Select Brand!", "empty-icon128X128.png", false).setVisible(true);
                    }
                } else {
                    new Message("Select Catagory!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Insert Product Name!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try update for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        String proId        = proIdTextField.getText();
        String proName      = proNameTextField.getText();
        String proDesc      = proDescTextArea.getText();
        int CatComboBox     = proCatComboBox.getSelectedIndex();
        int brandComboBox   = proBrandComboBox.getSelectedIndex();
        int proStatusCombo  = proStatusComboBox.getSelectedIndex();

        if (!proId.equals("")){
            if(!proName.isEmpty()){
                if (CatComboBox !=0){
                    if (brandComboBox !=0){
                        if (proStatusCombo != 0){
                            String catCombo = OffsetUtil.splitComboData(proCatComboBox.getSelectedItem().toString());
                            String brandCombo = OffsetUtil.splitComboData(proBrandComboBox.getSelectedItem().toString());

                            tableName = " product ";
                            columnNameANDcolumnValue = " t_product_name = '" + proName + "', t_description='" + proDesc
                            + "', t_category_id='"+ catCombo +"', t_brand_id='"+ brandCombo +"', t_status='"+ proStatusCombo
                            +"', t_upd_date= now(), t_upd_user='"+ userID +"' ";
                            whereCondition = " t_product_id = '" + proId + "'";

                            try {
                                boolean isUpdate = UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                                if (isUpdate) {
                                    new Message("Product Update Successfully!", "success-icon-128X128.png", true).setVisible(true);
                                    OffsetUtil.refreshTable(productTable);
                                    getAllProduct();
                                    clearAll();
                                } else {
                                    new Message("Product Update Unsuccessfully!", "unsuccess-icon128X128.png", false).setVisible(true);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                                SYSLOG.LOG(""+ ex, Product.class.getName());
                            }

                        } else {
                            new Message("Select Product Status!", "empty-icon128X128.png", false).setVisible(true);
                        }
                    } else {
                        new Message("Select Brand!", "empty-icon128X128.png", false).setVisible(true);
                    }
                } else {
                    new Message("Select Catagory!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Catagory Name Not be Empty!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try Add for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int selectedRow         = productTable.getSelectedRow();

        String productId        = model.getValueAt(selectedRow, 0).toString();
        columnName              = "p.t_product_id productId, p.t_product_name productName, p.t_description description, p.t_status status,"
        + " p.t_category_id catId, p.t_brand_id brandId, c.t_category_name catName, b.t_brand_name brandName";
        tableName               = "product p LEFT JOIN category c";
        onCondition             = "p.t_category_id = c.t_category_id LEFT JOIN brand b ON p.t_brand_id = b.t_brand_id";
        whereCondition          = "p.t_product_id='"+productId+"'";

        try {
            conRs product = SelectQueryDao.selectQueryWithJoinWhere(columnName, tableName, onCondition, whereCondition);
            con     = product.getCon();
            rs      = product.getRs();
            pstm    = product.getPstm();

            if (rs.next()) {
                proIdTextField.setText(rs.getString("productId"));
                proNameTextField.setText(rs.getString("productName"));
                proDescTextArea.setText(rs.getString("description"));
                proCatComboBox.setSelectedItem(rs.getString("catName") +"-"+rs.getString("catId"));
                proBrandComboBox.setSelectedItem(rs.getString("brandName") +"-"+rs.getString("brandId"));
                proStatusComboBox.setSelectedItem((rs.getString("status").equals("1")) ? "Active" : "Inactive");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Product.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Product.class.getName());
            }
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void purchasePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchasePanelMouseClicked
        new Purchase(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_purchasePanelMouseClicked

    private void purchasePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchasePanelMouseEntered
        OffsetUtil.BtnColorChange(purchasePanel, 139, 235, 110);
    }//GEN-LAST:event_purchasePanelMouseEntered

    private void purchasePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchasePanelMouseExited
        OffsetUtil.BtnColorChange(purchasePanel, 38, 89, 24);
    }//GEN-LAST:event_purchasePanelMouseExited

    private void sellPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellPanelMouseClicked
        new Sell(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellPanelMouseClicked

    private void sellPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellPanelMouseEntered
        OffsetUtil.BtnColorChange(sellPanel, 139, 235, 110);
    }//GEN-LAST:event_sellPanelMouseEntered

    private void sellPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellPanelMouseExited
        OffsetUtil.BtnColorChange(sellPanel, 38, 89, 24);
    }//GEN-LAST:event_sellPanelMouseExited

    public final void clearAll(){
        proIdTextField.setText("");
        proNameTextField.setText("");
        proDescTextArea.setText("");
        proCatComboBox.setSelectedIndex(0);
        proBrandComboBox.setSelectedIndex(0);
        proStatusComboBox.setSelectedIndex(0);
    }
    
    public final void getAllProduct(){
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        
        columnName  = "p.t_product_id, p.t_product_name, p.t_description, p.t_status, c.t_category_name, b.t_brand_name";
        tableName   = "product p LEFT JOIN category c";
        onCondition = "p.t_category_id = c.t_category_id LEFT JOIN brand b ON p.t_brand_id = b.t_brand_id";
        
        try {
            conRs allProduct = SelectQueryDao.selectQueryWithJoinClause(columnName, tableName, onCondition);
            con     = allProduct.getCon();
            rs      = allProduct.getRs();
            pstm    = allProduct.getPstm();
            
            while (rs.next()) {
                int proId           = rs.getInt("t_product_id");
                String proName      = rs.getString("t_product_name");
                String proDesc      = rs.getString("t_description");
                String proCatName   = rs.getString("t_category_name");
                String proBrandName = rs.getString("t_brand_name");
                String status       = (rs.getString("t_status").equals("1")) ? "Active" : "Inactive";
                
                model.addRow(new Object[]{proId, proName, proDesc, proCatName, proBrandName, status});
                OffsetUtil.tableCellRenderer(productTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Product.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Product.class.getName());
            }
        }
    }
    
    public final void getCategoryComb(){
        columnName      = "c.t_category_name, c.t_category_id";
        tableName       = "category c";
        whereCondition  = "c.t_status= 1";
        
        try {
            conRs allCategory = SelectQueryDao.selectQueryWithWhereClause(columnName, tableName, whereCondition);
            con     = allCategory.getCon();
            rs      = allCategory.getRs();
            pstm    = allCategory.getPstm();
            
            while (rs.next()) {
                int catId = rs.getInt("t_category_id");
                String catName = rs.getString("t_category_name");
                proCatComboBox.addItem(catName + "-" + catId);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Product.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Product.class.getName());
            }
        }
    }
    
    public final void getBrandComb(){
        columnName      = "b.t_brand_name, b.t_brand_id";
        tableName       = "brand b";
        whereCondition  = "b.t_status= 1";
        
        try {
            conRs allBrand = SelectQueryDao.selectQueryWithWhereClause(columnName, tableName, whereCondition);
            con     = allBrand.getCon();
            rs      = allBrand.getRs();
            pstm    = allBrand.getPstm();
            
            while (rs.next()) {
                int brandId      = rs.getInt("t_brand_id");
                String brandName = rs.getString("t_brand_name");
                proBrandComboBox.addItem(brandName + "-" + brandId);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Product.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Product.class.getName());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProductsPanel;
    private javax.swing.JLabel addBtn;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel catBrandLabel;
    private javax.swing.JPanel catBrandPanel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JComboBox proBrandComboBox;
    private javax.swing.JLabel proBrandLabel;
    private javax.swing.JComboBox proCatComboBox;
    private javax.swing.JLabel proCatLabel;
    private javax.swing.JLabel proDescLabel;
    private javax.swing.JTextArea proDescTextArea;
    private javax.swing.JLabel proIdLabel;
    private javax.swing.JTextField proIdTextField;
    private javax.swing.JLabel proNameLabel;
    private javax.swing.JTextField proNameTextField;
    private javax.swing.JComboBox proStatusComboBox;
    private javax.swing.JLabel proStatusLabel;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel productsLabel;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JPanel purchasePanel;
    private javax.swing.JLabel sellLabel;
    private javax.swing.JPanel sellPanel;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
