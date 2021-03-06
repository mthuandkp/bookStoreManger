/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Login;


import BUS.KhachHangBus;
import BUS.TaiKhoanBus;
import DTO.ChiTietHoaDon;
import DTO.KhachHang;
import DTO.TaiKhoan;
import GUI.KhachHang.Home;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author MINHTHUAN
 */
public class Register_2 extends javax.swing.JFrame {
    TaiKhoan tk = null;
    KhachHangBus khbus = new KhachHangBus();
    TaiKhoanBus tkbus = new TaiKhoanBus();
    ArrayList <ChiTietHoaDon> dataCart = new ArrayList<>();
    /**
     * Creates new form Register_1
     */
    public Register_2() {
        initComponents();
        initialization();
        performEvent();
    }

    public Register_2(TaiKhoan taikhoan) {
        this.tk = new TaiKhoan(taikhoan.getTenDangNhap(), taikhoan.getMatKhau(), taikhoan.getMaKhachHang(), taikhoan.isTrangThai());
        initComponents();
        initialization();
        performEvent();
    }
    
    public Register_2(TaiKhoan taikhoan,ArrayList<ChiTietHoaDon> datatmp) {
        setDataCart(datatmp);
        this.tk = new TaiKhoan(taikhoan.getTenDangNhap(), taikhoan.getMatKhau(), taikhoan.getMaKhachHang(), taikhoan.isTrangThai());
        initComponents();
        initialization();
        performEvent();
    }

    public ArrayList<ChiTietHoaDon> getDataCart() {
        return dataCart;
    }

    public void setDataCart(ArrayList<ChiTietHoaDon> dataCart) {
        this.dataCart = dataCart;
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
        dateOfBirth = new javax.swing.JTextField();
        userIcon = new javax.swing.JLabel();
        passwordIcon2 = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JLabel();
        forgetPassword5 = new javax.swing.JLabel();
        forgetPassword2 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        returnPrevious = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        passwordIcon = new javax.swing.JLabel();
        passwordIcon3 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Vni 07 WaterBrushROB", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("????ng K?? 2/2");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        forgetPassword4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword4.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword4.setText("T??n kh??ch h??ng :");
        getContentPane().add(forgetPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        dateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 40));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user_48px.png"))); // NOI18N
        getContentPane().add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 40, 50));

        passwordIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pay_date_24px.png"))); // NOI18N
        getContentPane().add(passwordIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 30, 50));

        forgetPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword.setText("Ng??y sinh : (yyyy-mm-dd)");
        getContentPane().add(forgetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        forgetPassword5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword5.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword5.setText("S??T :");
        getContentPane().add(forgetPassword5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        forgetPassword2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgetPassword2.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassword2.setText("?????a Ch??? :");
        getContentPane().add(forgetPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        address.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 40));

        registerBtn.setBackground(new java.awt.Color(102, 0, 255));
        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("????ng k??");
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, -1));

        returnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnPrevious.setForeground(new java.awt.Color(255, 255, 51));
        returnPrevious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnPrevious.setText("Tr??? v??? trang tr?????c");
        getContentPane().add(returnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(51, 51, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/export_64px.png"))); // NOI18N
        exitBtn.setText("Tho??t");
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 120, -1));

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/address_50px.png"))); // NOI18N
        getContentPane().add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 30, 30));

        passwordIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/phone_26px.png"))); // NOI18N
        getContentPane().add(passwordIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 30, 40));

        phone.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 40));

        name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 250, 40));

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
            java.util.logging.Logger.getLogger(Register_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel background;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel forgetPassword;
    private javax.swing.JLabel forgetPassword2;
    private javax.swing.JLabel forgetPassword4;
    private javax.swing.JLabel forgetPassword5;
    private javax.swing.JTextField name;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel passwordIcon2;
    private javax.swing.JLabel passwordIcon3;
    private javax.swing.JTextField phone;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel returnPrevious;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        this.setLocationRelativeTo(null);
        //name
        name.setBackground(new Color(0, 0, 0, 0));
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Date of birth
        dateOfBirth.setBackground(new Color(0, 0, 0, 0));
        dateOfBirth.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Phone
        phone.setBackground(new Color(0, 0, 0, 0));
        phone.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        //Address
        address.setBackground(new Color(0, 0, 0, 0));
        address.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
    }

    private void performEvent() {
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home(null, dataCart).setVisible(true);
                dispose();
            }
        });
        returnPrevious.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (checkInput() == false) {
                    return;
                }
                dispose();
            }

        });
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(checkInput() == false) return;
                KhachHang kh = new KhachHang(
                        tk.getMaKhachHang(), 
                        name.getText(), 
                        LocalDate.parse(dateOfBirth.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")), 
                        address.getText(), 
                        phone.getText(),
                        true
                );
                if(khbus.addCustomer(kh) && tkbus.addAccount(getTk())){
                    JOptionPane.showMessageDialog(null, "????ng k?? th??nh c??ng vui l??ng ????ng nh???p");
                    dispose();
                    new Login(dataCart).setVisible(true);
                    return;
                }
            }
        });
    }

    private boolean checkInput() {
        //Chua nhap ten
        if (name.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n");
            return false;
        }
        //Chua nhap ngay sinh
        if (dateOfBirth.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p ng??y sinh");
            return false;
        }
        /*if(ProcessingFunction.check.checkValidDate(dateOfBirth.getText()) == false){
            JOptionPane.showMessageDialog(null, "B???n d??ng l???ch sao h???o ?? ???");
            return false;
        }*/
        //Ngay sinh khong hop le
        try {
            LocalDate.parse(dateOfBirth.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ng??y sinh ph???i c?? d???ng yyyy-mm-dd");
            return false;
        }
        //Chua nhap SDT
        if(phone.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p S??T");
            return false;
        }
        //SDT khong hop le
        if(ProcessingFunction.check.checkPhoneNumber(phone.getText()) == false){
            JOptionPane.showMessageDialog(null, "S??T kh??ng h???p l???");
            return false;
        }
        //Chua nhap dia chi
        if(address.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Ch??a nh???p ?????a ch???");
            return false;
        }
        return true;
    }

    public TaiKhoan getTk() {
        return tk;
    }

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }
    
    
}
