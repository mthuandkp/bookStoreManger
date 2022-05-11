/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaCungCap;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class NhaCungCapDao {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<NhaCungCap> getAllData(){
        String qry = "select * from nhacungcap";
        ArrayList<NhaCungCap> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute(qry);
        try {
            while(rs.next()){
                data.add(new NhaCungCap(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
    
    public boolean addNCC(NhaCungCap ncc){
        String qry ="INSERT INTO `nhacungcap`(`MaNhaCungCap`, `TenNhaCungCap`, `SDT`, `DiaChi`, `TrangThai`) "
                + "VALUES ("+ncc.getMaNhaCungCap()+",'"+ncc.getTenNhaCungCap()+"','"+ncc.getSDT()+"','"+ncc.getDiaChi()+"',"+ncc.isTrangThai()+")";
        return conn.sqlUpdate(qry);
    }
    public boolean updateNCC(NhaCungCap ncc){
        String qry ="UPDATE `nhacungcap` "
                + "SET `TenNhaCungCap`='"+ncc.getTenNhaCungCap()+"',"
                + "`SDT`='"+ncc.getSDT()+"',`DiaChi`='"+ncc.getDiaChi()+"',`TrangThai`="+ncc.isTrangThai()+" WHERE `MaNhaCungCap`="+ncc.getMaNhaCungCap()+"";
        return conn.sqlUpdate(qry);
    }
}
