/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

import BUS.ChiTietHoaDonBus;
import BUS.ChiTietPhieuNhapBus;
import BUS.HoaDonBus;
import BUS.KhachHangBus;
import BUS.KhuyenMaiBus;
import BUS.NhaCungCapBus;
import BUS.NhanVienBus;
import BUS.PhieuNhapBus;
import BUS.SachBus;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import DTO.HoaDon;
import DTO.PhieuNhap;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import static com.itextpdf.text.pdf.PdfDictionary.FONT;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author MINHTHUAN
 */
public class WritePdf {
    
    FileDialog fd = new FileDialog(new JFrame(), "Xuất excel", FileDialog.SAVE);
    PhieuNhapBus pnbus = new PhieuNhapBus();
    ChiTietPhieuNhapBus ctpnbus = new ChiTietPhieuNhapBus();
    NhanVienBus nvbus = new NhanVienBus();
    NhaCungCapBus nccbus = new NhaCungCapBus();
    SachBus sachbus = new SachBus();
    KhachHangBus khbus = new KhachHangBus();
    KhuyenMaiBus kmbus = new KhuyenMaiBus();
    
    HoaDonBus hdbus = new HoaDonBus();
    ChiTietHoaDonBus cthdbus = new ChiTietHoaDonBus();
    
    private String getFile() {
        fd.setFile("untitled.pdf");
        fd.setVisible(true);
        String url = fd.getDirectory() + fd.getFile();
        if (url.equals("nullnull")) {
            return null;
        }
        return url;
    }
    
