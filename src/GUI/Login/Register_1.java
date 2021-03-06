/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Login;

import BUS.KhachHangBus;
import BUS.TaiKhoanBus;
import DTO.ChiTietHoaDon;
import DTO.TaiKhoan;
import GUI.KhachHang.Home;
import ProcessingFunction.SendEmail;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author MINHTHUAN
 */
public class Register_1 extends javax.swing.JFrame {

    private int ConfirmCode = 0;
    TaiKhoanBus tkbus = new TaiKhoanBus();
    KhachHangBus khbus = new KhachHangBus();
    ArrayList<ChiTietHoaDon> data = new ArrayList<>();

    /**
     * Creates new form Register_1
     */
    public Register_1() {
        initComponents();
        initialization();
        performEvent();
    }
    
    public Register_1(ArrayList<ChiTietHoaDon> dataTmp) {
        setData(dataTmp);
        initComponents();
        initialization();
        performEvent();
    }

    public ArrayList<ChiTietHoaDon> getData() {
        return data;
    }

    public void setData(ArrayList<ChiTietHoaDon> data) {
        this.data = data;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        forgetPassword4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        userIcon = new javax.swing.JLabel();
        passwordIcon2 = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        forgetPassword5 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        forgetPassword2 = new javax.swing.JLabel();
        confirmCode = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        returnLogin = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        passwordIcon = new javax.swing.JLabel();
        passwordIcon3 = new javax.swing.JLabel();
        getCodeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Vni 07 WaterBrushROB", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("????ng K?? 1/2");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        forgetPassword4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword4.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword4.setText("T??n t??i kho???n : (@gmail.com)");
        getContentPane().add(forgetPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 250, 40));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user_48px.png"))); // NOI18N
        getContentPane().add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 40, 50));

        passwordIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/key_2_100px.png"))); // NOI18N
        getContentPane().add(passwordIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 40, 50));

        forgetPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword.setText("M???t kh???u :");
        getContentPane().add(forgetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 40));

        forgetPassword5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword5.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword5.setText("X??c nh???n m???t kh???u :");
        getContentPane().add(forgetPassword5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        confirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 40));

        forgetPassword2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword2.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword2.setText("M?? x??c nh???n :");
        getContentPane().add(forgetPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        confirmCode.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        confirmCode.setForeground(new java.awt.Color(255, 255, 255));
        confirmCode.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(confirmCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 40));

        nextBtn.setBackground(new java.awt.Color(153, 51, 255));
        nextBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextBtn.setText("Ti???p Theo");
        getContentPane().add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 150, -1));

        returnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnLogin.setForeground(new java.awt.Color(255, 255, 51));
        returnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnLogin.setText("Tr??? v??? ????ng nh???p");
        getContentPane().add(returnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 490, 400, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(51, 51, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/export_64px.png"))); // NOI18N
        exitBtn.setText("Tho??t");
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 120, -1));

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/data_matrix_code_50px.png"))); // NOI18N
        getContentPane().add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 30, 30));

        passwordIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/checked_30px.png"))); // NOI18N
        getContentPane().add(passwordIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, 50));

        getCodeBtn.setBackground(new java.awt.Color(0, 51, 204));
        getCodeBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getCodeBtn.setForeground(new java.awt.Color(255, 51, 51));
        getCodeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/code_26px.png"))); // NOI18N
        getContentPane().add(getCodeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("L???y M??");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

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
            java.util.logging.Logger.getLogger(Register_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField confirmCode;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel forgetPassword;
    private javax.swing.JLabel forgetPassword2;
    private javax.swing.JLabel forgetPassword4;
    private javax.swing.JLabel forgetPassword5;
    private javax.swing.JButton getCodeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel passwordIcon2;
    private javax.swing.JLabel passwordIcon3;
    private javax.swing.JLabel returnLogin;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);

        //username
        username.setBackground(new Color(0, 0, 0, 0));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //password
        password.setBackground(new Color(0, 0, 0, 0));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Confirm password
        confirmPassword.setBackground(new Color(0, 0, 0, 0));
        confirmPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Code
        confirmCode.setBackground(new Color(0, 0, 0, 0));
        confirmCode.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }

    private void performEvent() {
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home(null, data).setVisible(true);
                dispose();
            }
        });

        returnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Login().setVisible(true);
                dispose();
            }
        });

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkInput() == false) {
                    return;
                }
                TaiKhoan tk = new TaiKhoan(username.getText(), String.valueOf(password.getPassword()), khbus.createAutoId(), true);
                new Register_2(tk,data).setVisible(true);
            }
        });

        getCodeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n ????ng nh???p");
                    return;
                }
                //Ten dang nhap khong hop le
                if (username.getText().contains("@gmail.com") == false) {
                    JOptionPane.showMessageDialog(null, "T??n ????ng nh???p ph???i l?? email");
                    return;
                }
                if (tkbus.isExistTK(username.getText())) {
                    JOptionPane.showMessageDialog(null, "T??i kho???n ???? t???n t???i");
                    return ;
                }
                Random rd = new Random();
                int code = 100000+rd.nextInt(999999-100000+1);
                setConfirmCode(code);
                String html = "<div style=\"width: 80%;margin-left: 10%;background-color: rgb(226, 224, 224);border-radius: 2rem;height: 20rem;\">\n" +
