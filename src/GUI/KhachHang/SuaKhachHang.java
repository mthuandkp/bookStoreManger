
package GUI.KhachHang;


import DAO.KhachHangDAO;
import BUS.KhachHangBus;
import DTO.KhachHang;
import ProcessingFunction.ConnectionDB;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class SuaKhachHang extends javax.swing.JFrame {
    KhachHangBus khachhangbus = new KhachHangBus();
    ConnectionDB conn = new ConnectionDB();
    ArrayList<KhachHang> data = khachhangbus.gettAllData();
    KhachHang khachhang = null;
    
    public SuaKhachHang() {
        initComponents();
    }
    
    public SuaKhachHang(KhachHang kh) {
        initComponents();
        setKhachhang(kh);
        if(kh != null){
        makhachhang.setText(String.valueOf(kh.getMaKhachHang()));
        }
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        loadKhachHang();
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tenkhachhang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ngaysinh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        makhachhang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        diachi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sodienthoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Mã Khách Hàng:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Tên Khách Hàng:");

        tenkhachhang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Ngày Sinh:");

        ngaysinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa Khách Hàng");

        update.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        update.setText("Cập nhật");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("Làm lại");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        makhachhang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        makhachhang.setEnabled(false);
        makhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makhachhangActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Địa Chỉ:");

        diachi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Số Điện Thoại:");

        sodienthoai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(3, 121, Short.MAX_VALUE)
                                .addComponent(reset)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(61, 61, 61))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(makhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(makhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(update))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        if (tenkhachhang.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập tên khách hàng!");
            tenkhachhang.requestFocus();
            return;
        }
        if (ngaysinh.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập ngày sinh!");
            ngaysinh.requestFocus();
        }
        try {
            LocalDate lc = LocalDate.parse(ngaysinh.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mời nhập lại định dạng ngày là yyyy-mm-dd");
            ngaysinh.requestFocus();
            return;
        }
        if (diachi.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập địa chỉ!");
            diachi.requestFocus();
            return;
        }
        if (sodienthoai.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập số điện thoại!");
            sodienthoai.requestFocus();
            return;
        }
        if (sodienthoai.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Số điện thoại phải là 10 số!");
            sodienthoai.requestFocus();
            return;
        }
        try {
            int tmp = Integer.valueOf(sodienthoai.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số điện thoại phải là số");
            sodienthoai.requestFocus();
            return;
        }
        
        KhachHang kh = new KhachHang(Integer.valueOf(makhachhang.getText()), 
                tenkhachhang.getText(), LocalDate.parse(ngaysinh.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                diachi.getText(), sodienthoai.getText());
        boolean ok = khachhangbus.updateKH(kh);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            KhachHang newkh = khachhangbus.getKHById(kh.getMaKhachHang());
            return;
        }
        JOptionPane.showMessageDialog(null, "Không thể sửa.Error!!!");
    }//GEN-LAST:event_updateMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        tenkhachhang.setText("");
        ngaysinh.setText("");
        diachi.setText("");
        sodienthoai.setText("");
    }//GEN-LAST:event_resetMouseClicked

    private void makhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makhachhangActionPerformed
        // TODO add your handling code here:
        if (makhachhang.getText().compareTo("")==0) {
            tenkhachhang.setText("123");
            ngaysinh.setText("");
            diachi.setText("");
            sodienthoai.setText("");
            return;
        }
        KhachHang kh1 = khachhangbus.getKHbyID(Integer.valueOf(makhachhang.getText()));
        if (kh1 == null) {
            JOptionPane.showMessageDialog(null, "Lỗi khi load dữ liệu");
            return;
        }
            tenkhachhang.setText(kh1.getTenKhachHang());
            ngaysinh.setText(kh1.getNgaySinh().toString());
            diachi.setText(kh1.getDiaChi());
            sodienthoai.setText(kh1.getSDT());
    }//GEN-LAST:event_makhachhangActionPerformed

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
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField diachi;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField makhachhang;
    private javax.swing.JTextField ngaysinh;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sodienthoai;
    private javax.swing.JTextField tenkhachhang;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void loadKhachHang() {
        if(khachhang == null) return;
        tenkhachhang.setText(khachhang.getTenKhachHang());
        ngaysinh.setText(khachhang.getNgaySinh().toString());
        diachi.setText(khachhang.getDiaChi());
        sodienthoai.setText(khachhang.getSDT());
    }
    
}
