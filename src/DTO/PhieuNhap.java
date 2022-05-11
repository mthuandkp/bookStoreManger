/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MINHTHUAN
 */
public class PhieuNhap {
    private int MaPhieuNhap;
    private int MaNhanVien;
    private int MaNhaCungCap;
    private LocalDate NgayNhap;
    private LocalTime GioNhap;

    public PhieuNhap() {
    }
    
    

    public PhieuNhap(int MaPhieuNhap, int MaNhanVien, int MaNhaCungCap, LocalDate NgayNhap, LocalTime GioNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaNhanVien = MaNhanVien;
        this.MaNhaCungCap = MaNhaCungCap;
        this.NgayNhap = NgayNhap;
        this.GioNhap = GioNhap;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(int MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public LocalDate getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(LocalDate NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public LocalTime getGioNhap() {
        return GioNhap;
    }

    public void setGioNhap(LocalTime GioNhap) {
        this.GioNhap = GioNhap;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" + "MaPhieuNhap=" + MaPhieuNhap + ", MaNhanVien=" + MaNhanVien + ", MaNhaCungCap=" + MaNhaCungCap + ", NgayNhap=" + NgayNhap + ", GioNhap=" + GioNhap + '}';
    }
    
    
}
