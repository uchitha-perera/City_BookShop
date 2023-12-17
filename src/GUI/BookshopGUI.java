/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import AllClases.Manager;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookshopGUI extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    Manager mymanager;
    
    public BookshopGUI() {
        initComponents();
        mymanager = new Manager();
    
    
        
        try{
            String url = "jdbc:mysql://localhost/citybook";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            
        }catch (Exception ex){
          JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Newaccount = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        Filter = new javax.swing.JComboBox<>();
        btnViewall = new javax.swing.JButton();
        btnClearall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Number");

        txtNumber.setBackground(new java.awt.Color(0, 153, 153));
        txtNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");

        txtQuantity.setBackground(new java.awt.Color(0, 153, 153));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        txtName.setBackground(new java.awt.Color(0, 153, 153));
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author");

        txtAuthor.setBackground(new java.awt.Color(0, 153, 153));
        txtAuthor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");

        txtCat.setBackground(new java.awt.Color(0, 153, 153));
        txtCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");

        txtPrice.setBackground(new java.awt.Color(0, 153, 153));
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        btnInsert.setBackground(new java.awt.Color(0, 51, 102));
        btnInsert.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(0, 51, 102));
        btnFind.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 51, 102));
        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 51, 102));
        btnDelete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 51, 102));
        btnClear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("City ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setText("Book Shop");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparent logo book22222.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(81, 81, 81)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(0, 6, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnClear)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnFind)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(130, 130, 130))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Newaccount.setBackground(new java.awt.Color(255, 102, 51));
        Newaccount.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Newaccount.setText("Create New Account");
        Newaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewaccountActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(0, 102, 102));
        Search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Search.setCaretColor(new java.awt.Color(255, 255, 255));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 51, 102));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(0, 51, 102));
        Filter.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        Filter.setForeground(new java.awt.Color(255, 255, 255));
        Filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Name", "By Price", "By Category" }));
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        btnViewall.setBackground(new java.awt.Color(0, 51, 102));
        btnViewall.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnViewall.setForeground(new java.awt.Color(255, 255, 255));
        btnViewall.setText("View All");
        btnViewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewallActionPerformed(evt);
            }
        });

        btnClearall.setBackground(new java.awt.Color(0, 51, 102));
        btnClearall.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClearall.setForeground(new java.awt.Color(255, 255, 255));
        btnClearall.setText("Clear All");
        btnClearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearallActionPerformed(evt);
            }
        });

        tblBooks.setBackground(new java.awt.Color(204, 255, 255));
        tblBooks.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblBooks.setForeground(new java.awt.Color(51, 51, 255));
        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book Number", "Book Name", "Author", "Category", "Price ($)", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblBooks);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search icon.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Manager");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 255));
        jLabel12.setText("Portal");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparent logo book22222.png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(153, 0, 153));
        btnLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnViewall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearall)
                .addGap(199, 199, 199))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(138, 138, 138)
                        .addComponent(btnLogout)
                        .addGap(35, 35, 35)
                        .addComponent(Newaccount)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Newaccount)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(btnLogout)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Filter)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearall)
                    .addComponent(btnViewall))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void clear(){
        txtNumber.setText(null);
        txtName.setText(null);
        txtAuthor.setText(null);
        txtCat.setText(null);
        txtPrice.setText(null);
        txtQuantity.setText(null);
        txtNumber.requestFocus();
    }
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
//                try{
            int Books;
             try {
                 Books = Integer.parseInt(txtNumber.getText());
            } catch (Exception e) {
                Books = 0;
            }
            
            String BookName = txtName.getText();
            String Author = txtAuthor.getText();
            String Category = txtCat.getText();
            String Price = txtPrice.getText();
            String Quantity =txtQuantity.getText();
            
            
            
            mymanager.addBook(Books, BookName, Author, Category, Price, Quantity);
            