    public WritePdf() {
        String url = "C:\\Users\\MINHTHUAN\\Documents\\NetBeansProjects\\DoAnCuaHangSach\\src\\TmpData\\test.pdf";
        Document document = new Document();
        try {
            PdfWriter write = PdfWriter.getInstance(document, new FileOutputStream(new File(url)));
            document.open();
            Paragraph phr = new Paragraph("Hello world this is a test pdf file");
            document.add(phr);
            /*PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(105);
            table.setSpacingBefore(52f);
            table.setSpacingAfter(12f);
            
            float colWidth[] = {1f,1f,1f};
            table.setWidths(colWidth);
            
            PdfPCell c1 = new PdfPCell(new Paragraph("Dong 1"));
            PdfPCell c2 = new PdfPCell(new Paragraph("Dong 2"));
            PdfPCell c3 = new PdfPCell(new Paragraph("Dong 3"));
            
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);
             
            document.add(table);*/
            
            document.close();
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void writeRecept(int id){
        // DATA
        PhieuNhap pn = pnbus.getDataById(id);
        ArrayList<ChiTietPhieuNhap> data = ctpnbus.getDataById(id);
        String nameStaff = nvbus.getNameById(pn.getMaNhanVien());
        String nameSupplier = nccbus.getNameById(pn.getMaNhaCungCap());
        //---------------------------------------------------//
        String url = "C:\\Users\\MINHTHUAN\\Documents\\NetBeansProjects\\DoAnCuaHangSach\\src\\TmpData\\test.pdf";
        Document document = null;
        
        try {
            /*url = getFile();
            if(url == null){
                return;
            }*/
            document = new Document();
            BaseFont bf = BaseFont.createFont("C:\\Windows\\Fonts\\times.ttf",BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(url)));
            document.open();
            //Ghi thong tin phieu nhap [MaPhieuNhap ,Ten NhanVien,Ten NhaCungCap,Ngaya,Gio]
            document.add(new Paragraph("PHIẾU NHẬP",new Font(bf)));
            document.add(new Paragraph("Mã Phiếu Nhập : " + pn.getMaPhieuNhap(),new Font(bf)));
            document.add(new Paragraph("Tên Nhân Viên : [" + pn.getMaNhanVien() + "] " + nameStaff,new Font(bf)));
            document.add(new Paragraph("Tên Nhà Cung Cấp : [" + pn.getMaNhaCungCap() + "] " + nameSupplier,new Font(bf)));
            document.add(new Paragraph("",new Font(bf)));
            document.add(new Paragraph("",new Font(bf)));
            
            //Ghi chi tiet phieu nhap
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(105);
            table.setSpacingBefore(52f);
            table.setSpacingAfter(12f);
            
            float colWidth[] = {1f,5f,1f,1f,1f};
            table.setWidths(colWidth);
            
            //Ghi tieu de
            table.addCell(new PdfPCell(new Paragraph("Mã Sách",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Tên Sách",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Giá",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Số Lượng",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Hình Ảnh",new Font(bf))));
            
            //Ghi tung chi tiet vao table
            int sum = 0;
            for(ChiTietPhieuNhap ctpn : data){
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(ctpn.getMaSach()),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(sachbus.getNameById(ctpn.getMaSach())),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(ProcessingFunction.Other.convetNumberToMoney(String.valueOf(ctpn.getGia())),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(ctpn.getSoLuong()),new Font(bf))));
                table.addCell(new PdfPCell(Image.getInstance(".\\src\\Book_Image\\" + ctpn.getHinhAnh())));
                sum += ctpn.getGia() * ctpn.getSoLuong();
            }
            
            document.add(table);
            document.add(new Paragraph("Tổng giá nhập :" + ProcessingFunction.Other.convetNumberToMoney(String.valueOf(sum)),new Font(bf)));
            document.close();
            writer.close();
            JOptionPane.showMessageDialog(null, "Ghi thành công");
        } catch (Exception e) {
        }
        
        
    }
    
    
    public void writeBill(int id){
        // DATA
        HoaDon hd = hdbus.getBillById(id);
        ArrayList<ChiTietHoaDon> data = cthdbus.getDataById(id);
        String nameStaff = nvbus.getNameById(hd.getMaNhanVien());
        String nameCus = khbus.getNameById(hd.getMaKhachHang());
        String trangthai = "";
        switch(hd.getTrangThai()){
            case 0:{
                trangthai = "Chưa xử lý";
                break;
            }
            case 1:{
                trangthai = "Đã xử lý";
                break;
            }
            case 2:{
                trangthai = "Đã nhận";
                break;
            }
        }
        //---------------------------------------------------//
        String url = "C:\\Users\\MINHTHUAN\\Documents\\NetBeansProjects\\DoAnCuaHangSach\\src\\TmpData\\hoadon.pdf";
        Document document = null;
        
        try {
            
            document = new Document();
            BaseFont bf = BaseFont.createFont("C:\\Windows\\Fonts\\times.ttf",BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(url)));
            document.open();
            //Ghi thong tin phieu nhap [Mahoadon,tennhanvien,tenkhachhang,makhuyenmai,ngày,gio,trangthai]
            document.add(new Paragraph("HÓA ĐƠN",new Font(bf)));
            document.add(new Paragraph("Mã Hóa Đơn : " + hd.getMaHoaDon(),new Font(bf)));
            document.add(new Paragraph("Tên Nhân Viên : [" + hd.getMaNhanVien() + "] " + nameStaff,new Font(bf)));
            document.add(new Paragraph("Tên Khách Hàng : [" + hd.getMaKhachHang() + "] " + nameCus,new Font(bf)));
            document.add(new Paragraph("Mã khuyến mãi : [" + hd.getMaKhuyenMai() + "] " + kmbus.getNameById(hd.getMaKhuyenMai()),new Font(bf)));
            document.add(new Paragraph("Trạng thái : " + trangthai,new Font(bf)));
            document.add(new Paragraph("Thời gian : " + hd.getNgayLap().toString() + "    " + hd.getGioLap().toString(),new Font(bf)));
            
            //Ghi chi tiet phieu nhap
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(105);
            table.setSpacingBefore(52f);
            table.setSpacingAfter(12f);
            
            float colWidth[] = {1f,5f,1f,1f,1f};
            table.setWidths(colWidth);
            
            //Ghi tieu de
            table.addCell(new PdfPCell(new Paragraph("Mã Sách",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Tên Sách",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Giá",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Số Lượng",new Font(bf))));
            table.addCell(new PdfPCell(new Paragraph("Hình Ảnh",new Font(bf))));
            
            //Ghi tung chi tiet vao table
            int sum = 0;
            for(ChiTietHoaDon ctpn : data){
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(ctpn.getMaSach()),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(sachbus.getNameById(ctpn.getMaSach())),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(ProcessingFunction.Other.convetNumberToMoney(String.valueOf(sachbus.getPriceBookFromId(ctpn.getMaSach()))),new Font(bf))));
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(ctpn.getSoLuong()),new Font(bf))));
                table.addCell(new PdfPCell(Image.getInstance(".\\src\\Book_Image\\" + sachbus.getImageById(ctpn.getMaSach()))));
                sum += sachbus.getPriceBookFromId(ctpn.getMaSach()) * ctpn.getSoLuong();
            }
            
            sum = (int)(sum*(1-kmbus.getDecreaseById(hd.getMaKhuyenMai())/100.0));
            document.add(table);
            document.add(new Paragraph("Tổng giá nhập :" + ProcessingFunction.Other.convetNumberToMoney(String.valueOf(sum)),new Font(bf)));
            document.close();
            writer.close();
            JOptionPane.showMessageDialog(null, "Ghi thành công");
        } catch (Exception e) {
            
        }
        
        
    }
    
    public static void main(String[] args) {
        WritePdf write = new WritePdf();
        write.writeRecept(2);
    }
}
