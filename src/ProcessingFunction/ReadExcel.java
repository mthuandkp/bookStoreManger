/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

import BUS.ChiTietPhieuNhapBus;
import BUS.KhuyenMaiBus;
import BUS.NhaCungCapBus;
import BUS.NhanVienBus;
import BUS.PhieuNhapBus;
import DTO.ChiTietPhieuNhap;
import DTO.KhuyenMai;
import DTO.NhaCungCap;
import DTO.NhanVien;
import DTO.PhieuNhap;
import com.mysql.cj.result.Row;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.util.converter.LocalDateStringConverter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author MINHTHUAN
 */
public class ReadExcel {

    FileDialog fd = new FileDialog(new JFrame(), "Đọc excel", FileDialog.LOAD);
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    PhieuNhapBus pnbus = new PhieuNhapBus();
    ChiTietPhieuNhapBus ctpnbus = new ChiTietPhieuNhapBus();
    NhaCungCapBus nccbus = new NhaCungCapBus();
    KhuyenMaiBus kmbus = new KhuyenMaiBus();
    NhanVienBus nvbus = new NhanVienBus();

    private String getFile() {
        fd.setFile("*.xls");
        fd.setVisible(true);
        String url = fd.getDirectory() + fd.getFile();
        if (url.equals("nullnull")) {
            return null;
        }
        return url;
    }

    public void ReadExcelReceipt() {
        PhieuNhap newPN = null;
        ArrayList<ChiTietPhieuNhap> data = new ArrayList<>();

        fd.setTitle("Nhập dữ liệu Phiếu nhập từ excel");
        String url = getFile();
        if (url == null) {
            return;
        }
        FileInputStream inputStream = null;
        try {
            Workbook workbook = WorkbookFactory.create(new File(url));
            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.rowIterator();

            //Bỏ dòng đầu
            //Đoc Phieu Nhap
            org.apache.poi.ss.usermodel.Row row = rowIterator.next();
            row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            if (row.getLastCellNum() != 5) {
                JOptionPane.showMessageDialog(null, "File không hợp lệ");
                return;
            }

            Object[] obj = new Object[5];
            int index = 0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                obj[index++] = cellValue;
            }

            newPN = new PhieuNhap(
                    Integer.valueOf(String.valueOf(obj[0])),
                    Integer.valueOf(String.valueOf(obj[1])),
                    Integer.valueOf(String.valueOf(obj[2])),
                    LocalDate.parse(String.valueOf(obj[3]), dtf),
                    LocalTime.parse(String.valueOf(obj[4]))
            );

            /*==================================== ĐỌC CHI TIẾT=================================================*/
            row = rowIterator.next();
            while (rowIterator.hasNext()) {
                row = rowIterator.next();

                // Now let's iterate over the columns of the current row
                cellIterator = row.cellIterator();
                if (row.getLastCellNum() != 5) {
                    JOptionPane.showMessageDialog(null, "File không hợp lệ");
                    return;
                }
                Object[] objData = new Object[5];
                index = 0;
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String cellValue = dataFormatter.formatCellValue(cell);
                    objData[index++] = cellValue;
                }
                data.add(new ChiTietPhieuNhap(
                        Integer.valueOf(String.valueOf(objData[0])),
                        Integer.valueOf(String.valueOf(objData[1])),
                        Integer.valueOf(String.valueOf(objData[2])),
                        Integer.valueOf(String.valueOf(objData[3])),
                        String.valueOf(objData[4])
                ));

            }

            newPN.setMaPhieuNhap(pnbus.createAutoId());
            if (pnbus.insertPhieuNhap(newPN) == false) {
                JOptionPane.showMessageDialog(null, "Không thể chèn phiếu nhập !!!");
                return;
            }

