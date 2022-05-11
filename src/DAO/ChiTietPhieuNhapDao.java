/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietPhieuNhap;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class ChiTietPhieuNhapDao {
    public ArrayList<ChiTietPhieuNhap> getAllData(){
        String qry = "select * from chitietphieunhap";
        ConnectionDB conn = new ConnectionDB();
        ArrayList<ChiTietPhieuNhap> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute(qry);
        if(rs == null) return null;
        try {
            while(rs.next()){
                data.add(new ChiTietPhieuNhap(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
    public boolean insertCTPN(ChiTietPhieuNhap ct){
        String qry = "INSERT INTO `chitietphieunhap`(`MaPhieuNhap`, `MaSach`, `SoLuong`, `Gia`, `HinhAnh`) "
                + "VALUES ("+ct.getMaPhieuNhap()+","+ct.getMaSach()+","+ct.getSoLuong()+","+ct.getGia()+",'"+ct.getHinhAnh()+"');";
        ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
    }
}
