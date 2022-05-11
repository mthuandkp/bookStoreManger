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
public class TaiKhoan {
    private String TenDangNhap;
    private String MatKhau;
    private int MaKhachHang;
    private boolean TrangThai;

    public TaiKhoan(String TenDangNhap, String MatKhau, int MaKhachHang, boolean TrangThai) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaKhachHang = MaKhachHang;
        this.TrangThai = TrangThai;
    }
    
    

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "TenDangNhap=" + TenDangNhap + ", MatKhau=" + MatKhau + ", MaKhachHang=" + MaKhachHang + ", TrangThai=" + TrangThai + '}';
    }

    
}
