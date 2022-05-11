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
public class HoaDon {
    private int MaHoaDon;
    private int MaNhanVien;
    private int MaKhachHang;
    private int MaKhuyenMai;
    private LocalDate NgayLap;
    private LocalTime GioLap;
    private int TrangThai;

    public HoaDon(int MaHoaDon, int MaNhanVien, int MaKhachHang, int MaKhuyenMai, LocalDate NgayLap, LocalTime GioLap, int TrangThai) {
        this.MaHoaDon = MaHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.MaKhachHang = MaKhachHang;
        this.MaKhuyenMai = MaKhuyenMai;
        this.NgayLap = NgayLap;
        this.GioLap = GioLap;
        this.TrangThai = TrangThai;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public LocalDate getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(LocalDate NgayLap) {
        this.NgayLap = NgayLap;
    }

    public LocalTime getGioLap() {
        return GioLap;
    }

    public void setGioLap(LocalTime GioLap) {
        this.GioLap = GioLap;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHoaDon=" + MaHoaDon + ", MaNhanVien=" + MaNhanVien + ", MaKhachHang=" + MaKhachHang + ", MaKhuyenMai=" + MaKhuyenMai + ", NgayLap=" + NgayLap + ", GioLap=" + GioLap + ", TrangThai=" + TrangThai + '}';
    }
    
    
    
}
