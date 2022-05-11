/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietHoaDonDao;
import DTO.ChiTietHoaDon;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class ChiTietHoaDonBus {
    ChiTietHoaDonDao cthddao = new ChiTietHoaDonDao();
    public boolean checkExistDetailInArray(ArrayList<ChiTietHoaDon> cthd,int id){
        for(ChiTietHoaDon ct : cthd){
            if(ct.getMaSach() == id){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<ChiTietHoaDon> addDetailIntoArray(ArrayList<ChiTietHoaDon> cthd,int id,int number){
        if(checkExistDetailInArray(cthd, id)){
            for(ChiTietHoaDon ct : cthd){
                if(ct.getMaSach() == id){
                    ct.setSoLuong(ct.getSoLuong() + number);
                    return cthd;
                }
            }
        }
        cthd.add(new ChiTietHoaDon(0, id,number));
        return cthd;
    }
    
    public ArrayList<ChiTietHoaDon> updateNumberInArrayList(ArrayList<ChiTietHoaDon> cthd,int id,int number){
        for(ChiTietHoaDon ct : cthd){
            if(ct.getMaSach() == id){
                ct.setSoLuong(number);
            }
        }
        return cthd;
    }
    
    public ArrayList<ChiTietHoaDon> deleteDetailOutArray(ArrayList<ChiTietHoaDon> cthd,int id){
        int i=0;
        while (i < cthd.size()){
            while (i < cthd.size() && cthd.get(i).getMaSach() != id){
                i++;
            }
            if(i < cthd.size()){
                cthd.remove(i);
            }
        }
        return cthd;
    }
    
    public boolean insertArrayToDB(ArrayList<ChiTietHoaDon> data){
        boolean OK = false;
        for(ChiTietHoaDon ct : data){
            OK = cthddao.insertBillDetail(ct);
        }
        
        return OK;
    }
    
    public ArrayList<ChiTietHoaDon> getAllData(){
        return cthddao.getAllData();
    }
    
    public ArrayList<ChiTietHoaDon> getDataById(int id){
        ArrayList<ChiTietHoaDon> data = getAllData();
        ArrayList<ChiTietHoaDon> result = new ArrayList<>();
        
        for(ChiTietHoaDon cthd : data){
            if(cthd.getMaHoaDon() == id){
                result.add(cthd);
            }
        }
        return result;
    }
 
    public ArrayList<ChiTietHoaDon> appendDetailBill(ArrayList<ChiTietHoaDon> data1,ArrayList<ChiTietHoaDon> data2){
        for(ChiTietHoaDon ct2 : data2){
            boolean OK = true;
            for(ChiTietHoaDon ct1 : data1){
                if(ct1.getMaSach() == ct2.getMaSach()){
                    OK = false;
                    ct1.setSoLuong(ct1.getSoLuong() + ct2.getSoLuong());
                    break;
                }
            }
            if(OK == false) continue;
            data1.add(ct2);
        }
        return data1;
    }
}
