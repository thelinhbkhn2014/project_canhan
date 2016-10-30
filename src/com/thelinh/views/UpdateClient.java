/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.views;

import com.thelinh.controller.LoadTable;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.thelinh.models.ClientSql;
import com.thelinh.models.Client;
import com.thelinh.controller.Controller;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Admin
 */
public class UpdateClient extends javax.swing.JFrame {

 //   ClientSQL clientSQL = new ClientSQL();
    public static PreparedStatement ps = null;
    String sql = "SELECT * FROM Client ORDER BY ClientId ASC";
    int k = 1;
    
    /**
     * Creates new form UpdateUser
     */
    public UpdateClient() {
        initComponents();
        //this.setLocation(300, 500);
        LoadTable.LoadDataClient(sql, tbClient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSearch = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfClientId = new javax.swing.JTextField();
        tfClientPassword = new javax.swing.JTextField();
        tfFullName = new javax.swing.JTextField();
        tfBirthDay = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClient = new javax.swing.JTable();
        btnAddFile = new javax.swing.JButton();
        btnPrintFile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbClient = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        jLabel1.setText("ClientId");

        jLabel2.setText("ClientPassword");

        jLabel3.setText("FullName");

        jLabel4.setText("BirthDay");

        jLabel5.setText("Address");

        jLabel6.setText("Phone");

        tfBirthDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBirthDayActionPerformed(evt);
            }
        });

        tbClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClient);

        btnAddFile.setText("Add File");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });

        btnPrintFile.setText("Print File");
        btnPrintFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintFileActionPerformed(evt);
            }
        });

        jLabel7.setText("Search by");

        cbClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ClientId", "ClientPassword", "FullName", "Address", "Phone", "None", " ", " " }));
        cbClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbClientItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSearch)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(btnAddFile)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPrintFile))
                            .addComponent(tfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(tfClientId)
                            .addComponent(tfClientPassword)
                            .addComponent(tfFullName)
                            .addComponent(tfBirthDay)
                            .addComponent(tfAddress)
                            .addComponent(tfPhone)
                            .addComponent(cbClient, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFile)
                    .addComponent(btAdd)
                    .addComponent(btDelete)
                    .addComponent(btEdit)
                    .addComponent(btnPrintFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfClientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBirthDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBirthDayActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String sql1 = "SELECT * FROM Client";
        String sql2 = "SELECT * FROM Client WHERE ClientId LIKE '%" + tfSearch.getText() + "%'";
        String sql3 = "SELECT * FROM Client WHERE ClientPassword LIKE '%" + tfSearch.getText() + "%'"; 
        String sql4 = "SELECT * FROM Client WHERE FullName LIKE '%" + tfSearch.getText() + "%'"; 
        String sql5 = "SELECT * FROM Client WHERE Address LIKE '%" + tfSearch.getText() + "%'"; 
        String sql6 = "SELECT * FROM Client WHERE Phone LIKE '%" + tfSearch.getText() + "%'"; 
        
        switch(k){
            case 1:
                LoadTable.LoadDataClient(sql2, tbClient);
                break;
            case 2:
                LoadTable.LoadDataClient(sql3, tbClient);
                break;
            case 3:
                LoadTable.LoadDataClient(sql4, tbClient);
                break;
            case 4:
                LoadTable.LoadDataClient(sql5, tbClient);
                break;
            case 5:
                LoadTable.LoadDataClient(sql6, tbClient);
                break;   
            case 6:
                LoadTable.LoadDataClient(sql1, tbClient);
                break;
             
        }
        
    }//GEN-LAST:event_btSearchActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(tfClientId.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "You have to enter ClientId", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tfClientId.getText().length() > 10){
            JOptionPane.showMessageDialog(null, "ClientId have to less more than 10 characters", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String sql = "SELECT ClientId FROM Client";
            ResultSet rs = LoadTable.Display(sql);
            try {
                while(rs.next()){
                    if(rs.getString("ClientId") == tfClientId.getText()){
                        JOptionPane.showMessageDialog(null, "This ClientId already exists", "Notification", JOptionPane.INFORMATION_MESSAGE);
 
                    }
                        }
                // xu li chua chuan lam! :(, thieu ep kieeu Sang date
                try {
                    Date dt = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(tfBirthDay.getText()).getTime());
                    Client client = new Client(tfClientId.getText(), tfClientPassword.getText(), tfFullName.getText(), dt,tfAddress.getText(), tfPhone.getText());
                    Controller.insertClient(client);
                    btSearch.doClick();
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            btSearch.doClick();
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(tfClientId.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "You have to enter ClientId", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tfClientId.getText().length() > 10){
            JOptionPane.showMessageDialog(null, "ClientId have to less more than 10 characters", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int click = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
            if(click == JOptionPane.YES_OPTION){
            if(Controller.deleteClient(tfClientId.getText())){
                JOptionPane.showMessageDialog(null, "Delete Success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "ClientId does not exist or somebody have borrowed","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            btSearch.doClick();
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if(tfClientId.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "You have to enter ClientId", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tfClientId.getText().length() > 10){
            JOptionPane.showMessageDialog(null, "ClientId have to less more than 10 characters", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else{int click = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
            if(click == JOptionPane.YES_OPTION){
            Client client = new Client(tfClientId.getText(), tfClientPassword.getText(), tfFullName.getText(), Date.valueOf(tfBirthDay.getText()), tfAddress.getText(), tfPhone.getText());
            if(Controller.updateClient(client)){
                JOptionPane.showMessageDialog(null, "Edit Success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "ClientId does not exist","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            btSearch.doClick();
        }
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void tbClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientMouseClicked
        int row = tbClient.getSelectedRow();
        String rowId = (tbClient.getModel().getValueAt(row, 0)).toString();
        
        String sql1 = "SELECT * FROM Client WHERE ClientId = '" + rowId + "'";
        ResultSet rs = LoadTable.Display(sql1);
        try {
            if(rs.next()){
                tfClientId.setText(rs.getString("ClientId"));
                tfClientPassword.setText(rs.getString("ClientPassword"));
                tfFullName.setText(rs.getString("FullName"));
                tfBirthDay.setText(rs.getString("BirthDay"));
                tfAddress.setText(rs.getString("Address"));
                tfPhone.setText(rs.getString("Phone"));
                        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    }//GEN-LAST:event_tbClientMouseClicked

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            jfc.setDialogTitle("Open File");
            File file = jfc.getSelectedFile();
                try {
                Workbook wb = Workbook.getWorkbook(file);
                Sheet sheet = wb.getSheet(0);
                int rows = sheet.getRows();
                int columns = sheet.getColumns();
                for(int i = 0; i < rows; i++){
                    Client client = new Client(sheet.getCell(0,i).getContents(), sheet.getCell(1,i).getContents(),
                                                sheet.getCell(2, i).getContents(), Date.valueOf(sheet.getCell(3, i).getContents()),
                                                sheet.getCell(4, i).getContents(), sheet.getCell(5, i).getContents());
                    Controller.insertClient(client);
                }
                wb.close();
                btSearch.doClick();
                
                } catch (IOException ex) {
                System.out.println("File not found\n" + ex.toString());
                } catch (BiffException ex) {
                Logger.getLogger(UpdateBook.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                }
        }
    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnPrintFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintFileActionPerformed
        JFileChooser jfc = new JFileChooser("Save File");
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            jfc.setDialogTitle("Save File");
            File file = jfc.getSelectedFile();
            WritableWorkbook wb;
            try {
                wb = Workbook.createWorkbook(file);
                WritableSheet sheet = wb.createSheet("Book", 0);
                try {
                    switch(k){
                        case 1:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS BY ClientId"));
                            sheet.addCell(new Label(0, 1, "ClientId :" + tfSearch.getText()));
                            break;
                        case 2:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS BY ClientPassword"));
                            sheet.addCell(new Label(0, 1, "ClientPassword :" + tfSearch.getText()));
                            break;
                        case 3:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS BY FullName"));
                            sheet.addCell(new Label(0, 1, "FullName :" + tfSearch.getText()));
                            break;
                        case 4:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS BY Address"));
                            sheet.addCell(new Label(0, 1, "Address :" + tfSearch.getText()));
                            break;
                        case 5:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS BY Phone"));
                            sheet.addCell(new Label(0, 1, "Phone :" + tfSearch.getText()));
                            break;
                        case 6:
                            sheet.addCell(new Label(0, 0, "CLIENT SEARCH RESULTS"));
                            break;
           
                    }
                    sheet.addCell(new Label(0, 2, "ClientId"));
                    sheet.addCell(new Label(1, 2, "ClientPassword"));
                    sheet.addCell(new Label(2, 2, "FullName"));
                    sheet.addCell(new Label(3, 2, "BirthDay"));
                    sheet.addCell(new Label(4, 2, "Address"));
                    sheet.addCell(new Label(5, 2, "Phone"));
                    int rowBegin = 3;
                    TableModel tableModel = tbClient.getModel();
                    for(int row = rowBegin, i = 0; row < rowBegin + tableModel.getRowCount(); row++, i++){
                        sheet.addCell(new Label(0, row, (String) tableModel.getValueAt(i, 0)));
                        sheet.addCell(new Label(1, row, (String) tableModel.getValueAt(i, 1)));
                        sheet.addCell(new Label(2, row, (String) tableModel.getValueAt(i, 2)));
                        SimpleDateFormat sdf = new SimpleDateFormat();
                        sheet.addCell(new Label(3, row, sdf.format(tableModel.getValueAt(i, 3))));
                        sheet.addCell(new Label(4, row, (String) tableModel.getValueAt(i, 4)));
                        sheet.addCell(new Label(5, row, (String) tableModel.getValueAt(i, 5)));
                    }
                    wb.write();
                    wb.close();
                    JOptionPane.showMessageDialog(null, "Save Success");
                    
                } catch (WriteException ex) {
                    Logger.getLogger(UpdateBook.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(UpdateBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_btnPrintFileActionPerformed

    private void cbClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbClientItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED && "ClientId".equals(evt.getItem().toString())){
            k = 1;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED && "ClientPassword".equals(evt.getItem().toString())){
            k = 2;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED && "FullName".equals(evt.getItem().toString())){
            k = 3;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED && "Address".equals(evt.getItem().toString())){
            k = 4;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED && "Phone".equals(evt.getItem().toString())){
            k = 5;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED && "None".equals(evt.getItem().toString())){
            k = 6;
        }
    }//GEN-LAST:event_cbClientItemStateChanged

    /**
     * @param args the command line arguments
     */public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnPrintFile;
    private javax.swing.JComboBox<String> cbClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbClient;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfBirthDay;
    private javax.swing.JTextField tfClientId;
    private javax.swing.JTextField tfClientPassword;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
