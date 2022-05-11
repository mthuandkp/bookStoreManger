/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SachDao;
import DAO.TheLoaiDAO;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import DTO.NhanVien;
import DTO.Sach;
import DTO.TheLoai;
import ProcessingFunction.Other;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MINHTHUAN
 */
public class SachBus {
    SachDao sachdao = new SachDao();
    TheLoaiBus theloaibus = new TheLoaiBus();
    public String checkExistBook(int id){
        ArrayList<Sach> data = sachdao.getAllBookData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return "Mã sách " + id + " đã được sử dụng bạn có muốn cập nhật thông tin hiện tại cho quyển Sách này không ?";
            }
        }
        return "";
    }
    
    public boolean isExistBook(int id){
        ArrayList<Sach> data = sachdao.getAllBookData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return true;
            }
        }
        return false;
    }
    
    public String addBook(Sach s){
        if(sachdao.addBook(s)){
            return "Thêm thành công";
        }
        return "Không thể thêm";
    }
    
    public String updateBook(Sach s){
        if(sachdao.updateBook(s)){
            return "Cập nhật thông tin thành công";
        }
        return "";
    }
    
    public ArrayList<Sach> getAllData(){
        return sachdao.getAllBookData();
    }
    
    
    public ArrayList<Sach> getAllSachNotDuplicate(){
        ArrayList<Sach> data = getAllData();
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Integer> isRead = new ArrayList<>();
        
        for (Sach s : data){
            boolean OK = true;
            for(Integer num : isRead){
                if(num == s.getMaSach()){
                    OK = false;
                    break;
                }
            }
            if(OK == false){
                continue;
            }
            isRead.add(s.getMaSach());
            int number = getNumberBookById(s.getMaSach());
            s.setSoLuong(number);
            result.add(s);
        }
        return result;
    }
    
    public Sach getBookById(int id){
        ArrayList<Sach> data = sachdao.getAllBookData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                s.setSoLuong(getNumberBookById(id));
                return s;
            }
        }
        return null;
    }
    
    public Sach getBookById(ArrayList<Sach> data, int id){
        for(Sach s : data){
            if(s.getMaSach() == id){
                return s;
            }
        }
        return null;
    }
    
    public boolean UpdateNumberOfBook(int id,int number){
        int idReceipt = 0;
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            if(s.getMaSach() == id && s.getSoLuong() > 0){
                
            }
        }
        number += getBookById(id).getSoLuong();
        return sachdao.updateNumberBook(id, number,idReceipt);
    }
    
    public String getNameTypeById(int id){
        ArrayList<TheLoai> data = theloaibus.getAllType();
        for (TheLoai tl : data){
            if(tl.getMaTheLoai() == id){
                return tl.getTenTheLoai();
            }
        }
        return "";
    }
    
    public ArrayList<Sach> getAllDataByName(String input){
        input = ProcessingFunction.Other.convertTextToEnglish(input);
        ArrayList<Sach> data = getAllData();
        ArrayList<Sach> result = new ArrayList<>();
        for (Sach s : data){
            String nameOfBook = ProcessingFunction.Other.convertTextToEnglish(s.getTenSach());
            if(nameOfBook.contains(input) == false) continue;
            result.add(s);
        }
        return result;
    }
    
    public ArrayList<Sach> getAllDataByNameNotDuplicate(String input){
        input = ProcessingFunction.Other.convertTextToEnglish(input);
        ArrayList<Sach> data = getAllSachNotDuplicate();
        ArrayList<Sach> result = new ArrayList<>();
        for (Sach s : data){
            String nameOfBook = ProcessingFunction.Other.convertTextToEnglish(s.getTenSach());
            if(nameOfBook.contains(input) == false) continue;
            result.add(s);
        }
        return result;
    }
    
    public ArrayList<Sach> getAllDataByKey(String inputname,int type,int price){
        ArrayList<Sach> data = getAllData();
        inputname = ProcessingFunction.Other.convertTextToEnglish(inputname);
        ArrayList<Sach> result = new ArrayList<>();
        for(Sach s : data){
            if(inputname.compareTo("") != 0){
                if(ProcessingFunction.Other.convertTextToEnglish(s.getTenSach()).contains(inputname) == false){
                    continue;
                }
            }
            if(type != 0){
                if(type != s.getMaTheLoai()){
                    continue;
                }
            }
            if(price != 0){
                if(price < s.getGia()){
                    continue;
                }
            }
            result.add(s);
        }
        return result;
    }
    
    public int getNumberBook(){
        ArrayList<Sach> data = getAllData();
        int sum = 0;
        for (Sach s : data){
            sum += s.getSoLuong();
        }
        return sum;
    }
    
    public boolean updateBookIntoArrayList(ArrayList<Sach> data,Sach s){
        for(Sach a : data){
            if(a.getMaSach() != s.getMaSach()){
                continue;
            }
            a.setTenSach(s.getTenSach());
            a.setGia(s.getGia());
            a.setSoLuong(s.getSoLuong());
            a.setNhaXuatBan(s.getNhaXuatBan());
            a.setMaTheLoai(s.getMaTheLoai());
            a.setHinhAnh(s.getHinhAnh());
            a.setTacGia(s.getTacGia());
            return true;
        }
        return false;
    }
    
    public boolean deleteBookIntoArrayList(ArrayList<Sach> data,int id){
        for(Sach a : data){
            if(a.getMaSach() != id){
                continue;
            }
            data.remove(a);
            return true;
        }
        return false;
    }
    
    public boolean addArrayListBookIntoDB(ArrayList<Sach> data,int idReceipt){
        boolean status = false;
        for(Sach s : data){
            
            s.setMaPhieuNhap(idReceipt);
            s.setGia(s.getGia()+50000);
            
            status = sachdao.addBook(s);
        }
        return status;
    }
    
    public boolean checkExistBookInArray(ArrayList<Sach> data,int id){
        for(Sach s : data){
            if(s.getMaSach() == id){
                return true;
            }
        }
        return false;
    }
    
    public String getNameById(int id){
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return s.getTenSach();
            }
        }
        return "";
    }
    
    public ArrayList<Sach> getSimplifyArrayList(){
        ArrayList<Sach> data = getAllData();
        if(data == null || data.isEmpty()){
            return null;
        }
        for(int i = 0;i < data.size()-1;i++){
            for (int j = i+1;j < data.size();j++){
                if(data.get(j).getMaSach() == data.get(i).getMaSach()){
                    data.get(i).setSoLuong(data.get(i).getSoLuong() + data.get(j).getSoLuong());
                    data.get(j).setMaSach(0);
                }
            }
            int j = i+1;
            while(j < data.size()){
                while(j < data.size() && data.get(j).getMaSach() != 0){
                    j++;
                }
                if(j < data.size()){
                    data.remove(j);
                }
            }
        }
        return data;
    }
    
    public boolean checkNumberBookInDB(ArrayList<ChiTietHoaDon> cthd,int id,int number){
        ArrayList<Sach> data = getAllData();
        int sum = 0;
        for(Sach s : data){
            if(s.getMaSach() == id){
                sum += s.getSoLuong();
            }
        }
        for(ChiTietHoaDon ct : cthd){
            if(ct.getMaSach() == id){
                number += ct.getSoLuong();
            }
        }
        return (sum >= number) ? true:false;
    }
    
     public boolean checkNumberBookInDB(int id,int number){
        ArrayList<Sach> data = getAllData();
        int sum = 0;
        for(Sach s : data){
            if(s.getMaSach() == id){
                sum += s.getSoLuong();
            }
        }
        
        return (sum >= number) ? true:false;
    }
    
   
    
    public int getPriceBookFromId(int id){
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return s.getGia();
            }
        }
        return 0;
    }   
    
    
    public boolean decreaseNumberBook(ArrayList<ChiTietHoaDon> datacthd){
        ArrayList<Sach> data = getAllData();
        for(ChiTietHoaDon ct : datacthd){
            while(ct.getSoLuong() > 0){
                for(Sach s : data){
                    if(ct.getMaSach() == s.getMaSach()){
                        //SL DB - SL CT
                        //=> 0 : SLDB = delta;SLCT = 0
                        //< 0 : SLDB = 0;SLCT =  abs(delta)
                        int result = s.getSoLuong() - ct.getSoLuong();
                        if(result >=0){
                            s.setSoLuong(result);
                            ct.setSoLuong(0);
                        }
                        else{
                            s.setSoLuong(0);
                            ct.setSoLuong(Math.abs(result));
                        }
                    }
                }
            }
        }
        boolean OK = false;
        for(Sach s : data){
            OK = sachdao.updateBook(s);
        }
        
        return OK;
    }
    
    public String getImageById(int id){
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return s.getHinhAnh();
            }
        }
        return "";
    }
    
    public int getNumberBookById(int id){
        ArrayList<Sach> data = getAllData();
        int sum = 0;
        for(Sach s : data){
            if(s.getMaSach() == id){
                sum+= s.getSoLuong();
            }
        }
        return sum;
    }
    
    public ArrayList<String[]> getDataForPieChart(){
        ArrayList<Sach> data = getAllSachNotDuplicate();
        ArrayList<String[]> result = new ArrayList<>();
        
        for(Sach s : data){
            String []tmp = new String[2];
            tmp[0] = s.getTenSach();
            tmp[1] = String.valueOf(s.getSoLuong());
            result.add(tmp);
        }
        return result;
    }
    
    public int getDereaseSale(int id){
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            if(s.getMaSach() == id){
                return s.getPhanTramGiamGia();
            }
        }
        return 0;
    }
    
    public ChiTietHoaDon addBookToCart(int id){
        ArrayList<Sach> data = getAllData();
        
        for(Sach s : data){
            if(s.getMaSach() == id && s.getSoLuong() > 0 && sachdao.updateNumberBook(s.getMaSach(), s.getSoLuong()-1, s.getMaPhieuNhap())){
                return new ChiTietHoaDon(0, s.getMaPhieuNhap(), s.getMaSach(), 1);
            }
        }
        return null;
    }
    
    public boolean addNumberBook(int id,int idReceipt,int numberAdd){
        ArrayList<Sach> data = getAllData();
        int num = 0;
        for(Sach s : data){
            if(s.getMaSach() == id && s.getMaPhieuNhap() == idReceipt){
                num = s.getSoLuong();
            }
        }
        return sachdao.updateNumberBook(id, num+numberAdd, idReceipt);
    }
    
    public static void main(String[] args) {
        SachBus sa = new SachBus();
        ChiTietHoaDon ct =  sa.addBookToCart(1);
        System.out.println(ct);
    }

    public ArrayList<Sach> searchUser(String name, String nameType,String author, int higher, int lower,String NXB) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> data = getAllSachNotDuplicate();
        
        System.out.println(name);
        System.out.println(nameType);
        System.out.println(author);
        
        
        for(Sach s : data){
            if(name.compareTo("") != 0 && 
                    Other.convertTextToEnglish(s.getTenSach()).contains(Other.convertTextToEnglish(name)) == false)continue;
            if(nameType.compareTo("") != 0 && 
                    Other.convertTextToEnglish(theloaibus.getNameTypeById(s.getMaTheLoai())).contains(Other.convertTextToEnglish(nameType)) == false) continue;
            if((lower != 0 && higher != 0) && (s.getGia() > lower || s.getGia() < higher)) continue;
            if(NXB.compareTo("") != 0 && 
                    Other.convertTextToEnglish(s.getNhaXuatBan()).contains(Other.convertTextToEnglish(NXB)) == false) continue;
            if(author.compareTo("") != 0 && 
                    Other.convertTextToEnglish(s.getTacGia()).contains(Other.convertTextToEnglish(author)) == false) continue;
            result.add(s);
        }   
        return result;
    }

    public int createAutoId() {
        ArrayList<Sach> data = getAllData();
        if(data == null || data.isEmpty()){
            return 1;
        }
        return data.get(data.size()-1).getMaSach() + 1;
    }
    
    public boolean isExistId(ArrayList<Sach> data,int id){
        for(Sach s : data){
            if(s.getMaSach() == id){
                return true;
            }
        }
        return false;
    }
    
    public int getIdBookContains(String bookName){
        System.out.println(Other.convertTextToEnglish(bookName) + "\n\n");
        ArrayList<Sach> data = getAllData();
        for(Sach s : data){
            System.out.println(Other.convertTextToEnglish(s.getTenSach()));
            if(Other.convertTextToEnglish(s.getTenSach()).contains(Other.convertTextToEnglish(bookName)) || 
                    Other.convertTextToEnglish(s.getTenSach()).compareTo(Other.convertTextToEnglish(bookName)) == 0){
                
                return s.getMaSach();
            }
        }
        return 0;
    }
}
