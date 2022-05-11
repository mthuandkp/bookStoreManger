/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author ANHKHOA
 */
import DTO.KhuyenMai;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhuyenMaiDao 
{
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<KhuyenMai> getAllData(){
        ArrayList<KhuyenMai> data = new ArrayList<>();
        ResultSet rs = conn.sqlExcute("select * from khuyenmai");
        try {
            while(rs.next())
            {
                data.add(new KhuyenMai(
                        rs.getInt(1),
                        rs.getDate(2).toLocalDate(),
                        rs.getInt(3)
                        )
                    );
            }
        } catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }
        return data;
    }
    public boolean deleteKM(KhuyenMai km){
        String qry = "DELETE FROM `khuyenmai` WHERE'MaKhuyenMai'="+km.getMaKhuyenMai();
        return conn.sqlUpdate(qry);
    }
    public boolean updateKM(KhuyenMai km){
        String qry = "UPDATE `khuyenmai` SET `NgayApDung`='"+km.getNgayApDung()+"',`PhanTramGiam`="+km.getPhanTramGiam()+" WHERE `MaKhuyenMai` = "+km.getMaKhuyenMai()+";";
        return conn.sqlUpdate(qry);
    }
    
    public boolean addKM(KhuyenMai km){
        String qry = "INSERT INTO `khuyenmai` (`MaKhuyenMai`, `NgayApDung`, `PhanTramGiam`) "
                + "VALUES ("+km.getMaKhuyenMai()+", '"+km.getNgayApDung().toString()+"', "+km.getPhanTramGiam()+");";
        return conn.sqlUpdate(qry);
    }
}
    

 
