/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachHangDAO;
import DAO.TaiKhoanDao;
import DTO.KhachHang;
import DTO.TaiKhoan;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class TaiKhoanBus {

    TaiKhoanDao tkdao = new TaiKhoanDao();
    KhachHangBus khbus = new KhachHangBus();

    public ArrayList<TaiKhoan> getAllData() {
        return tkdao.getAllData();
    }

    public ArrayList<TaiKhoan> searchData(int id, String username, int status) {
        ArrayList<TaiKhoan> data = getAllData();
        ArrayList<TaiKhoan> result = new ArrayList<>();

        for (TaiKhoan tk : data) {
            if (id != 0 && id != tk.getMaKhachHang()) {
                continue;
            }
            if (username.compareTo("") != 0 && tk.getTenDangNhap().contains(username) == false) {
                continue;
            }
            if (status != -1) {
                boolean check = (status == 0) ? true : false;
                if (check != tk.isTrangThai()) {
                    continue;
                }
            }

            result.add(tk);
        }
        return result;
    }

    public boolean isExistTK(String username) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(username) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean addAccount(TaiKhoan tk) {
        return tkdao.addAccount(tk);
    }

    public KhachHang loginAccount(String username, String password) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(username) == 0 && tk.getMatKhau().compareTo(password) == 0) {
                return khbus.getKHById(tk.getMaKhachHang());
            }
        }
        return null;
    }

    public boolean getStatusByUser(String username) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(username) == 0) {
                return tk.isTrangThai();
            }
        }
        return false;
    }

    public boolean isExistUser(String username) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(username) == 0) {
                return true;
            }
        }
        return false;
    }

    public TaiKhoan getAccountByUser(String username) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(username) == 0) {
                return tk;
            }
        }
        return null;
    }

    public boolean updatePassword(String username, String password) {
        return tkdao.updatePassword(username, password);
    }

    public String getNameById(int id) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (Integer.valueOf(tk.getMaKhachHang()) == id) {
                return tk.getTenDangNhap();
            }
        }
        return "";
    }

    public TaiKhoan getTKById(String id) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getTenDangNhap().compareTo(id) == 0) {
                return tk;
            }
        }
        return null;
    }

    public boolean Update(String taikhoan, boolean trangthai) {
        return tkdao.Update(taikhoan, trangthai);
    }

    public TaiKhoan getTKById(int id) {
        ArrayList<TaiKhoan> data = getAllData();
        for (TaiKhoan tk : data) {
            if (tk.getMaKhachHang()==id) {
                return tk;
            }
        }
        return null;
    }
}