            if (ctpnbus.insertArray(newPN.getMaPhieuNhap(), data) == false) {
                JOptionPane.showMessageDialog(null, "Không thể chèn phiếu nhập !!!");
                return;
            }
            JOptionPane.showMessageDialog(null, "Chèn Phiếu Nhập thành công");
            workbook.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void readExcelSupplier(){
        int countadd = 0;
        int countOverride = 0;
        int countCancel = 0;
        int countError = 0;
        ArrayList<NhaCungCap> data = nccbus.getAllData();
        ArrayList<NhaCungCap> readExcel = new ArrayList<>();
        
        fd.setTitle("Nhập dữ liệu Phiếu nhập từ excel");
        String url = getFile();
        if (url == null) {
            return;
        }
        FileInputStream inputStream = null;
        try {
            Workbook workbook = WorkbookFactory.create(new File(url));
            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.rowIterator();
            rowIterator.next();
            
            //Doc thong tin 1 nha cung cap
            while(rowIterator.hasNext()){
                Object []obj = new Object[5];
                int index = 0;
                org.apache.poi.ss.usermodel.Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    String value = dataFormatter.formatCellValue(cell);
                    obj[index++] = value;
                }
                //Ghi du lieu vao mot nha cung cap
                try {
                    NhaCungCap tmp = new NhaCungCap(
                            Integer.valueOf(String.valueOf(obj[0])),
                            String.valueOf(obj[1]),
                            String.valueOf(obj[2]),
                            String.valueOf(obj[3]),
                            Boolean.valueOf(String.valueOf(obj[4]))
                    );
                    
                    if(nccbus.isExist(tmp.getMaNhaCungCap()) == false){
                        countadd++;
                        boolean OK = nccbus.insertNCC(tmp);
                        continue;
                    }
                    if(JOptionPane.showConfirmDialog(null,"Nhà cung cấp đã tồn tại. Bạn có muốn ghi đè nhà cung cấp này không ?" + tmp,"",0) == 0){
                        countOverride++;
                        nccbus.updateNCC(tmp);
                        continue;
                    }
                    countCancel++;
                            
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Không thể đọc hàng này");
                    countError++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đọc từ file");
        }
        String dialog = "Đã thêm mới " + countadd;
        dialog += "\nĐã ghi đè " + countOverride;
        dialog += "\nĐã bỏ qua " + countCancel;
        dialog += "\nLỗi " + countError;
        JOptionPane.showMessageDialog(null, dialog);
    }
    
    public void readExcelSale(){
        int countadd = 0;
        int countOverride = 0;
        int countCancel = 0;
        int countError = 0;
        ArrayList<KhuyenMai> data = kmbus.getAllData();
        ArrayList<KhuyenMai> readExcel = new ArrayList<>();
        
        fd.setTitle("Nhập dữ liệu Khuyến mãi từ excel");
        String url = getFile();
        if (url == null) {
            return;
        }
        FileInputStream inputStream = null;
        try {
            Workbook workbook = WorkbookFactory.create(new File(url));
            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.rowIterator();
            rowIterator.next();
            
            //Doc thong tin 1 khuyen mai
            while(rowIterator.hasNext()){
                Object []obj = new Object[3];
                int index = 0;
                org.apache.poi.ss.usermodel.Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    String value = dataFormatter.formatCellValue(cell);
                    obj[index++] = value;
                }
                
                //Ghi du lieu vao mot khuyenmai
                try {
                    KhuyenMai km = new KhuyenMai(
                            Integer.valueOf(String.valueOf(obj[0])),
                            LocalDate.parse(String.valueOf(obj[1]),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                            Integer.valueOf(String.valueOf(obj[2]))
                    );
                    
                    if(kmbus.isExistKM(km.getMaKhuyenMai()) == false){
                        countadd++;
                        boolean OK = kmbus.addKM(km);
                        continue;
                    }
                    if(JOptionPane.showConfirmDialog(null,"Nhà cung cấp đã tồn tại. Bạn có muốn ghi đè nhà cung cấp này không ?" + km,"",0) == 0){
                        countOverride++;
                        kmbus.updateKM(km);
                        continue;
                    }
                    countCancel++;
                            
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Không thể đọc hàng này");
                    countError++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đọc từ file");
        }
        String dialog = "Đã thêm mới " + countadd;
        dialog += "\nĐã ghi đè " + countOverride;
        dialog += "\nĐã bỏ qua " + countCancel;
        dialog += "\nLỗi " + countError;
        JOptionPane.showMessageDialog(null, dialog);
    }
    
    public void readExcelStaff(){
        int countadd = 0;
        int countOverride = 0;
        int countCancel = 0;
        int countError = 0;
        ArrayList<NhanVien> data = nvbus.getAllData();
        ArrayList<NhanVien> readExcel = new ArrayList<>();
        
        fd.setTitle("Nhập dữ liệu nhân viên từ excel");
        String url = getFile();
        if (url == null) {
            return;
        }
        FileInputStream inputStream = null;
        try {
            Workbook workbook = WorkbookFactory.create(new File(url));
            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.rowIterator();
            rowIterator.next();
            
            //Doc thong tin 1 nhân viên
            while(rowIterator.hasNext()){
                Object []obj = new Object[10];
                int index = 0;
                org.apache.poi.ss.usermodel.Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    String value = dataFormatter.formatCellValue(cell);
                    obj[index++] = value;
                }
                
                //Ghi du lieu vao mot khuyenmai
                try {
                    NhanVien nv = new NhanVien(
                            Integer.valueOf(String.valueOf(obj[0])),
                            String.valueOf(obj[1]),
                            LocalDate.parse(String.valueOf(obj[2]), DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                            Boolean.valueOf(String.valueOf(obj[3])),
                            String.valueOf(obj[4]),
                            String.valueOf(obj[5]),
                            Integer.valueOf(String.valueOf(obj[6])),
                            String.valueOf(obj[7]),
                            String.valueOf(obj[8]),
                            Boolean.valueOf(String.valueOf(obj[9]))
                    );
                    
                    if(nvbus.isExistStaff(nv.getMaNhanVien()) == false){
                        countadd++;
                        boolean OK = nvbus.addNV(nv);
                        continue;
                    }
                    if(JOptionPane.showConfirmDialog(null,"Nhà cung cấp đã tồn tại. Bạn có muốn ghi đè nhà cung cấp này không ?" + nv,"",0) == 0){
                        countOverride++;
                        nvbus.updateNV(nv);
                        continue;
                    }
                    countCancel++;
                            
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Không thể đọc hàng này");
                    countError++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đọc từ file");
            e.printStackTrace();
        }
        String dialog = "Đã thêm mới " + countadd;
        dialog += "\nĐã ghi đè " + countOverride;
        dialog += "\nĐã bỏ qua " + countCancel;
        dialog += "\nLỗi " + countError;
        JOptionPane.showMessageDialog(null, dialog);
    }
}
