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
import ProcessingFunction.Other;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author MINHTHUAN
 */
public class SuaNhanVien extends javax.swing.JFrame {

    NhanVienBus nvbus = new NhanVienBus();
    QuyenBus quyenbus = new QuyenBus();
    NhanVien nv = null;

    /**
     * Creates new form SuaNhanVien
     */
    public SuaNhanVien() {
        initComponents();
        initialization();
        performEvent();
    }

    SuaNhanVien(NhanVien nhanvien) {
        setNv(nhanvien);
        initComponents();
        initialization();
        performEvent();
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        idStaff = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameStaff = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        birthdayStaff = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneStaff = new javax.swing.JTextField();
        rightStaff = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        addressStaff = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordStaff = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        usernameStaff = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        sexStaff = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        statusStaff = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("M?? nh??n vi??n");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("L??m l???i");
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 160, -1));

        idStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(idStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("S???a Nh??n Vi??n");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("M?? quy???n");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("T??n nh??n vi??n");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        nameStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(nameStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 270, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Ng??y sinh");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        birthdayStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(birthdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 270, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Gi???i t??nh");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("S??T");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        phoneStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(phoneStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 270, -1));

        rightStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(rightStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 270, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("?????a ch???");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        addressStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(addressStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 270, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("M???t kh???u");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        passwordStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(passwordStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 270, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("T??n ????ng nh???p");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        usernameStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(usernameStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 270, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("S???a");
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 160, -1));

        sexStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(sexStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Tr???ng th??i");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        statusStaff.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.add(statusStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressStaff;
    private javax.swing.JPanel background;
    private javax.swing.JTextField birthdayStaff;
    private javax.swing.JComboBox<String> idStaff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameStaff;
    private javax.swing.JTextField passwordStaff;
    private javax.swing.JTextField phoneStaff;
    private javax.swing.JComboBox<String> rightStaff;
    private javax.swing.JComboBox<String> sexStaff;
    private javax.swing.JComboBox<String> statusStaff;
    private javax.swing.JTextField usernameStaff;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        loadId();
    }
    
    private void performEvent() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "S???a": {
                        if(checkInput() == false){
                            return;
                        }
                        
                        NhanVien nv = new NhanVien(
                                Integer.valueOf(String.valueOf(idStaff.getSelectedItem())),
                                nameStaff.getText(),
                                LocalDate.parse(birthdayStaff.getText()),
                                (sexStaff.getSelectedIndex() == 0 ? true : false),
                                phoneStaff.getText(),
                                addressStaff.getText(),
                                Other.getIdFromString(String.valueOf(rightStaff.getSelectedItem())),
                                usernameStaff.getText(),
                                passwordStaff.getText(),
                                statusStaff.getSelectedIndex() == 0 ? true:false
                        );
                        
                        if(nvbus.updateNV(nv)){
                            JOptionPane.showMessageDialog(null, "S???a th??ng tin th??nh c??ng");
                            reset();
                            return;
                        }
                        JOptionPane.showMessageDialog(null, "S???a kh??ng th??nh c??ng");
                        break;
                    }
                    case "L??m l???i": {
                        reset();
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
        
        idStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(idStaff.getSelectedIndex() == 0){
                    reset();
                    return;
                }
                int id = Integer.valueOf(String.valueOf(idStaff.getSelectedItem()));
                NhanVien nv = nvbus.getStaffById(id);
                nameStaff.setText(nv.getTenNhanVien());
                birthdayStaff.setText(nv.getNgaySinh().toString());
                sexStaff.setSelectedIndex((nv.isGioiTinh() == true) ? 0:1);
                phoneStaff.setText(nv.getSDT());
                addressStaff.setText(nv.getDiaChi());
                usernameStaff.setText(nv.getTenDangNhap());
                passwordStaff.setText(nv.getMatKhau());
                rightStaff.setSelectedIndex(nv.getMaQuyen() - 1);
                statusStaff.setSelectedIndex((nv.isTrangThai()) ? 0:1);
            }
        });
        
    }

    private void reset() {
        idStaff.setSelectedIndex(0);
        nameStaff.setText("");
        birthdayStaff.setText("");
        sexStaff.setSelectedIndex(0);
        phoneStaff.setText("");
        addressStaff.setText("");
        rightStaff.setSelectedIndex(0);
        usernameStaff.setText("");
        passwordStaff.setText("");
        statusStaff.setSelectedIndex(0);
    }

    public boolean checkInput() {
        if (nameStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p t??n nh??n vi??n");
            return false;
        }
        if (birthdayStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p ng??y sinh nh??n vi??n");
            return false;
        }
        try {
            LocalDate.parse(birthdayStaff.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ng??y sinh nh??n vi??n ph???i c?? d???ng yyyy-mm-dd");
            return false;
        }
        
        if (phoneStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p SDT nh??n vi??n");
            return false;
        }
        if (phoneStaff.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "SDT ph???i c?? 10 ch??? s???");
            return false;
        }
        try {
            Integer.valueOf(phoneStaff.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "S??T kh??ng h???p l???");
            return false;
        }
        
        if (addressStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p ?????a ch??? nh??n vi??n");
            return false;
        }
        
        if (usernameStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p t??n t??i kho???n nh??n vi??n");
            return false;
        }
        if (passwordStaff.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p m???t kh???u nh??n vi??n");
            return false;
        }
        return true;
    }
    
    public void loadId() {
        ArrayList<Quyen> data = quyenbus.getAllData();
        ArrayList<NhanVien> dataNV = nvbus.getAllData();
        
        for (Quyen q : data) {
            rightStaff.addItem(String.valueOf(q.getMaQuyen()) + "-" + q.getTenQuyen());
        }
        
        idStaff.addItem("[L???a ch???n]");
        for (NhanVien nv : dataNV) {
            if(nv.getMaNhanVien() == this.nv.getMaNhanVien()) continue;
            idStaff.addItem(String.valueOf(nv.getMaNhanVien()));
        }
        
        sexStaff.addItem("Nam");
        sexStaff.addItem("N???");
        
        statusStaff.addItem("??ang ho???t ?????ng");
        statusStaff.addItem("???? kh??a");
    }
    
}
