/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author MINHTHUAN
 */
public class ChiTietHoaDon {
    private int MaHoaDon;
    private int MaPhieuNhap;
    private int MaSach;
    private int SoLuong;

    public ChiTietHoaDon(int MaHoaDon, int MaSach, int SoLuong) {
        this.MaHoaDon = MaHoaDon;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
    }

    public ChiTietHoaDon(int MaHoaDon, int MaPhieuNhap, int MaSach, int SoLuong) {
        this.MaHoaDon = MaHoaDon;
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
    }
    
    

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "MaHoaDon=" + MaHoaDon + ", MaPhieuNhap=" + MaPhieuNhap + ", MaSach=" + MaSach + ", SoLuong=" + SoLuong + '}';
    }
    
    

    
    
    
}
