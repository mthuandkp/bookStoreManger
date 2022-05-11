/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TheLoai;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class TheLoaiDAO {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<TheLoai> getAllTypeData(){
        
        ArrayList<TheLoai> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute("select * from theloai");
        try {
            while (rs.next()) {
                data.add(new TheLoai(
                        rs.getInt(1),
                        rs.getString(2)
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
    
    public boolean addTL(TheLoai tl){
        String qry = "INSERT INTO `theloai`(`MaTheLoai`, `TenTheLoai`) VALUES ("+tl.getMaTheLoai()+",'"+tl.getTenTheLoai()+"')";
        return conn.sqlUpdate(qry);
    }
    
    public boolean updateTL(TheLoai tl){
        String qry = "UPDATE `theloai` SET `TenTheLoai`='"+tl.getTenTheLoai()+"' WHERE `MaTheLoai`="+tl.getMaTheLoai()+"";
        return conn.sqlUpdate(qry);
    }
    
    public boolean addTheloai(TheLoai tl){
         String qry = "INSERT INTO `theloai`(`MaTheLoai`, `TenTheLoai`)  VALUES ("+tl.getMaTheLoai()+",'"+tl.getTenTheLoai()+"');";
         return conn.sqlUpdate(qry);
        
     }
}
