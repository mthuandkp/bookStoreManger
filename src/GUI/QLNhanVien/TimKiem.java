/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLNhanVien;

import BUS.NhanVienBus;
import BUS.QuyenBus;
import DTO.NhanVien;
import DTO.Quyen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHTHUAN
 */
public class TimKiem extends javax.swing.JFrame {

    NhanVienBus nvbus = new NhanVienBus();
    QuyenBus quyenbus = new QuyenBus();

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

        background = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        idStaff = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameStaff = new javax.swing.JTextField();
        birthdayStaff = new javax.swing.JTextField();
        phoneStaff = new javax.swing.JTextField();
        rightStaff = new javax.swing.JComboBox<>();
        addressStaff = new javax.swing.JTextField();
        usernameStaff = new javax.swing.JTextField();
        usernameCheck = new javax.swing.JCheckBox();
        idCheck = new javax.swing.JCheckBox();
        nameCheck = new javax.swing.JCheckBox();
        dateCheck = new javax.swing.JCheckBox();
        sexCheck = new javax.swing.JCheckBox();
        phoneCheck = new javax.swing.JCheckBox();
        addressCheck = new javax.swing.JCheckBox();
        rightCheck = new javax.swing.JCheckBox();
        exportPdfBtn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sexStaff = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("Bỏ chọn");
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 160, -1));

        idStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(idStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tìm kiếm Nhân Viên");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1140, -1));

        nameStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(nameStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 270, -1));

        birthdayStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(birthdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 270, -1));

        phoneStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(phoneStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 270, -1));

        rightStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(rightStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 270, -1));

        addressStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(addressStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 270, -1));

        usernameStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(usernameStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 270, -1));

        usernameCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usernameCheck.setText("Tên đăng nhập");
        background.add(usernameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        idCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idCheck.setText("Mã nhân viên");
        background.add(idCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        nameCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameCheck.setText("Tên nhân viên");
        background.add(nameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        dateCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateCheck.setText("Ngày sinh");
        background.add(dateCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        sexCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        sexCheck.setText("Giới tính");
        background.add(sexCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        phoneCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phoneCheck.setText("SĐT");
        background.add(phoneCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));

        addressCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        addressCheck.setText("Địa chỉ");
        background.add(addressCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        rightCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rightCheck.setText("Quyền");
        background.add(rightCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        exportPdfBtn2.setBackground(new java.awt.Color(255, 255, 255));
        exportPdfBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exportPdfBtn2.setForeground(new java.awt.Color(102, 102, 102));
        exportPdfBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        exportPdfBtn2.setText("Tìm Kiếm");
        exportPdfBtn2.setBorder(null);
        background.add(exportPdfBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 180, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 1040, -1));

        sexStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(sexStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
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
    private javax.swing.JTextField addressStaff;
    private javax.swing.JPanel background;
    private javax.swing.JTextField birthdayStaff;
    private javax.swing.JCheckBox dateCheck;
    private javax.swing.JButton exportPdfBtn2;
    private javax.swing.JCheckBox idCheck;
    private javax.swing.JComboBox<String> idStaff;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nameCheck;
    private javax.swing.JTextField nameStaff;
    private javax.swing.JCheckBox phoneCheck;
    private javax.swing.JTextField phoneStaff;
    private javax.swing.JCheckBox rightCheck;
    private javax.swing.JComboBox<String> rightStaff;
    private javax.swing.JCheckBox sexCheck;
    private javax.swing.JComboBox<String> sexStaff;
    private javax.swing.JTable table;
    private javax.swing.JCheckBox usernameCheck;
    private javax.swing.JTextField usernameStaff;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        loadId();
        initTable();
    }

    private void performEvent() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Bỏ chọn": {
                        unSelectAll();
                        break;
                    }
                    case "Tìm Kiếm": {
                        int id = -1;
                        String name = "";
                        String birthday = "";
                        int sex = -1;
                        int right = -1;
                        String username = "";
                        String sdt = "";
                        String address = "";

                        if (idCheck.isSelected()) {
                            id = Integer.valueOf(String.valueOf(idStaff.getSelectedItem()));
                        }

                        if (nameCheck.isSelected()) {
                            name = nameStaff.getText();
                        }
                        if (dateCheck.isSelected()) {
                            birthday = birthdayStaff.getText();
                        }
                        if (sexCheck.isSelected()) {
                            sex = sexStaff.getSelectedIndex();
                        }
                        if (rightCheck.isSelected()) {
                            right = rightStaff.getSelectedIndex() + 1;
                        }
                        if (usernameCheck.isSelected()) {
                            username = usernameStaff.getText();
                        }
                        if (phoneCheck.isSelected()) {
                            sdt = phoneStaff.getText();
                        }
                        if (addressCheck.isSelected()) {
                            address = addressStaff.getText();
                        }
                        
                        ArrayList<NhanVien> data = nvbus.searchData(id, name, birthday, sex, right, username, sdt, address);
                        loadTableData(data);
                        break;
                    }
                }
            }
        };
        Arrays.stream(background.getComponents()).forEach(c -> {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(ac);
                ((JButton) c).setActionCommand(((JButton) c).getActionCommand());
            }
        });

    }

    public void unSelectAll() {
        idCheck.setSelected(false);
        nameCheck.setSelected(false);
        dateCheck.setSelected(false);
        sexCheck.setSelected(false);
        phoneCheck.setSelected(false);
        addressCheck.setSelected(false);
        rightCheck.setSelected(false);
        usernameCheck.setSelected(false);
    }

    private void loadId() {
        ArrayList<NhanVien> dataNV = nvbus.getAllData();
        ArrayList<Quyen> dataQuyen = quyenbus.getAllData();

        for (NhanVien nv : dataNV) {
            idStaff.addItem(String.valueOf(nv.getMaNhanVien()));
        }

        for (Quyen q : dataQuyen) {
            rightStaff.addItem(String.valueOf(q.getMaQuyen()) + "-" + q.getTenQuyen());
        }
        sexStaff.addItem("Nam");
        sexStaff.addItem("Nữ");
    }

    private void loadTableData(ArrayList<NhanVien> data) {
        removeAllTableData();
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        Object []obj = new Object[10];
        for(NhanVien nv : data){
            obj[0] = nv.getMaNhanVien();
            obj[1] = nv.getTenNhanVien();
            obj[2] = nv.getNgaySinh().toString();
            obj[3] = nv.isGioiTinh();
            obj[4] = nv.getSDT();
            obj[5] = nv.getDiaChi();
            obj[6] = nv.getMaQuyen();
            obj[7] = nv.getTenDangNhap();
            obj[8] = nv.getMatKhau();
            obj[9] = nv.isTrangThai();
            defaults.addRow(obj);
            
        }
    }
    
    private void removeAllTableData() {
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        for (int i = defaults.getRowCount() - 1; i >= 0; i--) {
            defaults.removeRow(i);
        }
    }
    
     private void initTable() {
        String []header = {"Mã nhân viên","Tên nhân viên","Ngày Sinh","Giới tính (Nam ?)","SĐT","Địa chỉ","Mã quyền","Tên đăng nhập","Mật khẩu","Trạng Thái"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
    }
}
