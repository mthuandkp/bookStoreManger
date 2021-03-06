package GUI.QLNhaCungCap;

import DAO.NhaCungCapDao;
import BUS.NhaCungCapBus;
import DTO.NhaCungCap;
import ProcessingFunction.ConnectionDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ThemNhaCungCap extends javax.swing.JFrame {
    NhaCungCapBus nhacungcapbus = new NhaCungCapBus();
    ArrayList<NhaCungCap> arr = nhacungcapbus.getAllData();
    ConnectionDB conn = new ConnectionDB();
    public ThemNhaCungCap() {
        initComponents();
        initialization();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diachi = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        manhacungcap = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tennhacungcap = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sodienthoai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diachi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add.setText("Thêm");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("Làm lại");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        manhacungcap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setText("Thoát");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Mã Nhà Cung Cấp: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Tên Nhà Cung Cấp: ");

        tennhacungcap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Số Điện Thoại: ");

        sodienthoai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Nhà Cung Cấp");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Địa Chỉ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tennhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(41, 41, 41)
                .addComponent(reset)
                .addGap(35, 35, 35)
                .addComponent(add)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(manhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tennhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(reset)
                    .addComponent(exit))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:

        if (manhacungcap.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập mã nhà cung cấp!");
            manhacungcap.requestFocus();
            return;     
        } 
        try {
            int tmp = Integer.valueOf(manhacungcap.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã nhà cung cấp phải là số");
            manhacungcap.requestFocus();
            return;
        }
        if (tennhacungcap.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập tên nhà cung cấp!");
            tennhacungcap.requestFocus();
            return;
        }
        if (sodienthoai.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập số điện thoại nhà cung cấp!");
            sodienthoai.requestFocus();
            return;
        }
        if (sodienthoai.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Số điện thoại phải là 10 số");
            sodienthoai.requestFocus();
            return;
        }
        if (diachi.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Nhập địa chỉ nhà cung cấp!");
            diachi.requestFocus();
            return;
        }
        
       
        try {
            int tmp = Integer.valueOf(sodienthoai.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số điện thoại nhà cung cấp phải là số");
            sodienthoai.requestFocus();
            return;
        }
        if (nhacungcapbus.checkMaNCC(manhacungcap.getText())) {
            JOptionPane.showMessageDialog(null, "Mã nhà cung cấp đã tồn tại, mời nhập lại!");
            manhacungcap.setText("");
            manhacungcap.requestFocus();
            return;
        }
        NhaCungCap ncc = new NhaCungCap(Integer.valueOf(manhacungcap.getText()), 
                                        tennhacungcap.getText(),
                                        sodienthoai.getText(), 
                                        diachi.getText(),
                                        true);
        boolean ok = nhacungcapbus.addNCC(ncc);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            manhacungcap.setText("");
            tennhacungcap.setText("");
            sodienthoai.setText("");
            diachi.setText("");
            return;
        }
        JOptionPane.showMessageDialog(null, "Không thể thêm.Error!!!");
    }//GEN-LAST:event_addMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có thưc sự muốn thoát","",0);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        manhacungcap.setText("");
        tennhacungcap.setText("");
        sodienthoai.setText("");
        diachi.setText("");
    }//GEN-LAST:event_resetMouseClicked

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
            java.util.logging.Logger.getLogger(ThemNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemNhaCungCap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField diachi;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manhacungcap;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sodienthoai;
    private javax.swing.JTextField tennhacungcap;
    // End of variables declaration//GEN-END:variables
    
    private void initialization() {
        this.setLocationRelativeTo(null);
    }
    
}

