/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author MINHTHUAN
 */
public class KhachHang {
    private int MaKhachHang;
    private String TenKhachHang;
    private LocalDate NgaySinh;
    private String DiaChi;
    private String SDT;
    private boolean TrangThai;

    public KhachHang() {
    }
    
    
    public KhachHang(int MaKhachHang, String TenKhachHang, LocalDate NgaySinh, String DiaChi, String SDT) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public KhachHang(int MaKhachHang, String TenKhachHang, LocalDate NgaySinh, String DiaChi, String SDT, boolean TrangThai) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.TrangThai = TrangThai;
    }
    
    

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    

    @Override
    public String toString() {
        return "KhachHang{" + "MaKhachHang=" + MaKhachHang + ", TenKhachHang=" + TenKhachHang + ", NgaySinh=" + NgaySinh + ", DiaChi=" + DiaChi + ", SDT=" + SDT + '}';
    }
    
    
    
}
