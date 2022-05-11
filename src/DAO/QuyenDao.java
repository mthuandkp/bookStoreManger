/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Quyen;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class QuyenDao {
    ConnectionDB conn = new ConnectionDB();
    
    public ArrayList<Quyen> getAllData(){
        String qry = "select * from quyen";
        ResultSet rs = conn.sqlExcute(qry);
        ArrayList<Quyen> data = new ArrayList<>();
        try {
            while(rs.next()){
                data.add(new Quyen(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }
}
