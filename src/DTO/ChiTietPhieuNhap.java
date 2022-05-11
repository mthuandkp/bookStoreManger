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
public class ChiTietPhieuNhap {
    private int MaPhieuNhap;
    private int MaSach;
    private int SoLuong;
    private int Gia;
    private String HinhAnh;

    public ChiTietPhieuNhap(int MaPhieuNhap, int MaSach, int SoLuong, int Gia, String HinhAnh) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
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

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" + "MaPhieuNhap=" + MaPhieuNhap + ", MaSach=" + MaSach + ", SoLuong=" + SoLuong + ", Gia=" + Gia + ", HinhAnh=" + HinhAnh + '}';
    }
}
