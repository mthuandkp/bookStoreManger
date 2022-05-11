/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHang;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINHTHUAN
 */
public class KhachHangDAO {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<KhachHang> getAllData(){
        ArrayList<KhachHang> data = new ArrayList<>();
        ConnectionDB conn = new ConnectionDB();
        ResultSet rs = conn.sqlExcute("select * from khachhang");
        try {
            while(rs.next()){
                data.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getBoolean(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return data;
    }
    
    public boolean Update(int makhachhang, boolean trangthai){
        String qry = "UPDATE `khachhang` SET `TrangThai`="+trangthai+" WHERE `MaKhachHang` = "+makhachhang+";";
        ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
        
    }
    
    public boolean addCustomer(KhachHang kh){
        String qry = "INSERT INTO `khachhang`(`MaKhachHang`, `TenKhachHang`, `NgaySinh`, `DiaChi`, `SDT`, `TrangThai`) "
                + "VALUES ("
                +kh.getMaKhachHang()+",'"
                +kh.getTenKhachHang()+"','"
                +kh.getNgaySinh().toString()+"','"
                +kh.getDiaChi()+"','"
                +kh.getSDT()+"',"
                +kh.isTrangThai()+");";
        return conn.sqlUpdate(qry);
    }
    public boolean addKH(KhachHang kh){
        String qry ="INSERT INTO `khachhang`(`MaKhachHang`, `TenKhachHang`, `NgaySinh`, `DiaChi`, `SDT`) "
                + "VALUES ("+kh.getMaKhachHang()+",'"+kh.getTenKhachHang()+"','"
                +kh.getNgaySinh().toString()+"','"+kh.getDiaChi()+"','"+kh.getSDT()+"')";
        return conn.sqlUpdate(qry);
    }
    public boolean updateKH(KhachHang kh){
        String qry ="UPDATE `khachhang` SET `TenKhachHang`='"
                +kh.getTenKhachHang()+"',`NgaySinh`='"+kh.getNgaySinh().toString()+"',`DiaChi`='"
                +kh.getDiaChi()+"',`SDT`='"+kh.getSDT()+"' WHERE `MaKhachHang`="+kh.getMaKhachHang()+"";
        return conn.sqlUpdate(qry);
    }
}
