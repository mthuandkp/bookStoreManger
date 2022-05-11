/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietHoaDonDao;
import DAO.HoaDonDao;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import ProcessingFunction.Other;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class HoaDonBus {
    HoaDonDao hddao = new HoaDonDao();
    ChiTietHoaDonDao cthddao = new ChiTietHoaDonDao();
    SachBus sachbus = new SachBus();
    public ArrayList<HoaDon> getAllData(){
        return hddao.getAllData();
    }
    
    public int createIdAuto(){
        ArrayList<HoaDon> data = getAllData();
        
        if(data == null || data.isEmpty()){
            return 1;
        }
        return data.get(data.size()-1).getMaHoaDon() + 1;
    }
    
    public boolean insertBill(HoaDon hd){
        return hddao.insertBill(hd);
    }
    public boolean insertCusBill(HoaDon hd){
        return hddao.insertBillCus(hd);
    }
    
    public HoaDon getBillById(int id){
        ArrayList<HoaDon> data = getAllData();
        for(HoaDon hd : data){
            if(hd.getMaHoaDon() == id){
                return hd;
            }
        }
        return null;
    }
    
    public boolean updateStatus(int id){
        return hddao.updateSatusBill(id);
    }
    
    public boolean updateStatusCus(int id){
        return hddao.updateSatusBillCus(id);
    }
    
    public ArrayList<HoaDon> searchBill(int idBill,int idCus,int idStaff,int idSale,String date,String time,int status){
        ArrayList<HoaDon> data = getAllData();
        ArrayList<HoaDon> result = new ArrayList<>();
        
        for(HoaDon hdDB : data){
            if(idBill != 0 && idBill != hdDB.getMaHoaDon()){
                continue;
            }
            if(idStaff != 0 && idStaff != hdDB.getMaNhanVien()){
                continue;
            }
            if(idCus!= 0 && idCus!= hdDB.getMaKhachHang()){
                continue;
            }
            if(idSale!= 0 && idSale!= hdDB.getMaKhuyenMai()){
                continue;
            }
            if(date.compareTo("") != 0 && date.compareTo(hdDB.getNgayLap().toString().replaceAll("-", "/")) != 0){
                continue;
            }
            if(time.compareTo("") != 0 && (hdDB.getGioLap().toString().replaceAll("-", "/").compareTo(time) != 0)){
                continue;
            }
            if(status != -1 && status != hdDB.getTrangThai()){
                continue;
            }
            result.add(hdDB);
        }
        return result;
    }
    
    public ArrayList<String[]> getDataBarChart(int year){
        //Thong ke gia cua tung phieu nhap
        ArrayList<HoaDon> data = getAllData();
        ArrayList<ChiTietHoaDon> datactpn = cthddao.getAllData();
        ArrayList<String[]> result = new ArrayList<>();
        for(HoaDon hd : data){
            if(Other.getYearFromString(hd.getNgayLap().toString().replaceAll("-", "/")) != year) continue;
            String []tmp = new String[3];
            int sum = 0;
            for(ChiTietHoaDon ct : datactpn){
                if(hd.getMaHoaDon()== ct.getMaHoaDon()){
                    sum += sachbus.getPriceBookFromId(ct.getMaSach())*ct.getSoLuong();
                }
            }
            tmp[0] = String.valueOf(sum);
            tmp[1] = "HoaDon";
            tmp[2] = String.valueOf(hd.getMaHoaDon())+" - " + hd.getNgayLap().toString();
            result.add(tmp);
        }
        return result;
    }
    
     public ArrayList<String[]> getDataLineChart(int year){
        ArrayList<HoaDon> data = getAllData();
        ArrayList<ChiTietHoaDon> datactpn = cthddao.getAllData();
        ArrayList<String[]> result = new ArrayList<>();
        int []value = new int[12];
        
        for(HoaDon hd : data){
            if(Other.getYearFromString(hd.getNgayLap().toString().replaceAll("-", "/")) != year) continue;
            int month = Other.getDateFromString(hd.getNgayLap().toString().replaceAll("-", "/"));
            if(month == 0) continue;
            for (ChiTietHoaDon ct : datactpn){
                if(hd.getMaHoaDon()== ct.getMaHoaDon()){
                    value[month-1] += sachbus.getPriceBookFromId(ct.getMaSach())*ct.getSoLuong();
                }
            }
        }
        
        for(int i = 0;i < 12;i++){
            double price = value[i]/1000000.0;
            String []str = {String.valueOf(price),"PhieuNhap",String.valueOf(i+1)};
            result.add(str);
        }
        return result;
    }

    public boolean updateStaff(int id,int idStaff) {
        return hddao.updateStaff(id,idStaff);
    }
    
}
