/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaCungCapDao;
import DTO.NhaCungCap;
import ProcessingFunction.Other;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class NhaCungCapBus {

    NhaCungCapDao nhacungcapdao = new NhaCungCapDao();

    public ArrayList<NhaCungCap> getAllData() {
        return nhacungcapdao.getAllData();
    }

    public boolean checkMaNCC(String s) {
        ArrayList<NhaCungCap> arrncc = nhacungcapdao.getAllData();
        if (arrncc == null) {
            return false;
        }
        for (int i = 0; i < arrncc.size(); i++) {
            if (s.compareTo(String.valueOf(arrncc.get(i).getMaNhaCungCap())) == 0) {
                return true;
            }
        }
        return false;
    }

    public NhaCungCap getNCCbyID(int id) {
        ArrayList<NhaCungCap> arrncc = nhacungcapdao.getAllData();
        for (NhaCungCap a : arrncc) {
            if (a.getMaNhaCungCap() == id) {
                return a;
            }
        }
        return null;
    }

    public String getNameById(int id) {
        ArrayList<NhaCungCap> data = getAllData();
        for (NhaCungCap nv : data) {
            if (nv.getMaNhaCungCap() == id) {
                return nv.getTenNhaCungCap();
            }
        }
        return "";
    }
    
    public ArrayList<NhaCungCap> searchNCC(int id,String name,String phone,String address,int status){
        ArrayList<NhaCungCap> data = getAllData();
        ArrayList<NhaCungCap> result = new ArrayList<>();
        for (NhaCungCap ncc : data){
            if(id != 0 && id != ncc.getMaNhaCungCap()){
                continue;
            }
            
            if(name.compareTo("")!=0){
                name = Other.convertTextToEnglish(name);
                if(Other.convertTextToEnglish(ncc.getTenNhaCungCap()).contains(name) == false){
                    continue;
                }
            }
            
            if(phone.compareTo("") != 0 && ncc.getSDT().contains(phone)== false){
                continue;
            }
            
            if(address.compareTo("")!= 0){
                address = Other.convertTextToEnglish(address);
                if(Other.convertTextToEnglish(ncc.getDiaChi()).contains(address) == false){
                    continue;
                }
            }
            if(status != -1){
                boolean statusNCC = (status == 1)? false:true;
                if(statusNCC != ncc.isTrangThai()){
                    continue;
                }
            }
            
            result.add(ncc);
        }
        return result;
    }

    public boolean isExist(int maNhaCungCap) {
        ArrayList<NhaCungCap> data = getAllData();
        for(NhaCungCap ncc : data){
            if(ncc.getMaNhaCungCap() == maNhaCungCap){
                return true;
            }
        }
       return false;
    }
    
    public boolean insertNCC(NhaCungCap ncc){
        return nhacungcapdao.addNCC(ncc);
    }
    
    public boolean updateNCC(NhaCungCap ncc){
        return nhacungcapdao.updateNCC(ncc);
    }

    public boolean addNCC(NhaCungCap ncc) {
        return nhacungcapdao.addNCC(ncc);
    }
}
