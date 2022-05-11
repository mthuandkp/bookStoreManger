/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaiKhoan;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class TaiKhoanDao {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<TaiKhoan> getAllData() {
        
        ResultSet rs = conn.sqlExcute("select * from taikhoan");
        ArrayList<TaiKhoan> data = new ArrayList<>();

        try {
            while (rs.next()) {
                data.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }

    public boolean addAccount(TaiKhoan tk) {
        String qry = "INSERT INTO `taikhoan`(`TenDangNhap`, `MatKhau`, `MaKhachHang`, `TrangThai`) "
                + "VALUES ('"+tk.getTenDangNhap()+"','"+tk.getMatKhau()+"',"+tk.getMaKhachHang()+","+tk.isTrangThai()+");";
        return conn.sqlUpdate(qry);
    }
    
    public boolean updatePassword(String username, String password){
        String qry = "UPDATE `taikhoan` SET `MatKhau`='"+password+"' WHERE `TenDangNhap` = '"+username+"';";
        return conn.sqlUpdate(qry);
    }
     public boolean Update(String taikhoan, boolean trangthai){
        String qry = "UPDATE `taikhoan` SET `TrangThai`="+trangthai+" WHERE `tendangnhap` = '"+taikhoan+"';";
        ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
        
    }
     
     public boolean blockAccountCustomer(int idCus,boolean status){
         System.out.println("Tai khoan dao :ma kh : " + idCus);
         System.out.println("Trang thai : " + status);
         String qry = "UPDATE `taikhoan` SET `TrangThai`="+status+" WHERE `MaKhachHang` = "+idCus+";";
         ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
     }
}