//            String sql ="INSERT INTO tblbooks VALUE(?,?,?,?,?)";
//            ps = conn.prepareStatement(sql);
//            
//            ps.setInt(1,Books);
//            ps.setString(2, BookName);
//            ps.setString(3, Author);
//            ps.setString(4, Category);
//            ps.setString(5, Price);
//            
//            if(ps.executeUpdate()>0){
//                JOptionPane.showMessageDialog(this, "Book Record Inserted Successfully");
//            }
//            
//        }catch(Exception ex){
//          JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());  
//        }
                clear();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       try{
            String searchQuery = "SELECT * FROM tblbooks WHERE ";
            boolean isWhereAdded = false;
            
            String BookNumber = txtNumber.getText();
            String BookName = txtName.getText();
            String Author = txtAuthor.getText();
            String Category = txtCat.getText();
            String Price = txtPrice.getText();
            String Quantity = txtQuantity.getText();
            
            
            if(BookNumber.isEmpty() && BookName.isEmpty() && Author.isEmpty() && Category.isEmpty() && Price.isEmpty() && Quantity.isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Fields Are Empty...!");
                return;       
            }
            
            
            if(!BookNumber.equals("")){
                searchQuery += "book_number=?";
                isWhereAdded = true;
            }
            if(!BookName.equals("")){
                if(isWhereAdded){
                    searchQuery += " AND ";
                }
                searchQuery += "book_name=?";
                isWhereAdded = true;
            }
            if(!Author.equals("")){
                if(isWhereAdded){
                    searchQuery += " AND ";
                }
                searchQuery += "author=?";
                isWhereAdded = true;
            }
            if(!Category.equals("")){
                if(isWhereAdded){
                    searchQuery += " AND ";
                }
                searchQuery += "category=?";
                isWhereAdded = true;
            }
            if(!Price.equals("")){
                if(isWhereAdded){
                    searchQuery += " AND ";
                }
                searchQuery += "price=?";
                isWhereAdded = true;
            }
            
             if(!Quantity.equals("")){
                if(isWhereAdded){
                    searchQuery += " AND ";
                }
                searchQuery += "quantity=?";
                isWhereAdded = true;
            }
            
            ps = conn.prepareStatement(searchQuery);
            
            int parameterIndex = 1;
            
            if(!BookNumber.equals("")){
                ps.setString(parameterIndex, BookNumber);
                parameterIndex++;
            }
            if(!BookName.equals("")){
                ps.setString(parameterIndex, BookName);
                parameterIndex++;
            }
            if(!Author.equals("")){
                ps.setString(parameterIndex, Author);
                parameterIndex++;
            }
            if(!Category.equals("")){
                ps.setString(parameterIndex, Category);
                parameterIndex++;
            }
            if(!Price.equals("")){
                ps.setString(parameterIndex, Price);
            }
            
            if(!Quantity.equals("")){
                ps.setString(parameterIndex, Quantity);
            }
            
            
            
            
            
                 ResultSet rs = ps.executeQuery();
                 
            
            if(rs.isBeforeFirst()){
                rs.next();
                
                txtNumber.setText(rs.getString(1));
                txtName.setText(rs.getString(2));
                txtAuthor.setText(rs.getString(3));
                txtCat.setText(rs.getString(4));
                txtPrice.setText(rs.getString(5));
                txtQuantity.setText(rs.getString(6));
                
                JOptionPane.showMessageDialog(this, "Book Found!");
                
            }else{
              JOptionPane.showMessageDialog(this, "Book not Found!");
              clear();
            }
            
           
        }catch(Exception ex){
          JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());  
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       //try{
       
       
       int Books;
             try {
                 Books = Integer.parseInt(txtNumber.getText());
            } catch (Exception e) {
                Books = 0;
            }
            
           
            String BookName = txtName.getText();
            String Author = txtAuthor.getText();
            String Category = txtCat.getText();
            String Price = txtPrice.getText();
            String Quantity = txtQuantity.getText();
            
            mymanager.updateBook(BookName, Author, Category, Price, Quantity, Books);
//            
//            String sql = "UPDATE tblbooks SET book_name=?, author=?, category=?, price=? WHERE book_number=?";
//            
//            ps = conn.prepareStatement(sql);
//            
//            ps.setString(1, BookName);
//            ps.setString(2, Author);
//            ps.setString(3, Category);
//            ps.setString(4, Price);
//            ps.setInt(5, Books);
//            
//            if(ps.executeUpdate()>0){
//                JOptionPane.showMessageDialog(this, "Book Record Updated!");
//            }
//        }catch(Exception ex){
//          JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());  
//        }finally{
            clear();
//        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //try{
            int Books;
             try {
                 Books = Integer.parseInt(txtNumber.getText());
            } catch (Exception e) {
                Books = 0;
            }
            
            String BookName = txtName.getText();
            String Author = txtAuthor.getText();
            String Category = txtCat.getText();
            String Price = txtPrice.getText();
            String Quantity = txtQuantity.getText();
            
            mymanager.DeleteBook(Books, BookName, Author, Category, Price, Quantity);
            
//            String sql = "DELETE FROM tblbooks WHERE book_number=?";
//            
//            ps = conn.prepareStatement(sql);
//            
//            
//            ps.setInt(1, Books);
//            
//            if(ps.executeUpdate()>0){
//                JOptionPane.showMessageDialog(this, "Books Record Deleted!");
//            }
//        }catch(Exception ex){
//          JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());  
//        }finally{
            clear();
       // }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearallActionPerformed
            DefaultTableModel model = (DefaultTableModel)tblBooks.getModel();
            model.setRowCount(0);
            model.setRowCount(5);
    }//GEN-LAST:event_btnClearallActionPerformed

    private void btnViewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewallActionPerformed
        try{
            String sql = "SELECT * FROM tblbooks";
            ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblBooks.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow (new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
                //model.setValueAt(rs, getString(1), 0, 0);
            }
        }catch(Exception ex){
         JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());   
        }
    }//GEN-LAST:event_btnViewallActionPerformed

    private void NewaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewaccountActionPerformed
        New_Account DB = new New_Account();
                    DB.setVisible(true);
                    
                    this.dispose();
    }//GEN-LAST:event_NewaccountActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
     String filterT = (String) Filter.getSelectedItem();
       String searchText = Search.getText();
       
       if (searchText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please Enter Search Text!");
        return;
    }

Filter filter;

if (filterT.equals("By Name")) {
    filter = new NameFilter();
} else if (filterT.equals("By Price")) {
    filter = new PriceFilter();
} else if (filterT.equals("By Category")) {
    filter = new CategoryFilter();
} else { 
    
    JOptionPane.showMessageDialog(this, "Please select a filter!");
    return;
    
 
}

String sql = filter.getSQLQuery(searchText);

try {
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);

            DefaultTableModel model = (DefaultTableModel)tblBooks.getModel();
            model.setRowCount(0);

            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1)
                    ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
                });

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    
    
    
    }//GEN-LAST:event_btnSearchActionPerformed

    
    private void txtCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
                    Login DB = new Login();
                    DB.setVisible(true);
                    
                    this.dispose();        
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookshopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookshopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookshopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookshopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookshopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filter;
    private javax.swing.JButton Newaccount;
    private javax.swing.JTextField Search;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearall;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
