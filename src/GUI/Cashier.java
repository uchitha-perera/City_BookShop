/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Cashier extends javax.swing.JFrame {
    
    Connection conn;
    PreparedStatement ps;


    public Cashier() {
        initComponents();
         
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
        btnFind = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(87, 98, 119));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Number");

        txtNumber.setBackground(new java.awt.Color(87, 98, 119));
        txtNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");

        txtQuantity.setBackground(new java.awt.Color(87, 98, 119));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        txtName.setBackground(new java.awt.Color(87, 98, 119));
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author");

        txtAuthor.setBackground(new java.awt.Color(87, 98, 119));
        txtAuthor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAuthor.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");

        txtCat.setBackground(new java.awt.Color(87, 98, 119));
        txtCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCat.setForeground(new java.awt.Color(255, 255, 255));
        txtCat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");

        txtPrice.setBackground(new java.awt.Color(87, 98, 119));
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        btnFind.setBackground(new java.awt.Color(167, 131, 158));
        btnFind.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(167, 131, 158));
        btnClear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(btnFind)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnClear))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGap(0, 6, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(btnClear))
                .addGap(154, 154, 154))
        );

        jPanel2.setBackground(new java.awt.Color(107, 132, 163));

        Search.setBackground(new java.awt.Color(107, 132, 163));
        Search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Search.setCaretColor(new java.awt.Color(255, 255, 255));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(167, 131, 158));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(52, 105, 158));
        Filter.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        Filter.setForeground(new java.awt.Color(255, 255, 255));
        Filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Name", "By Price", "By Category" }));
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        btnViewall.setBackground(new java.awt.Color(167, 131, 158));
        btnViewall.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnViewall.setText("View All");
        btnViewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewallActionPerformed(evt);
            }
        });

        btnClearall.setBackground(new java.awt.Color(167, 131, 158));
        btnClearall.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClearall.setText("Clear All");
        btnClearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearallActionPerformed(evt);
            }
        });

        tblBooks.setBackground(new java.awt.Color(150, 182, 204));
        tblBooks.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblBooks.setForeground(new java.awt.Color(51, 51, 0));
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
        jLabel11.setText("Cashier");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 255));
        jLabel12.setText("Portal");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparent logo book22222.png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(204, 0, 153));
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
                .addContainerGap(98, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(340, 340, 340)
                        .addComponent(btnLogout)
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatActionPerformed

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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

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
            // Handle unknown filter type

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

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

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

    private void btnClearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearallActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblBooks.getModel();
        model.setRowCount(0);
        model.setRowCount(5);
    }//GEN-LAST:event_btnClearallActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login DB = new Login();
        DB.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    public void clear(){
        txtNumber.setText(null);
        txtName.setText(null);
        txtAuthor.setText(null);
        txtCat.setText(null);
        txtPrice.setText(null);
        txtQuantity.setText(null);
        txtNumber.requestFocus();
    }  
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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filter;
    private javax.swing.JTextField Search;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearall;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
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
