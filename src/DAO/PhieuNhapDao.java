/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhieuNhap;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class PhieuNhapDao {
    public ArrayList<PhieuNhap> getAllData(){
        String qry = "select * from phieunhap";
        ConnectionDB conn = new ConnectionDB();
        ArrayList<PhieuNhap> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute(qry);
        if(rs == null) return null;
        try {
            while(rs.next()){
                data.add(new PhieuNhap(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getDate(4).toLocalDate(),
                    rs.getTime(5).toLocalTime()
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
    public boolean insertPhieuNhap(int MaPhieuNhap,int MaNhanVien,int MaNhaCungCap,LocalDate NgayNhap,LocalTime GioNhap){
        String qry = "INSERT INTO `phieunhap`(`MaPhieuNhap`, `MaNhanVien`, `MaNhaCungCap`, `NgayNhap`, `GioNhap`) "
                + "VALUES ("
                +MaPhieuNhap+","
                +MaNhanVien+","
                +MaNhaCungCap+",'"
                +NgayNhap.toString()+"','"
                +GioNhap.toString()+"');";
        ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
    }
}
