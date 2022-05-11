/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDon;
import DTO.NhanVien;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class HoaDonDao {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<HoaDon> getAllData(){
        ArrayList<HoaDon> data = new ArrayList<>();
        ConnectionDB conn = new ConnectionDB();
        ResultSet rs = conn.sqlExcute("select * from hoadon");
        try {
            while(rs.next()){
                data.add(new HoaDon(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDate(5).toLocalDate(),
                        rs.getTime(6).toLocalTime(),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
            return null;
        }
        return data;
    }
    
    public boolean insertBill(HoaDon hd){
        String qry = "INSERT INTO `hoadon`(`MaHoaDon`, `MaNhanVien`, `MaKhachHang`, `MaKhuyenMai`, `NgayLap`, `GioLap`, `TrangThai`) "
                + "VALUES ("
                +hd.getMaHoaDon()+","
                +hd.getMaNhanVien()+","
                +hd.getMaKhachHang()+","
                +hd.getMaKhuyenMai()+",'"
                +hd.getNgayLap().toString()+"','"
                +hd.getGioLap().toString()+"',"
                +hd.getTrangThai()+");";
        
        return conn.sqlUpdate(qry);
    }
    
    public boolean insertBillCus(HoaDon hd){
        String qry = "INSERT INTO `hoadon`(`MaHoaDon`, `MaKhachHang`, `MaKhuyenMai`, `NgayLap`, `GioLap`, `TrangThai`) "
                + "VALUES ("
                +hd.getMaHoaDon()+","
                +hd.getMaKhachHang()+","
                +hd.getMaKhuyenMai()+",'"
                +hd.getNgayLap().toString()+"','"
                +hd.getGioLap().toString()+"',"
                +hd.getTrangThai()+");";
        
        return conn.sqlUpdate(qry);
    }
    
    public boolean updateSatusBill(int id){
        String qry = "UPDATE `hoadon` SET `TrangThai`=1 WHERE `MaHoaDon` = "+id+";";
        return conn.sqlUpdate(qry);
    }
    
    public boolean updateSatusBillCus(int id){
        String qry = "UPDATE `hoadon` SET `TrangThai`=2 WHERE `MaHoaDon` = "+id+";";
        return conn.sqlUpdate(qry);
    }

    public boolean updateStaff(int id,int idStaff) {
        String qry = "UPDATE `hoadon` SET `MaNhanVien`="+idStaff+" WHERE `MaHoaDon` = "+id+";";
        return conn.sqlUpdate(qry);
    }
}
