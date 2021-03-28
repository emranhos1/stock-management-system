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
public class Category_Brand extends javax.swing.JFrame {
    private final int userID;
    private String columnName;
    private String tableName;
    private String whereCondition;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstm;
    private String columnNameANDcolumnValue;
    private String values;

    public Category_Brand(int adminId) {
        userID = adminId;
        initComponents();
        getAllCategory();
        getAllBrand();
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
        jSeparator8 = new javax.swing.JSeparator();
        purchasePanel = new javax.swing.JPanel();
        purchaseLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        sellPanel = new javax.swing.JPanel();
        sellLabel = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        catIdLabel = new javax.swing.JLabel();
        catIdTextField = new javax.swing.JTextField();
        catNameLabel = new javax.swing.JLabel();
        catNameTextField = new javax.swing.JTextField();
        catStatusLabel = new javax.swing.JLabel();
        catStatusComboBox = new javax.swing.JComboBox();
        addPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        updateBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        brandIdLabel = new javax.swing.JLabel();
        brandIdTextField = new javax.swing.JTextField();
        brandNameLabel = new javax.swing.JLabel();
        brandNameTextField = new javax.swing.JTextField();
        brandStatusLabel = new javax.swing.JLabel();
        brandStatusComboBox = new javax.swing.JComboBox();
        updatePanel1 = new javax.swing.JPanel();
        updateBtn2 = new javax.swing.JLabel();
        addPanel1 = new javax.swing.JPanel();
        addBtn2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        brandTable = new javax.swing.JTable();
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
        jLabel1.setText("Category || Brand");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headPanelLayout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(19, 19, 19)))
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
            .addComponent(homeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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
            .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(catBrandLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
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
            .addComponent(productsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProductsPanelLayout.setVerticalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            .addComponent(purchaseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(sellLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sellPanelLayout.setVerticalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator10.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator11.setBackground(new java.awt.Color(38, 89, 24));
        jSeparator11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catBrandPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator8)
                    .addComponent(sellPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator10)
                    .addComponent(jSeparator11))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(ProductsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catBrandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(161, 103, 103));
        bodyPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(161, 103, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Manage Category", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        catIdLabel.setBackground(new java.awt.Color(161, 103, 103));
        catIdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        catIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catIdLabel.setText("Category Id :");
        catIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        catIdTextField.setEditable(false);
        catIdTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        catIdTextField.setBorder(null);

        catNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        catNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        catNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catNameLabel.setText("Category Name :");
        catNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        catNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        catNameTextField.setBorder(null);

        catStatusLabel.setBackground(new java.awt.Color(161, 103, 103));
        catStatusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        catStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catStatusLabel.setText("Category Status :");
        catStatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        catStatusComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        catStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Active", "Inactive" }));
        catStatusComboBox.setBorder(null);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(catIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(catIdTextField))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(catStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(catStatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(catNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(catNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator3.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(161, 103, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Category List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        categoryTable.setBackground(new java.awt.Color(204, 204, 204));
        categoryTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Name", "Status"
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
        categoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        categoryTable.setRowHeight(30);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(161, 103, 103));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Manage Brand", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        brandIdLabel.setBackground(new java.awt.Color(161, 103, 103));
        brandIdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandIdLabel.setText("Brand Id :");
        brandIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        brandIdTextField.setEditable(false);
        brandIdTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brandIdTextField.setBorder(null);

        brandNameLabel.setBackground(new java.awt.Color(161, 103, 103));
        brandNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandNameLabel.setText("Brand Name :");
        brandNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        brandNameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brandNameTextField.setBorder(null);

        brandStatusLabel.setBackground(new java.awt.Color(161, 103, 103));
        brandStatusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandStatusLabel.setText("Brand Status :");
        brandStatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        brandStatusComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        brandStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Active", "Inactive" }));
        brandStatusComboBox.setBorder(null);

        updatePanel1.setBackground(new java.awt.Color(161, 103, 103));
        updatePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePanel1MouseExited(evt);
            }
        });

        updateBtn2.setBackground(new java.awt.Color(186, 79, 84));
        updateBtn2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        updateBtn2.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtn2.setText("Update");
        updateBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout updatePanel1Layout = new javax.swing.GroupLayout(updatePanel1);
        updatePanel1.setLayout(updatePanel1Layout);
        updatePanel1Layout.setHorizontalGroup(
            updatePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        updatePanel1Layout.setVerticalGroup(
            updatePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn2)
        );

        addPanel1.setBackground(new java.awt.Color(161, 103, 103));
        addPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanel1MouseExited(evt);
            }
        });

        addBtn2.setBackground(new java.awt.Color(186, 79, 84));
        addBtn2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        addBtn2.setForeground(new java.awt.Color(255, 255, 255));
        addBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn2.setText("Add");
        addBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout addPanel1Layout = new javax.swing.GroupLayout(addPanel1);
        addPanel1.setLayout(addPanel1Layout);
        addPanel1Layout.setHorizontalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addPanel1Layout.setVerticalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addBtn2))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(brandIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brandIdTextField))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(brandStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brandStatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(brandNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brandNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jSeparator4.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator5.setBackground(new java.awt.Color(161, 103, 103));
        jSeparator5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBackground(new java.awt.Color(161, 103, 103));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Brand List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        brandTable.setBackground(new java.awt.Color(204, 204, 204));
        brandTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        brandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "brand Id", "Name", "Status"
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
        brandTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brandTable.setRowHeight(30);
        brandTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(brandTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        
    }//GEN-LAST:event_catBrandPanelMouseClicked

    private void catBrandPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBrandPanelMouseEntered
        OffsetUtil.BtnColorChange(catBrandPanel , 139, 235, 110);
    }//GEN-LAST:event_catBrandPanelMouseEntered

    private void catBrandPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBrandPanelMouseExited
        OffsetUtil.BtnColorChange(catBrandPanel, 38, 89, 24);
    }//GEN-LAST:event_catBrandPanelMouseExited

    private void ProductsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseClicked
        new Product(userID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsPanelMouseClicked

    private void ProductsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseEntered
        OffsetUtil.BtnColorChange(ProductsPanel, 139, 235, 110);
    }//GEN-LAST:event_ProductsPanelMouseEntered

    private void ProductsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseExited
        OffsetUtil.BtnColorChange(ProductsPanel, 38, 89, 24);
    }//GEN-LAST:event_ProductsPanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        String catId    = catIdTextField.getText();
        String catName  = catNameTextField.getText();
        int combo       = catStatusComboBox.getSelectedIndex();
        if (catId.equals("")){
            if (!catName.isEmpty()){
                if ((combo != 0)){
                    columnName  = " t_category_name, t_status ";
                    tableName   = " category ";
                    values      = "'" + catName + "', '" + combo + "'";
                    try {
                        boolean addCat = InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                        if (addCat){
                            new Message("Category Inserted!", "success-icon-128X128.png", true).setVisible(true);
                            OffsetUtil.refreshTable(categoryTable);
                            getAllCategory();
                            clearAll();
                        } else {
                            new Message("Category not Inserted!", "unsuccess-icon128X128.png", false).setVisible(true);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                        SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
                    }
                } else {
                    new Message("Select Category Status!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Insert Category Name!", "empty-icon128X128.png", false).setVisible(true);
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
        
        String catId    = catIdTextField.getText();
        String catName  = catNameTextField.getText();
        int combo       = catStatusComboBox.getSelectedIndex();

        if (!catId.equals("")){
            if(!catName.isEmpty()){
                if (combo != 0){
                    tableName = " category ";
                    columnNameANDcolumnValue = " t_category_name = '" + catName + "', t_status='" + combo + "' ";
                    whereCondition = " t_category_id = '" + catId + "'";

                    try {
                        boolean isUpdate = UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                        if (isUpdate) {
                            new Message("Category Update Successfully!", "success-icon-128X128.png", true).setVisible(true);
                            OffsetUtil.refreshTable(categoryTable);
                            getAllCategory();
                            clearAll();
                        } else {
                            new Message("Category Update Unsuccessfully!", "unsuccess-icon128X128.png", false).setVisible(true);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                        SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
                    }

                } else {
                    new Message("Select Category Status!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Category Name Not be Empty!", "empty-icon128X128.png", false).setVisible(true);
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

    private void updatePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanel1MouseClicked
        String brandId      = brandIdTextField.getText();
        String brandName    = brandNameTextField.getText();
        int combo           = brandStatusComboBox.getSelectedIndex();
        if (!brandId.equals("")){
            if(!brandName.isEmpty()){
                if (combo != 0){
                    tableName = " brand ";
                    columnNameANDcolumnValue = " t_brand_name = '" + brandName + "', t_status='" + combo + "' ";
                    whereCondition = " t_brand_id = '" + brandId + "'";

                    try {
                        boolean isUpdate = UpdateQueryDao.updateQueryWithWhereClause(tableName, columnNameANDcolumnValue, whereCondition);
                        if (isUpdate) {
                            new Message("Brand Update Successfully!", "success-icon-128X128.png", true).setVisible(true);
                            OffsetUtil.refreshTable(brandTable);
                            getAllBrand();
                            clearAll();
                        } else {
                            new Message("Brand Update Unsuccessfully!", "unsuccess-icon128X128.png", false).setVisible(true);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                        SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
                    }

                } else {
                    new Message("Select Brand Status!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Brand Name Not be Empty!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try Add for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_updatePanel1MouseClicked

    private void updatePanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanel1MouseEntered
        OffsetUtil.BtnColorChange(updatePanel1, 139, 235, 110);
    }//GEN-LAST:event_updatePanel1MouseEntered

    private void updatePanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanel1MouseExited
        OffsetUtil.BtnColorChange(updatePanel1, 161, 103, 103);
    }//GEN-LAST:event_updatePanel1MouseExited

    private void addPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel1MouseClicked
        int combo           = brandStatusComboBox.getSelectedIndex();
        String brandName    = brandNameTextField.getText();
        String brandId      = brandIdTextField.getText();
        if (brandId.equals("")){
            if (!brandName.isEmpty()){
                if ((combo != 0)){
                    columnName  = " t_brand_name, t_status ";
                    tableName   = " brand ";
                    values      = "'" + brandName + "', '" + combo + "'";
                    try {
                        boolean addBrand = InsertQueryDao.insertQueryWithOutWhereClause(tableName, columnName, values);
                        if (addBrand){
                            new Message("Brand Inserted!", "success-icon-128X128.png", true).setVisible(true);
                            OffsetUtil.refreshTable(brandTable);
                            getAllBrand();
                            clearAll();
                        } else {
                            new Message("Brand not Inserted!", "unsuccess-icon128X128.png", false).setVisible(true);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                        SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
                    }
                } else {
                    new Message("Select Brand Status!", "empty-icon128X128.png", false).setVisible(true);
                }
            } else {
                new Message("Insert Brand Name!", "empty-icon128X128.png", false).setVisible(true);
            }
        } else {
            new Message("Try update for this action!", "unsuccess-icon128X128.png", false).setVisible(true);
        }
    }//GEN-LAST:event_addPanel1MouseClicked

    private void addPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel1MouseEntered
        OffsetUtil.BtnColorChange(addPanel1, 139, 235, 110);
    }//GEN-LAST:event_addPanel1MouseEntered

    private void addPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel1MouseExited
        OffsetUtil.BtnColorChange(addPanel1, 161, 103, 103);
    }//GEN-LAST:event_addPanel1MouseExited

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
        int selectedRow         = categoryTable.getSelectedRow();

        catIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        catNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        catStatusComboBox.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_categoryTableMouseClicked

    private void brandTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) brandTable.getModel();
        int selectedRow = brandTable.getSelectedRow();

        brandIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        brandNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        brandStatusComboBox.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_brandTableMouseClicked

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
        catIdTextField.setText("");
        catNameTextField.setText("");
        catStatusComboBox.setSelectedIndex(0);
        brandIdTextField.setText("");
        brandNameTextField.setText("");
        brandStatusComboBox.setSelectedIndex(0);
    }
    
    public final void getAllCategory(){
        columnName  = "*";
        tableName   = "category";
        
        try {
            conRs allCategory = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con     = allCategory.getCon();
            rs      = allCategory.getRs();
            pstm    = allCategory.getPstm();
            
            DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
            
            while (rs.next()) {
                int catId       = rs.getInt("t_category_id");
                String catName  = rs.getString("t_category_name");
                String status   = (rs.getString("t_status").equals("1")) ? "Active" : "Inactive";
                
                model.addRow(new Object[]{catId, catName, status});
                OffsetUtil.tableCellRenderer(categoryTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
            }
        }
    }
    
    public final void getAllBrand(){
        columnName  = "*";
        tableName   = "brand";
        
        try {
            conRs allBrand = SelectQueryDao.selectQueryWithOutWhereClause(columnName, tableName);
            con     = allBrand.getCon();
            rs      = allBrand.getRs();
            pstm    = allBrand.getPstm();
            
            DefaultTableModel model = (DefaultTableModel) brandTable.getModel();
            
            while (rs.next()) {
                int brandId = rs.getInt("t_brand_id");
                String brandName = rs.getString("t_brand_name");
                String status = (rs.getString("t_status").equals("1")) ? "Active" : "Inactive";
                
                //add row in table
                model.addRow(new Object[]{brandId, brandName, status});
                // Horizontal Alignment
                OffsetUtil.tableCellRenderer(brandTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
            SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
        } finally {
            try {
                con.close();
                rs.close();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Category_Brand.class.getName()).log(Level.SEVERE, null, ex);
                SYSLOG.LOG(""+ ex, Category_Brand.class.getName());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProductsPanel;
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel addBtn2;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel addPanel1;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel brandIdLabel;
    private javax.swing.JTextField brandIdTextField;
    private javax.swing.JLabel brandNameLabel;
    private javax.swing.JTextField brandNameTextField;
    private javax.swing.JComboBox brandStatusComboBox;
    private javax.swing.JLabel brandStatusLabel;
    private javax.swing.JTable brandTable;
    private javax.swing.JLabel catBrandLabel;
    private javax.swing.JPanel catBrandPanel;
    private javax.swing.JLabel catIdLabel;
    private javax.swing.JTextField catIdTextField;
    private javax.swing.JLabel catNameLabel;
    private javax.swing.JTextField catNameTextField;
    private javax.swing.JComboBox catStatusComboBox;
    private javax.swing.JLabel catStatusLabel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel productsLabel;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JPanel purchasePanel;
    private javax.swing.JLabel sellLabel;
    private javax.swing.JPanel sellPanel;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JLabel updateBtn2;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JPanel updatePanel1;
    // End of variables declaration//GEN-END:variables
}
