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
public class Quyen {
    private int MaQuyen;
    private String TenQuyen;

    public Quyen(int MaQuyen, String TenQuyen) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    @Override
    public String toString() {
        return "Quyen{" + "MaQuyen=" + MaQuyen + ", TenQuyen=" + TenQuyen + '}';
    }
}
