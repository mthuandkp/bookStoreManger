/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.TheLoaiDAO;
import DTO.TheLoai;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class TheLoaiBus {
    TheLoaiDAO theloaidao = new TheLoaiDAO();
    
    public ArrayList<TheLoai> getAllType(){
        return theloaidao.getAllTypeData();
    }
    
    public int getNumberType(){
        return getAllType().size();
    }
    
    public String getNameTypeById(int id){
        ArrayList<TheLoai> data = getAllType();
        for(TheLoai tl : data){
            if(tl.getMaTheLoai() == id){
                return tl.getTenTheLoai();
            }
        }
        return "";
    }
    public TheLoai getTypeById(int id){
        ArrayList<TheLoai> data = getAllType();
        for(TheLoai tl : data){
            if(tl.getMaTheLoai() == id){
                return tl;
            }
        }
        return null;
    }
    
    public boolean addTL(TheLoai tl){
        return theloaidao.addTL(tl);
    }
    
    public boolean updateTL(TheLoai tl){
        return theloaidao.updateTL(tl);
    }
    
    public boolean checkmatheloai(String matheloai) {
        ArrayList<TheLoai> data = getAllType();
        for (TheLoai tl : data) {
            if (String.valueOf(tl.getMaTheLoai()).compareTo(matheloai)==0) {
                return true;
            }
        }
        return false;
    }
    public boolean checktentheloai(String tentheloai) {
        ArrayList<TheLoai> data = getAllType();
        for (TheLoai tl : data) {
            if (tl.getTenTheLoai().compareTo(tentheloai) == 0) {
                return true;
            }
        }
        return false;
    }
    public boolean addTheloai(TheLoai tl){
       return theloaidao.addTheloai(tl);
    }
}
