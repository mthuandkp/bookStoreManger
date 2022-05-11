/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.PhieuNhapDao;
import DTO.ChiTietPhieuNhap;
import DTO.PhieuNhap;
import ProcessingFunction.Other;
import ProcessingFunction.WriteExcel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class PhieuNhapBus {
    PhieuNhapDao phieunhapdao = new PhieuNhapDao();
    ChiTietPhieuNhapBus ctpnbus = new ChiTietPhieuNhapBus();
    public ArrayList<PhieuNhap> getAllData(){
        return phieunhapdao.getAllData();
    }
    
    public int createAutoId(){
        ArrayList<PhieuNhap> data = getAllData();
        if(data == null || data.isEmpty()){
            return 1;
        }
        return data.get(data.size()-1).getMaPhieuNhap()+1;
    }
    
    public boolean insertPhieuNhap(int MaPhieuNhap,int MaNhanVien,int MaNhaCungCap,LocalDate NgayNhap,LocalTime GioNhap){
        return phieunhapdao.insertPhieuNhap(MaPhieuNhap, MaNhanVien, MaNhaCungCap, NgayNhap, GioNhap);
    }
    
     public boolean insertPhieuNhap(PhieuNhap pn){
        return phieunhapdao.insertPhieuNhap(pn.getMaPhieuNhap(), pn.getMaNhanVien(), pn.getMaNhaCungCap(), pn.getNgayNhap(), pn.getGioNhap());
    }
    
    public ArrayList<PhieuNhap> getDataByKey(int idReceipt,int idStaff,int idSupplier,String date,String time){
        ArrayList<PhieuNhap> data = getAllData();
        ArrayList<PhieuNhap> result = new ArrayList<>();
        for(PhieuNhap pn : data){
            if(idReceipt != 0 && idReceipt != pn.getMaPhieuNhap()){
                continue;
            }
            
            if(idStaff != 0 && idStaff != pn.getMaNhanVien()){
                continue;
            }
            
            if(idSupplier != 0 && idSupplier != pn.getMaNhaCungCap()){
                continue;
            }
            if(date.compareTo("") != 0 && date.compareTo(pn.getNgayNhap().toString().replaceAll("-", "/")) != 0){
                continue;
            }
            if(time.compareTo("") != 0 && time.compareTo(pn.getGioNhap().toString()) != 0){
                continue;
            }
            result.add(pn);
        }
        return result;
    }
    
    public PhieuNhap getDataById(int id){
         ArrayList<PhieuNhap> data = getAllData();
         for(PhieuNhap pn:data){
             if(pn.getMaPhieuNhap() == id){
                 return pn;
             }
         }
         return null;
    }
    
    public ArrayList<String[]> getDataBarChart(int year){
        //Thong ke gia cua tung phieu nhap
        ArrayList<PhieuNhap> data = getAllData();
        ArrayList<ChiTietPhieuNhap> datactpn = ctpnbus.getAllData();
        ArrayList<String[]> result = new ArrayList<>();
        for(PhieuNhap pn : data){
            if(Other.getYearFromString(pn.getNgayNhap().toString().replaceAll("-", "/")) != year) continue;
            String []tmp = new String[3];
            int sum = 0;
            for(ChiTietPhieuNhap ct : datactpn){
                if(pn.getMaPhieuNhap() == ct.getMaPhieuNhap()){
                    sum += ct.getGia()*ct.getSoLuong();
                }
            }
            tmp[0] = String.valueOf(sum);
            tmp[1] = "PhieuNhap";
            tmp[2] = String.valueOf(pn.getMaPhieuNhap())+" - " + pn.getNgayNhap().toString();
            result.add(tmp);
        }
        return result;
    }
    
    public ArrayList<String[]> getDataLineChart(int year){
        ArrayList<PhieuNhap> data = getAllData();
        ArrayList<ChiTietPhieuNhap> datactpn = ctpnbus.getAllData();
        ArrayList<String[]> result = new ArrayList<>();
        int []value = new int[12];
        
        for(PhieuNhap pn : data){
            if(Other.getYearFromString(pn.getNgayNhap().toString().replaceAll("-", "/")) != year) continue;
            int month = Other.getDateFromString(pn.getNgayNhap().toString().replaceAll("-", "/"));
            if(month == 0) continue;
            for (ChiTietPhieuNhap ct : datactpn){
                if(pn.getMaPhieuNhap() == ct.getMaPhieuNhap()){
                    value[month-1] += ct.getGia()*ct.getSoLuong();
                }
            }
        }
        
        for(int i = 0;i < 12;i++){
            System.out.println(value[i]);
            double price = value[i]/1000000.0;
            String []str = {String.valueOf(price),"PhieuNhap",String.valueOf(i+1)};
            result.add(str);
        }
        return result;
    }
    
    public void writeExcel(int id){
        ArrayList<PhieuNhap> data = getAllData();
        ArrayList<ChiTietPhieuNhap> datactpn = ctpnbus.getAllData();
        PhieuNhap resultPn = null;
        ArrayList<ChiTietPhieuNhap> result = new ArrayList<>();
        for(PhieuNhap pn:data){
            if(pn.getMaPhieuNhap() == id){
                for(ChiTietPhieuNhap ctpn : datactpn){
                    if(pn.getMaPhieuNhap() == ctpn.getMaPhieuNhap()){
                        result.add(ctpn);
                    }
                }
                ProcessingFunction.WriteExcel wr = new WriteExcel();
                wr.WriteReceipt(pn, datactpn);
            }
        }
    }
}
