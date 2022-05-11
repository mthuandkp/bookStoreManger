/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

import BUS.KhachHangBus;
import BUS.KhuyenMaiBus;
import BUS.NhaCungCapBus;
import BUS.NhanVienBus;
import BUS.SachBus;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.KhuyenMai;
import DTO.NhaCungCap;
import DTO.NhanVien;
import DTO.PhieuNhap;
import DTO.Sach;
import com.mysql.cj.result.Row;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.tools.Diagnostic;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

/**
 *
 * @author MINHTHUAN
 */
public class WriteExcel {

    FileDialog fd = new FileDialog(new JFrame(), "Xuất excel", FileDialog.SAVE);

    SachBus sachbus = new SachBus();
    NhaCungCapBus nccbus = new NhaCungCapBus();
    KhuyenMaiBus kmbus = new KhuyenMaiBus();
    NhanVienBus nvbus = new NhanVienBus();
    KhachHangBus khbus = new KhachHangBus();

    private String getFile() {
        fd.setFile("untitled.xls");
        fd.setVisible(true);
        String url = fd.getDirectory() + fd.getFile();
        if (url.equals("null")) {
            return null;
        }
        return url;
    }

    public void WriteBook() {
        fd.setTitle("Xuất dữ liệu nhà cung cấp ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Nhà cung cấp");

            ArrayList<Sach> data = sachbus.getAllData();
            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);

            row.createCell(0, CellType.NUMERIC).setCellValue("STT");
            row.createCell(1, CellType.STRING).setCellValue("Tên Sách");
            row.createCell(2, CellType.STRING).setCellValue("Giá");
            row.createCell(3, CellType.STRING).setCellValue("Số Lượng");
            row.createCell(4, CellType.STRING).setCellValue("Nhà Xuất Bản");
            row.createCell(5, CellType.STRING).setCellValue("Mã Thể Loại");
            row.createCell(6, CellType.STRING).setCellValue("Trạng Thái");
            row.createCell(7, CellType.STRING).setCellValue("% Giảm");
            row.createCell(8, CellType.STRING).setCellValue("Mã Phiếu Nhập");

