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
public class KhuyenMai {
    private int MaKhuyenMai;
    private LocalDate NgayApDung;
    private int PhanTramGiam;

    public KhuyenMai(int MaKhuyenMai, LocalDate NgayApDung) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.NgayApDung = NgayApDung;
    }

    public KhuyenMai(int MaKhuyenMai, LocalDate NgayApDung, int PhanTramGiam) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.NgayApDung = NgayApDung;
        this.PhanTramGiam = PhanTramGiam;
    }
    
    

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public LocalDate getNgayApDung() {
        return NgayApDung;
    }

    public void setNgayApDung(LocalDate NgayApDung) {
        this.NgayApDung = NgayApDung;
    }

    public int getPhanTramGiam() {
        return PhanTramGiam;
    }

    public void setPhanTramGiam(int PhanTramGiam) {
        this.PhanTramGiam = PhanTramGiam;
    }
    
    

    @Override
    public String toString() {
        return "KhuyenMai{" + "MaKhuyenMai=" + MaKhuyenMai + ", NgayApDung=" + NgayApDung + '}';
    }
    
    
}
