/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.KhachHang;

import BUS.SachBus;
import BUS.TheLoaiBus;
import DTO.ChiTietHoaDon;
import DTO.Sach;
import DTO.TheLoai;
import ProcessingFunction.CopyImage;
import ProcessingFunction.Other;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MINHTHUAN
 */
public class Product extends javax.swing.JPanel {

    SachBus sachbus = new SachBus();
    TheLoaiBus tlbus = new TheLoaiBus();
    ArrayList<ChiTietHoaDon> cartData = new ArrayList<>();

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        initialization();
        loadContent();
        performEvent();
        performEventPro();
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
        search = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameCheck = new javax.swing.JCheckBox();
        bookType = new javax.swing.JComboBox<>();
        priceBigger = new javax.swing.JSlider();
        bookName = new javax.swing.JTextField();
        typeCheck = new javax.swing.JCheckBox();
        authorCheck = new javax.swing.JCheckBox();
        biggerValue = new javax.swing.JTextField();
        priceCheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceSmaller = new javax.swing.JSlider();
        bookAuthor = new javax.swing.JTextField();
        smallerValue = new javax.swing.JTextField();
        publisingCheck = new javax.swing.JCheckBox();
        bookNXB = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        doneSearch = new javax.swing.JButton();
        scrollContent = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TÌM KIẾM");

        nameCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameCheck.setText("Tìm theo tên");

        bookType.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        priceBigger.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        priceBigger.setMaximum(1000000);
        priceBigger.setMinimum(1000);

        bookName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        typeCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        typeCheck.setText("Tìm theo thể loại");

        authorCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        authorCheck.setText("Tìm theo tên tác giả");

        biggerValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        biggerValue.setText("1.000 VNĐ");
        biggerValue.setEnabled(false);

        priceCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        priceCheck.setText("Tìm theo giá tiền");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Lớn hơn");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Nhỏ hơn");

        priceSmaller.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        priceSmaller.setMaximum(1000000);
        priceSmaller.setMinimum(1000);

        bookAuthor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        smallerValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        smallerValue.setText("1.000 VNĐ");
        smallerValue.setEnabled(false);

        publisingCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        publisingCheck.setText("Tìm theo nhà xuất bản");

        bookNXB.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        findBtn.setBackground(new java.awt.Color(255, 255, 255));
        findBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        findBtn.setForeground(new java.awt.Color(0, 0, 255));
        findBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User/search_48px.png"))); // NOI18N
        findBtn.setText("Tìm");

        doneSearch.setBackground(new java.awt.Color(255, 255, 255));
        doneSearch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        doneSearch.setForeground(new java.awt.Color(0, 204, 51));
        doneSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User/checked_radio_button_48px.png"))); // NOI18N
        doneSearch.setText("Xong");

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(searchLayout.createSequentialGroup()
                                    .addComponent(nameCheck)
                                    .addGap(185, 185, 185))
                                .addGroup(searchLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeCheck)
                                        .addComponent(authorCheck)
                                        .addComponent(priceCheck))
                                    .addGap(117, 117, 117)))
                            .addGroup(searchLayout.createSequentialGroup()
                                .addComponent(publisingCheck)
                                .addGap(91, 91, 91)))
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookType, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(searchLayout.createSequentialGroup()
                                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(searchLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(priceBigger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(priceSmaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(biggerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(smallerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneSearch)
                .addGap(83, 83, 83)
                .addComponent(findBtn)
                .addGap(30, 30, 30))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCheck)
                    .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeCheck)
                    .addComponent(bookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorCheck)
                    .addComponent(bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(priceCheck)
                        .addGap(64, 64, 64)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publisingCheck)
                            .addComponent(bookNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(priceBigger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(priceSmaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(biggerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(smallerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findBtn)
                            .addComponent(doneSearch))
                        .addContainerGap())))
        );

        background.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1150, 480));

        scrollContent.setBackground(new java.awt.Color(255, 255, 255));
        background.add(scrollContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, 490));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh_64px.png"))); // NOI18N
        jButton2.setText("Xem tất cả");
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox authorCheck;
    private javax.swing.JPanel background;
    private javax.swing.JTextField biggerValue;
    private javax.swing.JTextField bookAuthor;
    private javax.swing.JTextField bookNXB;
    private javax.swing.JTextField bookName;
    private javax.swing.JComboBox<String> bookType;
    private javax.swing.JButton doneSearch;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox nameCheck;
    private javax.swing.JSlider priceBigger;
    private javax.swing.JCheckBox priceCheck;
    private javax.swing.JSlider priceSmaller;
    private javax.swing.JCheckBox publisingCheck;
    private javax.swing.JScrollPane scrollContent;
    private javax.swing.JPanel search;
    private javax.swing.JTextField smallerValue;
    private javax.swing.JCheckBox typeCheck;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        search.setVisible(false);
        loadNameType();
    }

    private void loadContent() {
        ArrayList<Sach> data = sachbus.getAllSachNotDuplicate();
        int col = 3;
        int row = data.size() % 3 == 0 ? data.size() / 3 : data.size() / 3 + 1;

        Container container = new Container();
        for (Sach s : data) {
            JPanel p = new ContentDetailBook(s);
            p.setSize(380, 545);
            p.setVisible(true);
            container.add(p);
        }
        container.setLayout(new GridLayout(row, col));
        scrollContent.getViewport().setView(container);
    }

    private void performEvent() {
        //Sự kiện thêm vào giỏ
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.valueOf(e.getActionCommand());
                if (value == 0) {
                    return;
                }
                addBookById(value);
                loadContent();
                performEvent();
            }
        };

        //Lấy sự kiện button của từng quyển sách
        Arrays.stream(scrollContent.getComponents()).forEach(c -> {
            if (c instanceof JViewport) {
                Arrays.stream(((JViewport) c).getComponents()).forEach(c1 -> {
                    if (c1 instanceof Container) {
                        Arrays.stream(((Container) c1).getComponents()).forEach(c2 -> {
                            if (c2 instanceof ContentDetailBook) {
                                Arrays.stream(((ContentDetailBook) c2).getComponents()).forEach(c3 -> {
                                    if (c3 instanceof JPanel) {
                                        Arrays.stream(((JPanel) c3).getComponents()).forEach(c4 -> {
                                            if (c4 instanceof JButton) {
                                                ((JButton) c4).addActionListener(ac);

                                                //Tìm cái mã sách
                                                Arrays.stream(((JPanel) c3).getComponents()).forEach(c5 -> {
                                                    if (c5 instanceof JLabel) {
                                                        String id = Other.convertTextToEnglish(((JLabel) c5).getText());
                                                        if (id.contains("masach")) {
                                                            ((JButton) c4).setActionCommand(String.valueOf(getidBookFromString(id)));
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
    
    
    private void performEvent(ArrayList<Sach> data) {
        //Sự kiện thêm vào giỏ
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.valueOf(e.getActionCommand());
                if (value == 0) {
                    return;
                }
                addBookById(value);
                loadContent(data);
                performEvent(data);
            }
        };

        //Lấy sự kiện button của từng quyển sách
        Arrays.stream(scrollContent.getComponents()).forEach(c -> {
            if (c instanceof JViewport) {
                Arrays.stream(((JViewport) c).getComponents()).forEach(c1 -> {
                    if (c1 instanceof Container) {
                        Arrays.stream(((Container) c1).getComponents()).forEach(c2 -> {
                            if (c2 instanceof ContentDetailBook) {
                                Arrays.stream(((ContentDetailBook) c2).getComponents()).forEach(c3 -> {
                                    if (c3 instanceof JPanel) {
                                        Arrays.stream(((JPanel) c3).getComponents()).forEach(c4 -> {
                                            if (c4 instanceof JButton) {
                                                ((JButton) c4).addActionListener(ac);

                                                //Tìm cái mã sách
                                                Arrays.stream(((JPanel) c3).getComponents()).forEach(c5 -> {
                                                    if (c5 instanceof JLabel) {
                                                        String id = Other.convertTextToEnglish(((JLabel) c5).getText());
                                                        if (id.contains("masach")) {
                                                            ((JButton) c4).setActionCommand(String.valueOf(getidBookFromString(id)));
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public ArrayList<ChiTietHoaDon> getCartData() {
        return cartData;
    }

    public void setCartData(ArrayList<ChiTietHoaDon> cartData) {
        this.cartData = cartData;
        loadContent();
        performEvent();
    }

    // Mã Sách : 11 -> 11
    public int getidBookFromString(String s) {
        s = s.replaceAll("\\s++", "");
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ':') {
            i--;
        }
        if (i < 0) {
            return 0;
        }
        try {
            return Integer.valueOf(s.substring(i + 1));

        } catch (Exception e) {
            return 0;
        }
    }

    private void addBookById(int id) {
        ChiTietHoaDon tmp = sachbus.addBookToCart(id);
        boolean OK = true;
        if (tmp == null) {
            JOptionPane.showMessageDialog(null, "Không thể thêm,không đủ số lượng");
            return;
        }
        for (ChiTietHoaDon ct : cartData) {
            if (ct.getMaSach() == tmp.getMaSach() && ct.getMaPhieuNhap() == tmp.getMaPhieuNhap()) {
                ct.setSoLuong(ct.getSoLuong() + 1);
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        cartData.add(tmp);
    }

    private void performEventPro() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Xem tất cả": {
                        loadContent();
                        JOptionPane.showMessageDialog(null, "Đã hiển thị tất cả sản phẩm");
                        break;
                    }
                    case "Tìm Kiếm": {
                        search.setVisible(true);
                        scrollContent.setVisible(false);
                        break;
                    }
                    case "Xong": {
                        search.setVisible(false);
                        scrollContent.setVisible(true);
                        break;
                    }
                    case "Tìm": {
                        findBook();
                        break;
                    }
                }
            }
        };
        Arrays.stream(this.background.getComponents()).forEach(c -> {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(ac);
                ((JButton) c).setActionCommand(((JButton) c).getActionCommand());
            }
        });

        doneSearch.addActionListener(ac);
        doneSearch.setActionCommand(doneSearch.getActionCommand());

        findBtn.addActionListener(ac);
        findBtn.setActionCommand(findBtn.getActionCommand());

        //Bắt onchange giá tiền cần tìm
        priceBigger.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                biggerValue.setText(Other.convetNumberToMoney(String.valueOf(priceBigger.getValue())) + "VNĐ");
            }
        });

        priceSmaller.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                smallerValue.setText(Other.convetNumberToMoney(String.valueOf(priceSmaller.getValue())) + "VNĐ");
            }
        });
    }

    private void findBook() {
        String name = "";
        String typeName = "";
        String authorName = "";
        int bigger = 0;
        int smaller = 0;
        String NXB = "";
        
        boolean OK = false;
        for(Component c : search.getComponents()){
            if(c instanceof JCheckBox && ((JCheckBox)c).isSelected()){
                OK = true;
                break;
            }
        }
        
        if(OK == false){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ít nhất 1 loại để tìm kiếm.");
            return;
        }

        if (nameCheck.isSelected()) {
            if (bookName.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sách cần tìm kiếm");
                return;
            }
            name = bookName.getText();
        }

        if (typeCheck.isSelected()) {
            typeName = String.valueOf(bookType.getSelectedItem());
        }

        if (authorCheck.isSelected()) {
            if (bookAuthor.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên tác giả cần tìm kiếm");
                return;
            }
            authorName = bookAuthor.getText();
        }

        if (priceCheck.isSelected()) {
            bigger = priceBigger.getValue();
            smaller = priceSmaller.getValue();
            if (smaller < bigger) {
                JOptionPane.showMessageDialog(null, "Khoảng cần tìm không hợp lệ [" + bigger + ";" + smaller + "]");
                bigger = 0;
                smaller = 0;
                return;
            }
        }

        if (publisingCheck.isSelected()) {
            if (bookNXB.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên NXB cần tìm kiếm");
                return;
            }
            NXB = bookNXB.getText();
        }
        
        /*System.out.println(name);
        System.out.println(typeName);
        System.out.println(authorName);
        System.out.println(NXB);*/
        
        ArrayList<Sach> data = sachbus.searchUser(name, typeName, authorName, bigger, smaller, NXB);
        
        if(loadContent(data) == false || data.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không thể tìm");
            return;
        }
        JOptionPane.showMessageDialog(null, "Tìm thành công");
        search.setVisible(false);
        scrollContent.setVisible(true);
        performEvent(data);
    }

    private void loadNameType() {
        ArrayList<TheLoai> data = tlbus.getAllType();
        bookType.removeAllItems();
        for (TheLoai tl : data) {
            bookType.addItem(tl.getTenTheLoai());
        }
    }
    
    public boolean loadContent(ArrayList<Sach> data){
        //Load Data
        int col = 3;
        int row = data.size() % 3 == 0 ? data.size() / 3 : data.size() / 3 + 1;

        Container container = new Container();
        for (Sach s : data) {
            JPanel p = new ContentDetailBook(s);
            p.setSize(380, 545);
            p.setVisible(true);
            container.add(p);
        }
        container.setLayout(new GridLayout(row, col));
        scrollContent.getViewport().setView(container);
        return true;
    }
}