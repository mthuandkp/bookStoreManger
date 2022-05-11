/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietPhieuNhapDao;
import DTO.ChiTietPhieuNhap;
import DTO.PhieuNhap;
import DTO.Sach;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class ChiTietPhieuNhapBus {
    ChiTietPhieuNhapDao ctpndao = new ChiTietPhieuNhapDao();
    public boolean addReceiptDetail(int idReceipt,ArrayList<Sach> data){
        boolean Ok = false;
        for(Sach s : data){
            s.setGia(s.getGia()-50000);
            ChiTietPhieuNhap ct = new ChiTietPhieuNhap(idReceipt, s.getMaSach(), s.getSoLuong(), s.getGia(), s.getHinhAnh());
            Ok = ctpndao.insertCTPN(ct);
        }
        return Ok;
    }
    
    public boolean insertArray(int idReceipt,ArrayList<ChiTietPhieuNhap> data){
        boolean OK = false;
        for(ChiTietPhieuNhap ct : data){
            ct.setMaPhieuNhap(idReceipt);
            OK = ctpndao.insertCTPN(ct);
        }        
        return OK;
    }
    
    public ArrayList<ChiTietPhieuNhap> getAllData(){
        return ctpndao.getAllData();
    }
    
    public ArrayList<ChiTietPhieuNhap> getDataById(int id){
        ArrayList<ChiTietPhieuNhap> data = getAllData();
        ArrayList<ChiTietPhieuNhap> result = new ArrayList<>();
        for(ChiTietPhieuNhap ctpn : data){
            if(ctpn.getMaPhieuNhap() == id){
                result.add(ctpn);
            }
        }
        return result;
    }
}
