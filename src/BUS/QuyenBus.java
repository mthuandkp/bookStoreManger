/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.QuyenDao;
import DTO.Quyen;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class QuyenBus {
    QuyenDao quyendao = new QuyenDao();
    public ArrayList<Quyen> getAllData(){
        return quyendao.getAllData();
    }
    
    public String getNameById(int id){
        ArrayList<Quyen> data = getAllData();
        for(Quyen q : data){
            if(q.getMaQuyen() == id){
                return q.getTenQuyen();
            }
        }
        return "";
    }
}
