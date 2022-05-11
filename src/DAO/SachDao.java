/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Sach;
import DTO.TheLoai;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class SachDao {

    public ArrayList<Sach> getAllBookData() {
        ConnectionDB conn = new ConnectionDB();
        ArrayList<Sach> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute("select * from sach");
        try {
            while (rs.next()) {
                data.add(new Sach(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getBoolean(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11)
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            conn.closeConnection();
            return null;
        }
        conn.closeConnection();
        return data;
    }
    
    public boolean addBook(Sach s){
        ConnectionDB conn = new ConnectionDB();
        String qry = "INSERT INTO `sach`(`MaSach`, `MaPhieuNhap`, `TenSach`, `Gia`, `SoLuong`, `NhaXuatBan`, `MaTheLoai`, `TrangThai`, `HinhAnh`, `PhanTramGiamGia`, `TacGia`)"
                + " VALUES ("
                +s.getMaSach()+","
                +s.getMaPhieuNhap()+",'"
                +s.getTenSach()+"',"
                +s.getGia()+","
                +s.getSoLuong()+",'"
                +s.getNhaXuatBan()+"',"
                +s.getMaTheLoai()+","
                +s.isTrangThai()+",'"
                +s.getHinhAnh()+"',"
                +s.getPhanTramGiamGia()+",'"
                +s.getTacGia()+"');";
        return conn.sqlUpdate(qry);
    }
    
    public boolean updateBook(Sach s){
        ConnectionDB conn = new ConnectionDB();
        String qry = "UPDATE `sach` SET "
                + "`TenSach`='"+s.getTenSach()+"',"
                + "`Gia`="+s.getGia()+","
                + "`SoLuong`="+s.getSoLuong()+","
                + "`NhaXuatBan`='"+s.getNhaXuatBan()+"',"
                + "`MaTheLoai`="+s.getMaTheLoai()+","
                + "`TrangThai`="+s.isTrangThai()+","
                + "`HinhAnh`='"+s.getHinhAnh()+"',"
                + "`PhanTramGiamGia`="+s.getPhanTramGiamGia()+","
                + "`TacGia`='"+s.getTacGia()+"' "
                + "WHERE `MaSach` = "+s.getMaSach()+";";
        return conn.sqlUpdate(qry);
    }
    
        
    public boolean updateNumberBook(int id,int number,int idReceipt){
        ConnectionDB conn = new ConnectionDB();
        String qry = "UPDATE `sach` SET `SoLuong`="+number+" WHERE `MaSach` = "+id+" AND `MaPhieuNhap` = "+idReceipt+";";
        return conn.sqlUpdate(qry);
    }
}
