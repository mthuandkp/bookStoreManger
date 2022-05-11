/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

/**
 *
 * @author ANHKHOA
 */
import DAO.KhuyenMaiDao;
import DTO.KhuyenMai;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class KhuyenMaiBus {

    KhuyenMaiDao khuyenmaidao = new KhuyenMaiDao();

    public ArrayList<KhuyenMai> getAllData() {
        return khuyenmaidao.getAllData();
    }

    public boolean checkMaKM(String s) {
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        if (arrkm == null) {
            return false;
        }
        for (int i = 0; i < arrkm.size(); i++) {
            if (s.compareTo(String.valueOf(arrkm.get(i).getMaKhuyenMai())) == 0) {
                return true;
            }
        }
        return false;
    }

    public KhuyenMai getKm(int km) {
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        for (KhuyenMai a : arrkm) {
            if (a.getMaKhuyenMai() == km) {
                return a;
            }
        }
        return null;
    }

    public int getDecreaseById(int id) {
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        for (KhuyenMai km : arrkm) {
            if (km.getMaKhuyenMai() == id) {
                return km.getPhanTramGiam();
            }
        }
        return 0;
    }

    public String getNameById(int id) {
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        for (KhuyenMai km : arrkm) {
            if (km.getMaKhuyenMai() == id) {
                return km.getNgayApDung().toString();
            }
        }
        return "";
    }
    
    public boolean checkKM(String makm){
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        if (arrkm == null) {
            return false;
        }
        for(int i = 0; i<arrkm.size(); i++){
            if (makm.compareTo(String.valueOf(arrkm.get(i).getMaKhuyenMai())) == 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isExistKM(int makm){
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        if (arrkm == null) {
            return false;
        }
        for(int i = 0; i<arrkm.size(); i++){
            if (makm == arrkm.get(i).getMaKhuyenMai()) {
                return true;
            }
        }
        return false;
    }
    
    public KhuyenMai getKMbyid(int a){
        ArrayList<KhuyenMai> arrkm = khuyenmaidao.getAllData();
        for(KhuyenMai b : arrkm){
            if(a == b.getMaKhuyenMai()){
                return b;
            }
        }
        return null;
    }
   
    public boolean addKM(KhuyenMai km){
        return khuyenmaidao.addKM(km);
    }
    
    public boolean updateKM(KhuyenMai km){
        return khuyenmaidao.updateKM(km);
    }
    
    public ArrayList<KhuyenMai> searchKM(int id,String date,int decrease){
        ArrayList<KhuyenMai> data = getAllData();
        ArrayList<KhuyenMai> result = new ArrayList<>();
        
        for(KhuyenMai km : data){
            if(id != 0 && id!=km.getMaKhuyenMai()) continue;
            if(date.compareTo("") != 0 && date.substring(5).compareTo(km.getNgayApDung().toString().substring(5)) != 0) continue;
            if(decrease != -1 && decrease < km.getPhanTramGiam()) continue;
            result.add(km);
        }
        return result;
    }

    public int getIdInNow() {
        ArrayList<KhuyenMai> data = getAllData();
        String date = LocalDate.now().toString().substring(5);
        for(KhuyenMai km : data){
            if(km.getNgayApDung().toString().substring(5).compareTo(date) == 0){
                return km.getMaKhuyenMai();
            }
        }
        return 1;
    }
}
