/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.QLSach;

import BUS.SachBus;
import BUS.TheLoaiBus;
import DTO.NhanVien;
import DTO.Sach;
import ProcessingFunction.WriteExcel;
import Test.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author MINHTHUAN
 */
public class QuanLySach extends javax.swing.JPanel {
    NhanVien nv = null;
    /**
     * Creates new form DefaultPanel
     */
    SachBus sachbus = new SachBus();
    TheLoaiBus theloaibus = new TheLoaiBus();

    public QuanLySach() {
        initComponents();
        initialization();
        performEvent();
    }
    
    public QuanLySach(NhanVien nhanvien) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        headControlPanel = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        exportPdfBtn = new javax.swing.JButton();
        bottomControlPanel = new javax.swing.JPanel();
        statisticalBtn = new javax.swing.JButton();
        exportExcelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 660));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1050, 380));

        headControlPanel.setBackground(new java.awt.Color(255, 255, 255));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editBtn.setForeground(new java.awt.Color(153, 0, 255));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit_48px.png"))); // NOI18N
        editBtn.setText("Sửa");
        editBtn.setBorder(null);

        editBtn1.setBackground(new java.awt.Color(255, 255, 255));
        editBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editBtn1.setForeground(new java.awt.Color(153, 0, 255));
        editBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh_64px.png"))); // NOI18N
        editBtn1.setText("Cập nhật");
        editBtn1.setBorder(null);

        searchInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        searchInput.setForeground(new java.awt.Color(26, 199, 195));

        exportPdfBtn.setBackground(new java.awt.Color(255, 255, 255));
        exportPdfBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exportPdfBtn.setForeground(new java.awt.Color(153, 0, 255));
        exportPdfBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_50px.png"))); // NOI18N
        exportPdfBtn.setText("Tìm Kiếm");
        exportPdfBtn.setBorder(null);

        javax.swing.GroupLayout headControlPanelLayout = new javax.swing.GroupLayout(headControlPanel);
        headControlPanel.setLayout(headControlPanelLayout);
        headControlPanelLayout.setHorizontalGroup(
            headControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headControlPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(exportPdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        headControlPanelLayout.setVerticalGroup(
            headControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(editBtn1)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPdfBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(headControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1120, -1));

        bottomControlPanel.setBackground(new java.awt.Color(255, 255, 255));

        statisticalBtn.setBackground(new java.awt.Color(255, 255, 255));
        statisticalBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        statisticalBtn.setForeground(new java.awt.Color(153, 0, 255));
        statisticalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/area_chart_48px.png"))); // NOI18N
        statisticalBtn.setText("Thống kê");
        statisticalBtn.setBorder(null);

        exportExcelBtn.setBackground(new java.awt.Color(255, 255, 255));
        exportExcelBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exportExcelBtn.setForeground(new java.awt.Color(153, 0, 255));
        exportExcelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/export_csv_60px.png"))); // NOI18N
        exportExcelBtn.setText("Xuất Excel");
        exportExcelBtn.setBorder(null);

        javax.swing.GroupLayout bottomControlPanelLayout = new javax.swing.GroupLayout(bottomControlPanel);
        bottomControlPanel.setLayout(bottomControlPanelLayout);
        bottomControlPanelLayout.setHorizontalGroup(
            bottomControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomControlPanelLayout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(statisticalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exportExcelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        bottomControlPanelLayout.setVerticalGroup(
            bottomControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportExcelBtn)
                    .addComponent(statisticalBtn))
                .addGap(16, 16, 16))
        );

        add(bottomControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1120, 70));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Quản Lý Sách");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 310, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Tìm theo tên");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomControlPanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton exportExcelBtn;
    private javax.swing.JButton exportPdfBtn;
    private javax.swing.JPanel headControlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton statisticalBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void initialization() {
        //Define size for JPanel
        this.setSize(1120, 660);
        //Edit search textfield
        searchInput.setBackground(new Color(0, 0, 0, 0));
        searchInput.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(26, 199, 195)));
        searchInput.requestFocus();

        initTable();
        loadTableData();
    }

    private void initTable() {
        String[] header = {"Id", "Mã PN", "Tên Sách", "Giá", "Số Lượng", "NXB", "Loại", "Trạng Thái", "Hình Ảnh", "% Giảm","Tác Giả"};
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();

        Arrays.stream(header).forEach(s -> {
            defaults.addColumn(s);
        });

        table.setRowHeight(25);
        //https://www.tutorialspoint.com/how-to-change-each-column-width-of-a-jtable-in-java#:~:text=By%20default%20the%20width%20of,()%20method%20of%20JTable%20class.

        table.getColumnModel().getColumn(0).setPreferredWidth(15);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(15);
        table.getColumnModel().getColumn(8).setPreferredWidth(15);
    }

    private void performEvent() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Sửa": {
                        if(nv == null || nv.getMaQuyen() != 1){
                            JOptionPane.showMessageDialog(null, "Bạn không đủ quyền để sử dụng chức năng này");
                            return;
                        }
                        new SuaSach().setVisible(true);
                        break;
                    }
                    case "Tìm Kiếm": {
                        new TimKiem().setVisible(true);
                        break;
                    }
                    case "Thống kê": {
                        new ThongKe().setVisible(true);
                        break;
                    }
                    case "Xuất Excel": {
                        WriteExcel write = new WriteExcel();
                        write.WriteBook();
                        break;
                    }
                    case "Cập nhật": {
                        removeAllTable();
                        loadTableData();
                        JOptionPane.showMessageDialog(null, "Đã cập nhật lại bảng");
                        searchInput.setText("");
                        break;
                    }
                }
            }
        };
        Arrays.stream(headControlPanel.getComponents()).forEach(c -> {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(ac);
                ((JButton) c).setActionCommand(((JButton) c).getActionCommand());
            }
        });
        Arrays.stream(bottomControlPanel.getComponents()).forEach(c -> {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(ac);
                ((JButton) c).setActionCommand(((JButton) c).getActionCommand());
            }
        });

        searchInput.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                removeAllTable();
                ArrayList<Sach> data = sachbus.getAllDataByName(searchInput.getText());
                DefaultTableModel defaults = (DefaultTableModel) table.getModel();
                for (Sach s : data) {
                    if(s.getSoLuong() == 0) continue;
                    Object[] obj = new Object[11];
                    obj[0] = s.getMaSach();
                    obj[1] = s.getMaPhieuNhap();
                    obj[2] = s.getTenSach();
                    obj[3] = s.getGia();
                    obj[4] = s.getSoLuong();
                    obj[5] = s.getNhaXuatBan();
                    obj[6] = s.getMaTheLoai();
                    obj[7] = String.valueOf(s.isTrangThai());
                    obj[8] = s.getHinhAnh();
                    obj[9] = s.getPhanTramGiamGia();
                    obj[10] = s.getTacGia();
                    defaults.addRow(obj);
                }
            }
        });
    }

    private void loadTableData() {
        ArrayList<Sach> data = sachbus.getAllData();
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        
        for (Sach s : data) {
            Object[] obj = new Object[11];
            obj[0] = s.getMaSach();
            obj[1] = s.getMaPhieuNhap();
            obj[2] = s.getTenSach();
            obj[3] = s.getGia();
            obj[4] = s.getSoLuong();
            obj[5] = s.getNhaXuatBan();
            obj[6] = theloaibus.getNameTypeById(s.getMaTheLoai());
            obj[7] = String.valueOf(s.isTrangThai());
            obj[8] = s.getHinhAnh();
            obj[9] = s.getPhanTramGiamGia();
            obj[10] = s.getTacGia();
            defaults.addRow(obj);
        }
    }

    public void removeAllTable() {
        DefaultTableModel defaults = (DefaultTableModel) table.getModel();
        for (int i = defaults.getRowCount() - 1; i >= 0; i--) {
            defaults.removeRow(i);
        }
    }
}