            for (Sach s : data) {
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(s.getMaSach());
                row.createCell(1, CellType.STRING).setCellValue(s.getTenSach());
                row.createCell(2, CellType.STRING).setCellValue(s.getGia());
                row.createCell(3, CellType.STRING).setCellValue(s.getSoLuong());
                row.createCell(4, CellType.STRING).setCellValue(s.getNhaXuatBan());
                row.createCell(5, CellType.STRING).setCellValue(s.getMaTheLoai());
                row.createCell(6, CellType.STRING).setCellValue(s.isTrangThai());
                row.createCell(7, CellType.STRING).setCellValue(s.getPhanTramGiamGia());
                row.createCell(8, CellType.STRING).setCellValue(s.getMaPhieuNhap());
            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteReceipt(PhieuNhap pn, ArrayList<ChiTietPhieuNhap> data) {
        fd.setTitle("Xuất dữ liệu phiếu nhập ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Nhà cung cấp");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã PN");
            row.createCell(1, CellType.NUMERIC).setCellValue("Mã Nhân Viên");
            row.createCell(2, CellType.NUMERIC).setCellValue("Mã Nhà Cung Cấp");
            row.createCell(3, CellType.STRING).setCellValue("Ngày Nhập");
            row.createCell(4, CellType.STRING).setCellValue("Giờ Nhập");
            rowNum++;
            row = sheet.createRow(rowNum);
            row.createCell(0, CellType.NUMERIC).setCellValue(pn.getMaPhieuNhap());
            row.createCell(1, CellType.NUMERIC).setCellValue(pn.getMaNhanVien());
            row.createCell(2, CellType.NUMERIC).setCellValue(pn.getMaNhaCungCap());
            row.createCell(3, CellType.STRING).setCellValue(pn.getNgayNhap().toString());
            row.createCell(4, CellType.STRING).setCellValue(pn.getGioNhap().toString());
            rowNum++;
            row = sheet.createRow(rowNum);
            //Ghi CTPN

            row.createCell(0, CellType.NUMERIC).setCellValue("Mã Phiếu Nhập");
            row.createCell(1, CellType.NUMERIC).setCellValue("Mã Sách");
            row.createCell(2, CellType.NUMERIC).setCellValue("Số Lượng");
            row.createCell(3, CellType.NUMERIC).setCellValue("Giá");
            row.createCell(4, CellType.NUMERIC).setCellValue("Hình Ảnh");

            for (ChiTietPhieuNhap ct : data) {
                if (ct.getMaPhieuNhap() != pn.getMaPhieuNhap()) {
                    continue;
                }
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(ct.getMaPhieuNhap());
                row.createCell(1, CellType.NUMERIC).setCellValue(ct.getMaSach());
                row.createCell(2, CellType.NUMERIC).setCellValue(ct.getSoLuong());
                row.createCell(3, CellType.NUMERIC).setCellValue(ct.getGia());
                row.createCell(4, CellType.NUMERIC).setCellValue(ct.getHinhAnh());
            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteBill(HoaDon hd, ArrayList<ChiTietHoaDon> data) {
        fd.setTitle("Xuất dữ liệu hóa đơn ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Hóa Đơn");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã HD");
            row.createCell(1, CellType.NUMERIC).setCellValue("Mã Nhân Viên");
            row.createCell(2, CellType.NUMERIC).setCellValue("Mã KH");
            row.createCell(3, CellType.NUMERIC).setCellValue("Mã KM");
            row.createCell(4, CellType.STRING).setCellValue("Ngày Nhập");
            row.createCell(5, CellType.STRING).setCellValue("Giờ Nhập");
            row.createCell(6, CellType.STRING).setCellValue("Trạng thái");
            rowNum++;
            row = sheet.createRow(rowNum);
            row.createCell(0, CellType.NUMERIC).setCellValue(hd.getMaHoaDon());
            row.createCell(1, CellType.NUMERIC).setCellValue(hd.getMaNhanVien());
            row.createCell(2, CellType.NUMERIC).setCellValue(hd.getMaKhachHang());
            row.createCell(3, CellType.NUMERIC).setCellValue(hd.getMaKhuyenMai());
            row.createCell(4, CellType.STRING).setCellValue(hd.getNgayLap().toString());
            row.createCell(5, CellType.STRING).setCellValue(hd.getGioLap().toString());
            String trangthai = "";
            switch (hd.getTrangThai()) {
                case 0: {
                    trangthai = "Chờ xác nhận";
                }
                case 1: {
                    trangthai = "Đã xác nhận";
                }
                case 2: {
                    trangthai = "Đã nhận";
                }
            }
            row.createCell(6, CellType.STRING).setCellValue(trangthai);
            rowNum++;
            row = sheet.createRow(rowNum);
            //Ghi CTPN

            row.createCell(0, CellType.NUMERIC).setCellValue("Mã Sách");
            row.createCell(1, CellType.NUMERIC).setCellValue("Số Lượng");

            for (ChiTietHoaDon ct : data) {
                if (ct.getMaHoaDon() != hd.getMaHoaDon()) {
                    continue;
                }
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(ct.getMaSach());
                row.createCell(1, CellType.NUMERIC).setCellValue(ct.getSoLuong());

            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeSupplier() {
        fd.setTitle("Xuất dữ liệu NCC ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        ArrayList<NhaCungCap> data = nccbus.getAllData();
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Hóa Đơn");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã NCC");
            row.createCell(1, CellType.NUMERIC).setCellValue("Tên NCC");
            row.createCell(2, CellType.NUMERIC).setCellValue("SĐT");
            row.createCell(3, CellType.NUMERIC).setCellValue("Địa Chỉ");
            row.createCell(4, CellType.STRING).setCellValue("Trạng Thái");

            for (NhaCungCap ncc : data) {
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(ncc.getMaNhaCungCap());
                row.createCell(1, CellType.STRING).setCellValue(ncc.getTenNhaCungCap());
                row.createCell(2, CellType.STRING).setCellValue(ncc.getSDT());
                row.createCell(3, CellType.STRING).setCellValue(ncc.getDiaChi());
                row.createCell(4, CellType.BOOLEAN).setCellValue(ncc.isTrangThai());

            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeSale() {
        fd.setTitle("Xuất dữ liệu khuyến mãi ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        ArrayList<KhuyenMai> data = kmbus.getAllData();
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("khuyenmai");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã KM");
            row.createCell(1, CellType.STRING).setCellValue("Ngày KM");
            row.createCell(2, CellType.NUMERIC).setCellValue("% Giảm");

            for (KhuyenMai km : data) {
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(km.getMaKhuyenMai());
                row.createCell(1, CellType.STRING).setCellValue(km.getNgayApDung().toString());
                row.createCell(2, CellType.NUMERIC).setCellValue(km.getPhanTramGiam());
            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeStaff() {
        fd.setTitle("Xuất dữ liệu nhân viên ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        ArrayList<NhanVien> data = nvbus.getAllData();
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("nhanvien");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã NV");
            row.createCell(1, CellType.STRING).setCellValue("Tên NV");
            row.createCell(2, CellType.STRING).setCellValue("Ngày sinh");
            row.createCell(3, CellType.BOOLEAN).setCellValue("Giới tính");
            row.createCell(4, CellType.STRING).setCellValue("SĐT");
            row.createCell(5, CellType.STRING).setCellValue("Địa chỉ");
            row.createCell(6, CellType.NUMERIC).setCellValue("Mã quyền");
            row.createCell(7, CellType.STRING).setCellValue("Tên đăng nhập");
            row.createCell(8, CellType.STRING).setCellValue("Mật khẩu");
            row.createCell(9, CellType.BOOLEAN).setCellValue("Trạng thái");

            for (NhanVien nv : data) {
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(nv.getMaNhanVien());
                row.createCell(1, CellType.STRING).setCellValue(nv.getTenNhanVien());
                row.createCell(2, CellType.STRING).setCellValue(nv.getNgaySinh().toString());
                row.createCell(3, CellType.BOOLEAN).setCellValue(nv.isGioiTinh());
                row.createCell(4, CellType.STRING).setCellValue(nv.getSDT());
                row.createCell(5, CellType.STRING).setCellValue(nv.getDiaChi());
                row.createCell(6, CellType.NUMERIC).setCellValue(nv.getMaQuyen());
                row.createCell(7, CellType.STRING).setCellValue(nv.getTenDangNhap());
                row.createCell(8, CellType.STRING).setCellValue(nv.getMatKhau());
                row.createCell(9, CellType.BOOLEAN).setCellValue(nv.isTrangThai());
            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeCustomer() {
        fd.setTitle("Xuất dữ liệu khách hàng ra excel");
        String url = getFile();

        if (url == null) {
            return;
        }

        FileOutputStream outFile = null;
        ArrayList<KhachHang> data = khbus.getAllData();
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("khachhang");

            int rowNum = 0;
            HSSFRow row = sheet.createRow(rowNum);
            //Ghi Phieu Nhap
            row.createCell(0, CellType.NUMERIC).setCellValue("Mã KH");
            row.createCell(1, CellType.STRING).setCellValue("Tên KH");
            row.createCell(2, CellType.STRING).setCellValue("Ngày sinh");
            row.createCell(3, CellType.STRING).setCellValue("Địa Chỉ");
            row.createCell(4, CellType.STRING).setCellValue("SĐT");
            row.createCell(5, CellType.BOOLEAN).setCellValue("Trạng Thái");

            for (KhachHang kh : data) {
                rowNum++;
                row = sheet.createRow(rowNum);
                row.createCell(0, CellType.NUMERIC).setCellValue(kh.getMaKhachHang());
                row.createCell(1, CellType.STRING).setCellValue(kh.getTenKhachHang());
                row.createCell(2, CellType.STRING).setCellValue(kh.getNgaySinh().toString());
                row.createCell(3, CellType.STRING).setCellValue(kh.getDiaChi());
                row.createCell(4, CellType.STRING).setCellValue(kh.getSDT());
                row.createCell(5, CellType.BOOLEAN).setCellValue(kh.isTrangThai());
            }

            for (int i = 0; i < rowNum; i++) {
                sheet.autoSizeColumn(i);
            }

            File file = new File(url);
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + file.getAbsolutePath());
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (outFile != null) {
                outFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
