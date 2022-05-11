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
public class NhaCungCap {
    private int MaNhaCungCap;
    private String TenNhaCungCap;
    private String SDT;
    private String DiaChi;
    private boolean TrangThai;

    public NhaCungCap(int MaNhaCungCap, String TenNhaCungCap, String SDT, String DiaChi, boolean TrangThai) {
        this.MaNhaCungCap = MaNhaCungCap;
        this.TenNhaCungCap = TenNhaCungCap;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.TrangThai = TrangThai;
    }

    public int getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(int MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return TenNhaCungCap;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCungCap = TenNhaCungCap;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "NhaCungCap{" + "MaNhaCungCap=" + MaNhaCungCap + ", TenNhaCungCap=" + TenNhaCungCap + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", TrangThai=" + TrangThai + '}';
    }
}
