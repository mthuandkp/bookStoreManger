/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLNhaCungCap;

import BUS.NhaCungCapBus;
import DTO.NhaCungCap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHTHUAN
 */
public class TimKiem extends javax.swing.JFrame {
    NhaCungCapBus nccbus = new NhaCungCapBus();
    /**
     * Creates new form TimKiem
     */
    public TimKiem() {
        initComponents();
        initialization();
        performEvent();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        idCheck = new javax.swing.JCheckBox();
        idSupplier = new javax.swing.JComboBox<>();
        nameSupplier = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        nameCheck = new javax.swing.JCheckBox();
        phoneCheck = new javax.swing.JCheckBox();
        phoneSupplier = new javax.swing.JTextField();
        addressCheck = new javax.swing.JCheckBox();
        addressSupplier = new javax.swing.JTextField();
        statusSupplier = new javax.swing.JComboBox<>();
        statusCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Tìm kiếm nhà cung cấp");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        idCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idCheck.setText("Mã NCC");

        idSupplier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        nameSupplier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        find.setText("Tìm kiếm");

        nameCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameCheck.setText("Tên NCC");

        phoneCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phoneCheck.setText("SĐT");

        phoneSupplier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        addressCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        addressCheck.setText("Địa Chỉ");

        addressSupplier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        statusSupplier.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        statusCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        statusCheck.setText("Trạng Thái");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameCheck)
                            .addComponent(statusCheck)
                            .addComponent(idCheck))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idSupplier, 0, 268, Short.MAX_VALUE)
                            .addComponent(nameSupplier)
                            .addComponent(statusSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressCheck)
                                    .addComponent(phoneCheck))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneSupplier)
                                    .addComponent(addressSupplier))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(find))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel1)
                    .addContainerGap(580, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneCheck))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idCheck))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCheck)
                    .addComponent(addressSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressCheck))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCheck)
                    .addComponent(statusSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(632, Short.MAX_VALUE)))
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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addressCheck;
    private javax.swing.JTextField addressSupplier;
    private javax.swing.JButton find;
    private javax.swing.JCheckBox idCheck;
    private javax.swing.JComboBox<String> idSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nameCheck;
    private javax.swing.JTextField nameSupplier;
    private javax.swing.JCheckBox phoneCheck;
    private javax.swing.JTextField phoneSupplier;
    private javax.swing.JCheckBox statusCheck;
    private javax.swing.JComboBox<String> statusSupplier;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        initTable();
        loadId();
    }

    private void performEvent() {
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 0;
                String name = "";
                String phone = "";
                String address = "";
                int status = -1;
                
                
                if(idCheck.isSelected()){
                    id = ProcessingFunction.Other.getIdFromString(String.valueOf(idSupplier.getSelectedItem()));
                }
                
                if(nameCheck.isSelected()){
                    name = nameSupplier.getText();
                }
                
                if(phoneCheck.isSelected()){
                    phone = phoneSupplier.getText();
                }
                
                if(addressCheck.isSelected()){
                    address = addressSupplier.getText();
                }
                
                if(statusCheck.isSelected()){
                    status = statusSupplier.getSelectedIndex();
                }
                loadTableData(nccbus.searchNCC(id, name, phone, address, status));
            }
        });
    }

    private void initTable() {
        String[] header = {"Mã nhà cung cấp", "Tên nhà cung cấp", "SĐT", "Địa Chỉ", "Trạng Thái"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();

        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
    }
    
     public void removeAllTable() {
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        for (int i = defaults.getRowCount() - 1; i >= 0; i--) {
            defaults.removeRow(i);
        }
    }
     
     public void loadTableData(ArrayList<NhaCungCap> data){
         removeAllTable();
         DefaultTableModel defaults = (DefaultTableModel) table.getModel();
         for(NhaCungCap ncc : data){
             Object []obj = new Object[5];
             obj[0] = ncc.getMaNhaCungCap();
             obj[1] = ncc.getTenNhaCungCap();
             obj[2] = ncc.getSDT();
             obj[3] = ncc.getDiaChi();
             obj[4] = ncc.isTrangThai();
             
             defaults.addRow(obj);
         }
     }

    public void loadId() {
        ArrayList<NhaCungCap> data = nccbus.getAllData();
        
        for(NhaCungCap ncc : data){
            idSupplier.addItem(String.valueOf(ncc.getMaNhaCungCap()) + "-" + ncc.getTenNhaCungCap());
        }
        
        statusSupplier.addItem("Hoạt dộng");
        statusSupplier.addItem("Không hoạt dộng");
    }
}