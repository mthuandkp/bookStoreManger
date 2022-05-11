/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietHoaDon;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class ChiTietHoaDonDao {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<ChiTietHoaDon> getAllData(){
        ArrayList<ChiTietHoaDon> data = new ArrayList<>();
        String qry = "select * from chitiethoadon";
        ResultSet rs = conn.sqlExcute(qry);
        try {
            while(rs.next()){
                data.add(new ChiTietHoaDon(rs.getInt(1), rs.getInt(2),rs.getInt(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
    public boolean insertBillDetail(ChiTietHoaDon ct){
        String qry = "INSERT INTO `chitiethoadon`(`MaHoaDon`, `MaSach`, `SoLuong`) "
                + "VALUES ("
                +ct.getMaHoaDon()+","
                +ct.getMaSach()+","
                +ct.getSoLuong()+");";
        return conn.sqlUpdate(qry);
    }
}
