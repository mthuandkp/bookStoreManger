/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Login;

import BUS.TaiKhoanBus;
import DTO.ChiTietHoaDon;
import DTO.KhachHang;
import DTO.TaiKhoan;
import GUI.KhachHang.Home;
import ProcessingFunction.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author MTHUAN
 */
public class Login extends javax.swing.JFrame {

    TaiKhoanBus tkbus = new TaiKhoanBus();
    ArrayList<ChiTietHoaDon> dataCart = new ArrayList<>();
    boolean isFirstClick = true;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        initialization();
        performEvent();
    }

    public Login(ArrayList<ChiTietHoaDon> data) {
        setDataCart(data);
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

        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        registerNow = new javax.swing.JLabel();
        forgetPass = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("T??n ????ng nh???p");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user_48px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/key_2_100px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 40, 40));

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(153, 102, 255));
        loginBtn.setText("????ng nh???p");
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/book_60px.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("????ng nh???p");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 90, 400, -1));

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("M???t kh???u");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, -1));

        registerNow.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        registerNow.setForeground(new java.awt.Color(255, 255, 255));
        registerNow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerNow.setText("B???n ch??a c?? t??i kho???n ? ????ng k?? ngay");
        getContentPane().add(registerNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, -1));

        forgetPass.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        forgetPass.setForeground(new java.awt.Color(255, 255, 0));
        forgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgetPass.setText("Qu??n m???t kh???u");
        getContentPane().add(forgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 400, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(51, 51, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/export_64px.png"))); // NOI18N
        exitBtn.setText("Tho??t");
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        background.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1092593.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel forgetPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel registerNow;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        //this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        //Username
        username.setBackground(new Color(0, 0, 0, 0));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Password
        password.setBackground(new Color(0, 0, 0, 0));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }

    private void performEvent() {
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home(null, dataCart).setVisible(true);
                dispose();
            }
        });

        registerNow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Register_1().setVisible(true);
                dispose();
            }
        });

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkInput() == false) {
                    return;
                }
                if (tkbus.isExistUser(username.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "T??i kho???n kh??ng t???n t???i. ??i ????ng k?? ngay 1 c??i n??o :))");
                    return;
                }
                TaiKhoan tk = tkbus.getAccountByUser(username.getText());
                if (tk.getMatKhau().compareTo(String.valueOf(password.getPassword())) != 0) {
                    JOptionPane.showMessageDialog(null, "Sai m???t kh???u r???i n??");
                    if (JOptionPane.showConfirmDialog(null, "B???n c?? mu???n d??ng kh??i ph???c m???t kh???u kh??ng ?", "X??c nh???n", 0) == 0) {

                    }
                    return;
                }
                if (tk.isTrangThai() == false) {
                    JOptionPane.showMessageDialog(null, "T??i kho???n n??y ???? b??? kh??a vui l??ng li??n h??? b??? ph???n CSKH ????? bi???t th??m chi ti???t");
                    return;
                }

                KhachHang kh = tkbus.loginAccount(username.getText(), String.valueOf(password.getPassword()));
                JOptionPane.showMessageDialog(null, "????ng nh???p th??nh c??ng. Ch??o m???ng b???n tr??? l???i");
                new Home(kh, dataCart).setVisible(true);
                dispose();
            }
        });

        forgetPass.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new ForgetPassword().setVisible(true);
                dispose();
            }
        });

        //X??a ch??? trong user v?? pass khi nh???n v??o
        username.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(isFirstClick == false) return;
                username.setText("");
                password.setText("");
                isFirstClick = false;
            }
        });
        password.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(isFirstClick == false) return;
                username.setText("");
                password.setText("");
                isFirstClick = false;
            }
        });

        //Login khi nguoi dung nhap nhim enter
        username.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    password.requestFocus();
                }
            }
        });
        password.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (checkInput() == false) {
                        return;
                    }
                    if (tkbus.isExistUser(username.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "T??i kho???n kh??ng t???n t???i. ??i ????ng k?? ngay 1 c??i n??o :))");
                        return;
                    }
                    TaiKhoan tk = tkbus.getAccountByUser(username.getText());
                    if (tk.getMatKhau().compareTo(String.valueOf(password.getPassword())) != 0) {
                        JOptionPane.showMessageDialog(null, "Sai m???t kh???u r???i n??");
                        if (JOptionPane.showConfirmDialog(null, "B???n c?? mu???n d??ng kh??i ph???c m???t kh???u kh??ng ?", "X??c nh???n", 0) == 0) {

                        }
                        return;
                    }
                    if (tk.isTrangThai() == false) {
                        JOptionPane.showMessageDialog(null, "T??i kho???n n??y ???? b??? kh??a vui l??ng li??n h??? b??? ph???n CSKH ????? bi???t th??m chi ti???t");
                        return;
                    }

                    KhachHang kh = tkbus.loginAccount(username.getText(), String.valueOf(password.getPassword()));
                    JOptionPane.showMessageDialog(null, "????ng nh???p th??nh c??ng");
                    new Home(kh, dataCart).setVisible(true);
                    dispose();
                }
            }
        });
    }

    public boolean checkInput() {
        //Ch??a nh???p t??n ????ng nh???p
        if (username.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n ????ng nh???p");
            return false;
        }
        //Sai ?????nh d???ng t??n ????ng nh???p
        if (username.getText().contains("@gmail.com") == false) {
            JOptionPane.showMessageDialog(null, "T??n ????ng nh???p ph???i l?? email");
            return false;
        }
        //Ch??a nh???p m???t kh???u
        if (String.valueOf(password.getPassword()).compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p m???t kh???u");
            return false;
        }
        //M???t kh???u ch???a k?? t??? ?????c bi???t,kho???ng tr???ng
        //48-57 [0-9]
        //65-90 [A-Z]
        //97-122 [a-z]
        for (char a : String.valueOf(password.getPassword()).toCharArray()) {
            if (a < 48
                    || a < 65 && a > 57
                    || a < 97 && a > 90
                    || a > 122) {
                JOptionPane.showMessageDialog(null, "M???t kh???u kh??ng h???p l???. M???t kh???u ch??? ch???a ch??? th?????ng, ch??? in hoa v?? s???");
                return false;
            }
        }
        return true;
    }

    public ArrayList<ChiTietHoaDon> getDataCart() {
        return dataCart;
    }

    public void setDataCart(ArrayList<ChiTietHoaDon> dataCart) {
        this.dataCart = dataCart;
    }

}
