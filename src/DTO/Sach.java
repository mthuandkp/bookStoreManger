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
public class Sach {
    private int MaSach;
    private int MaPhieuNhap;
    private String TenSach;
    private int Gia;
    private int SoLuong;
    private String NhaXuatBan;
    private int MaTheLoai;
    private boolean TrangThai;
    private String HinhAnh;
    private int PhanTramGiamGia;
    private String TacGia;
    
    
    public Sach(int MaSach, String TenSach, int Gia, int SoLuong, String NhaXuatBan, int MaTheLoai, boolean TrangThai, String HinhAnh,String tacgia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.NhaXuatBan = NhaXuatBan;
        this.MaTheLoai = MaTheLoai;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
        this.TacGia = tacgia;
    }

    public Sach(int MaSach, String TenSach, int Gia, int SoLuong, String NhaXuatBan, int MaTheLoai, boolean TrangThai, String HinhAnh, int PhanTramGiamGia,String tacgia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.NhaXuatBan = NhaXuatBan;
        this.MaTheLoai = MaTheLoai;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
        this.PhanTramGiamGia = PhanTramGiamGia;
        this.TacGia = tacgia;
    }

    public Sach(int MaSach, int MaPhieuNhap, String TenSach, int Gia, int SoLuong, String NhaXuatBan, int MaTheLoai, boolean TrangThai, String HinhAnh, int PhanTramGiamGia,String tacgia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.NhaXuatBan = NhaXuatBan;
        this.MaTheLoai = MaTheLoai;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
        this.PhanTramGiamGia = PhanTramGiamGia;
        this.MaPhieuNhap = MaPhieuNhap;
        this.TacGia = tacgia;
    }
    
    

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getPhanTramGiamGia() {
        return PhanTramGiamGia;
    }

    public void setPhanTramGiamGia(int PhanTramGiamGia) {
        this.PhanTramGiamGia = PhanTramGiamGia;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    @Override
    public String toString() {
        return "Sach{" + "MaSach=" + MaSach + ", MaPhieuNhap=" + MaPhieuNhap + ", TenSach=" + TenSach + ", Gia=" + Gia + ", SoLuong=" + SoLuong + ", NhaXuatBan=" + NhaXuatBan + ", MaTheLoai=" + MaTheLoai + ", TrangThai=" + TrangThai + ", HinhAnh=" + HinhAnh + ", PhanTramGiamGia=" + PhanTramGiamGia + ", TacGia=" + TacGia + '}';
    }
}
