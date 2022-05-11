/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVien;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class NhanVienDao {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<NhanVien> getAllData(){
        ArrayList<NhanVien> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute("select * from nhanvien");
        try {
            while(rs.next()){
                data.add(new NhanVien(
                        rs.getInt(1), 
                        rs.getString(2), 
                        rs.getDate(3).toLocalDate(), 
                        rs.getBoolean(4), 
                        rs.getString(5), 
                        rs.getString(6), 
                        rs.getInt(7), 
                        rs.getString(8), 
                        rs.getString(9), 
                        rs.getBoolean(10)
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
    public boolean addNV(NhanVien nv){
        String qry ="INSERT INTO `nhanvien`(`MaNhanVien`, `TenNhanVien`, `NgaySinh`, `GioiTinh`, `SDT`, `DiaChi`, `MaQuyen`, `TenDangNhap`, `MatKhau`, `TrangThai`) "
                + "VALUES ("
                +nv.getMaNhanVien()+",'"
                +nv.getTenNhanVien()+"','"
                +nv.getNgaySinh().toString()+"',"
                +nv.isGioiTinh()+",'"
                +nv.getSDT()+"','"
                +nv.getDiaChi()+"',"
                +nv.getMaQuyen()+",'"
                +nv.getTenDangNhap()+"','"
                +nv.getMatKhau()+"',"
                +nv.isTrangThai()+");";
        return conn.sqlUpdate(qry);
    }
   public boolean updateNV(NhanVien nv){
        String qry ="UPDATE `nhanvien` SET "
                + "`TenNhanVien`='"+nv.getTenNhanVien()+"',"
                + "`NgaySinh`='"+nv.getNgaySinh().toString()+"',"
                + "`GioiTinh`="+nv.isGioiTinh()+","
                + "`SDT`='"+nv.getSDT()+"',"
                + "`DiaChi`='"+nv.getDiaChi()+"',"
                + "`MaQuyen`="+nv.getMaQuyen()+","
                + "`TenDangNhap`='"+nv.getTenDangNhap()+"',"
                + "`MatKhau`='"+nv.getMatKhau()+"',"
                + "`TrangThai`="+nv.isTrangThai()
                +" WHERE `MaNhanVien` = "+nv.getMaNhanVien()+";";
        return conn.sqlUpdate(qry);
    }
}
