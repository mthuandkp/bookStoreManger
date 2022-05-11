/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class check {
    public static boolean checkValidDate(String s){
        int count = 0;
        for (char a : s.toCharArray()){
            if(a == '/' || a == '-'){
                count++;
            }
        }
        
        if(count !=2){
            return false;
        }
        
        for(char a : s.toCharArray()){
            if((a > '9' || a < '0') && a!='/'){
                return false;
            }
        }
        
        int i = 0;
        int begin = 0;
        count  = 0;
        ArrayList<String> str = new ArrayList<>();
        while(i < s.length() && count < 2){
            while(i < s.length() && count < 2 && s.charAt(i) != '/'){
                i++;
            }
            str.add(s.substring(begin,i));
            begin = i+1;
            i++;
        }
        
        //Kiem tra hop le ngay thang
        int day = Integer.valueOf(str.get(2));
        int mounth = Integer.valueOf(str.get(1));
        int year = Integer.valueOf(str.get(0));
        
        if(mounth > 12 || mounth < 1){
            return false;
        }
        
        switch(mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(day <= 0 || day > 31){
                    return false;
                }
                break;
            }
            
            case 4:
            case 6:
            case 9:
            case 11:{
                if(day <= 0 || day > 30){
                    return false;
                }
                break;
            }
            case 2:{
                if(isLeapYear(year)){
                    if(day <= 0 || day > 29){
                        return false;
                    }
                    return true;
                }
                if(day <= 0 || day > 28){
                        return false;
                }
                break;
            }
        }
        
        return true;
    }
    
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    
    public static boolean checkPhoneNumber(String s){
        if(s.length() != 10){
            return false;
        }
        if(s.charAt(0) != '0'){
            return false;
        }
        for(char a : s.toCharArray()){
            if(a < '0' || a > '9'){
                return false;
            }
        }
        return true;
    }
    
    
    public  static boolean checkValidTime(String s){
        int count = 0;
        for (char a : s.toCharArray()){
            if(a == ':'){
                count++;
            }
        }
        
        if(count !=2){
            return false;
        }
        
        for(char a : s.toCharArray()){
            if((a > '9' || a < '0') && a!=':'){
                return false;
            }
        }
        
        int i = 0;
        int begin = 0;
        count  = 0;
        ArrayList<String> str = new ArrayList<>();
        while(i < s.length() && count < 2){
            while(i < s.length() && count < 2 && s.charAt(i) != ':'){
                i++;
            }
            str.add(s.substring(begin,i));
            begin = i+1;
            i++;
        }
        
        //Kiem tra hop le ngay thang
        int hour = Integer.valueOf(str.get(0));
        int minute = Integer.valueOf(str.get(1));
        int second = Integer.valueOf(str.get(2));
        
        if(hour < 0 || hour > 24){
            return false;
        }
        if(minute < 0 || minute > 59){
            return false;
        }
        if(hour < 0 || hour > 59){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(checkValidDate("2021/02/12"));
    }
}
