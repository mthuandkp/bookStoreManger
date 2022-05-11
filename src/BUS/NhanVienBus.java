/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDao;
import DTO.NhanVien;
import ProcessingFunction.ConnectionDB;
import ProcessingFunction.Other;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MINHTHUAN
 */
public class NhanVienBus {

    NhanVienDao nhanviendao = new NhanVienDao();

    public ArrayList<NhanVien> getAllData() {
        return nhanviendao.getAllData();
    }

    public String checkLogin(String username, String password) {
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        int index = 0;
        for (NhanVien nv : data) {
            if (nv.getTenDangNhap().compareTo(username) == 0) {
                break;
            }
            index++;
        }

        if (index > data.size() - 1) {
            return "Tài khoản không tồn tại";
        }

        if (password.compareTo(data.get(index).getMatKhau()) == 0) {
            if (data.get(index).isTrangThai() == false) {
                return "Tài khoản đã bị khóa vui lòng liên hệ Admin";
            }
            return "Đăng nhập thành công";
        }
        return "Mật khẩu không chính xác";
    }

    public NhanVien getStaffByUserName(String Username) {
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        for (NhanVien nv : data) {
            if (nv.getTenDangNhap().compareTo(Username) == 0) {
                return nv;
            }
        }
        return null;
    }

    public int getRightOfStaff(String Username) {
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        for (NhanVien nv : data) {
            if (nv.getTenDangNhap().compareTo(Username) == 0) {
                return nv.getMaQuyen();
            }
        }
        return 0;
    }

    public String getNameById(int id) {
        ArrayList<NhanVien> data = getAllData();
        for (NhanVien nv : data) {
            if (nv.getMaNhanVien() == id) {
                return nv.getTenNhanVien();
            }
        }
        return "";
    }

    public Boolean addNV(NhanVien nv) {
        return nhanviendao.addNV(nv);
    }

    public Boolean updateNV(NhanVien nv) {
        return nhanviendao.updateNV(nv);
    }

    public boolean checkMaNV(String ma) {
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        if (data == null) {
            return false;
        }
        for (int i = 0; i < data.size(); i++) {
            if (ma.compareTo(String.valueOf(data.get(i).getMaNhanVien())) == 0) {
                return true;
            }
        }
        return false;
    }

    public int createAutoId() {
        ArrayList<NhanVien> data = getAllData();
        if (data == null || data.isEmpty()) {
            return 1;
        }
        return data.get(data.size() - 1).getMaNhanVien() + 1;
    }

    public NhanVien getStaffById(int id) {
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        if (data == null || data.isEmpty()) {
            return null;
        }
        for (NhanVien nv : data) {
            if (nv.getMaNhanVien() == id) {
                return nv;
            }
        }
        return null;
    }

    public ArrayList<NhanVien> searchData(int id, String name, String birthday, int sex, int right, String username, String sdt, String address) {
        ArrayList<NhanVien> data = getAllData();
        ArrayList<NhanVien> result = new ArrayList<>();
        for (NhanVien nv : data) {
            if (id != -1 && id != nv.getMaNhanVien()) {
                continue;
            }
            if (name.compareTo("") != 0 && Other.convertTextToEnglish(nv.getTenNhanVien()).contains(Other.convertTextToEnglish(name)) == false) {
                continue;
            }
            if (birthday.compareTo("") != 0 && birthday.compareTo(nv.getNgaySinh().toString()) != 0) {
                continue;
            };
            if (sex != -1) {
                boolean OK = (sex == 0) ? true : false;
                if (OK != nv.isGioiTinh()) {
                    continue;
                }
            }
            if (right != -1 && right != nv.getMaQuyen()) {
                continue;
            }
            if (username.compareTo("") != 0 && Other.convertTextToEnglish(nv.getTenDangNhap()).contains(Other.convertTextToEnglish(username)) == false) {
                continue;
            };
            if (sdt.compareTo("") != 0 && nv.getSDT().contains(sdt) == false) {
                continue;
            }
            if (Other.convertTextToEnglish(nv.getDiaChi()).contains(Other.convertTextToEnglish(address)) == false) {
                continue;
            }
            result.add(nv);
        }
        return result;
    }

    public ArrayList<String[]> getChartData() {
        ArrayList<String[]> result = new ArrayList<>();
        ArrayList<Integer[]> tmp = new ArrayList<>();
        ArrayList<NhanVien> data = getAllData();

        for (NhanVien nv : data) {
            int year = Integer.valueOf(nv.getNgaySinh().toString().substring(0, 4));
            boolean OK = true;
            for (Integer[] value : tmp) {
                if (value[0] == year) {
                    value[1]++;
                    OK = false;
                    break;
                }
            }
            if (OK) {
                Integer[] intmp = new Integer[2];
                intmp[0] = year;
                intmp[1] = 1;
                tmp.add(intmp);
                continue;
            }
            
        }
        
        for(Integer[] value : tmp){
            String []str = new String[2];
            str[0] = String.valueOf(value[0]);
            str[1] = String.valueOf(value[1]);
            result.add(str);
        }
        
        return result;
    }

    public boolean isExistStaff(int id){
        ArrayList<NhanVien> data = nhanviendao.getAllData();
        if (data == null || data.isEmpty()) {
            return false;
        }
        for (NhanVien nv : data) {
            if (nv.getMaNhanVien() == id) {
                return true;
            }
        }
        return false;
    }
}