"		<div style=\"background-color: cadetblue;height: 4rem;border-top-left-radius: 2rem;border-top-right-radius: 2rem;\">\n" +
"			<h1 style=\"width: 100%;text-align: center;color: rgb(255, 255, 255);padding-top: 1rem;\">LAY MA XAC NHAN</h1>\n" +
"		</div>\n" +
"		<h1 style=\"width: 100%;text-align: center;color:blue;\">MA XAC NHAN : "+getConfirmCode()+"</h1>\n" +
"               </div>";
                try {
                    SendEmail send = new SendEmail(username.getText(), "", html);
                    send.run();
                } catch (Exception ex) {
                    Logger.getLogger(Register_1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    public boolean checkInput() {
        //Chua nhap ten dang nhap
        if (username.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n ????ng nh???p");
            return false;
        }
        //Ten dang nhap khong hop le
        if (username.getText().contains("@gmail.com") == false) {
            JOptionPane.showMessageDialog(null, "T??n ????ng nh???p ph???i l?? email");
            return false;
        }
        //Ten dang nhap bi trung
        if (tkbus.isExistTK(username.getText())) {
            JOptionPane.showMessageDialog(null, "T??i kho???n ???? t???n t???i");
            return false;
        }
        //Chua nhap mat khau
        if (String.valueOf(password.getPassword()).compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p m???t kh???u");
            return false;
        }
        //Mat khau khong hop le
        for (char a : String.valueOf(password.getPassword()).toCharArray()) {
            if (a < 48
                    || a < 65 && a > 57
                    || a < 97 && a > 90
                    || a > 122) {
                JOptionPane.showMessageDialog(null, "M???t kh???u kh??ng h???p l???. M???t kh???u ch??? ch???a ch??? th?????ng, ch??? in hoa v?? s???");
                return false;
            }
        }
        //Chua nhap xac nhan mat khau
        if (String.valueOf(confirmPassword.getPassword()).compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p x??c nh???n m???t kh???u");
            return false;
        }
        //Mat khau va xac nhan khong trung khop
        if (String.valueOf(password.getPassword()).compareTo(String.valueOf(confirmPassword.getPassword())) != 0) {
            JOptionPane.showMessageDialog(null, "M???t kh???u v?? x??c nh???n m???t kh???u kh??ng tr??ng kh???p");
            return false;
        }
        //chua nhap ma xac nhan
        if (confirmCode.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ch??a nh???p m?? x??c nh???n");
            return false;
        }
        //Ma xac nhan khong chinnh xac
        try {
            if(Integer.valueOf(confirmCode.getText()) != getConfirmCode()){
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "M?? x??c nh???n kh??ng ch??nh x??c");
            return false;
        }
        return true;
    }

    public int getConfirmCode() {
        return ConfirmCode;
    }

    public void setConfirmCode(int ConfirmCode) {
        this.ConfirmCode = ConfirmCode;
    }
    
    
}
