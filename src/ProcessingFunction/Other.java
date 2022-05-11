/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author MINHTHUAN
 */
public class Other {
        
    public static String convertTextToEnglish(String s){
        char []result = s.toLowerCase().replaceAll("\\s++","").toCharArray();
        char []aVN = {'á', 'à', 'ả', 'ã', 'ạ', 'ắ', 'ằ', 'ẳ', 'ẵ', 'ặ', 'ă', 'â', 'ấ', 'ầ', 'ẩ', 'ẫ', 'ậ'};
        char []dVN = {'đ'};
        char []eVN = {'é', 'è', 'ẻ', 'ẽ', 'ẹ', 'ê', 'ế', 'ề', 'ể', 'ễ', 'ệ'};
        char []iVN = {'í', 'ì', 'ỉ', 'ĩ', 'ị'};
        char []oVN = {'ó', 'ò', 'ỏ', 'õ', 'ọ', 'ô', 'ố', 'ồ', 'ổ', 'ỗ', 'ộ', 'ơ', 'ớ', 'ờ', 'ở', 'ỡ', 'ợ'};
        char []uVN = {'ú', 'ù', 'ủ', 'ũ', 'ụ', 'ư', 'ứ', 'ừ', 'ử', 'ữ', 'ự'};
        char []yVN = {'ý', 'ỳ', 'ỷ', 'ỹ', 'ỵ'};
        String rs = "";
        
        for(int i = 0;i < result.length;i++){
            for(char a : aVN){
                if(result[i] == a){
                    result[i] = 'a';
                }
                continue;
            }
            for(char a : dVN){
                if(result[i] == a){
                    result[i] = 'd';
                }
                continue;
            }
            for(char a : eVN){
                if(result[i] == a){
                    result[i] = 'e';
                }
                continue;
            }
            for(char a : iVN){
                if(result[i] == a){
                    result[i] = 'i';
                }
                continue;
            }
            for(char a : oVN){
                if(result[i] == a){
                    result[i] = 'o';
                }
                continue;
            }
            for(char a : uVN){
                if(result[i] == a){
                    result[i] = 'u';
                }
                continue;
            }
            for(char a : yVN){
                if(result[i] == a){
                    result[i] = 'y';
                }
                continue;
            }
        }
        
        for(char a : result){
            rs += a;
        }
        return rs;
    }
    
    public static int getDateFromString(String s){
        if(check.checkValidDate(s) == false){
            return 0;
        }
        int i = 0;
        while( i < s.length() && s.charAt(i) != '-' && s.charAt(i)!= '/'){
            i++;
        }

        if(i == s.length()-1) return 0;
        int end = i+3;
        if(s.charAt(end) !='/'){
            end--;
        }
        return Integer.valueOf(s.substring(i+1, end));
    }
    
    public static int getYearFromString(String s){
        if(check.checkValidDate(s) == false){
            return 0;
        }
        int i = 0;
        while( i < s.length() && s.charAt(i) != '-' && s.charAt(i)!= '/'){
            i++;
        }
        if(i == s.length()-1) return 0;
        return Integer.valueOf(s.substring(0,i));
    }
    
    public static void removeAllInPanel(JPanel root){
        root.removeAll();
        root.revalidate();
        root.repaint();
    }
    
    public static void main(String[] args) {
        String s = convetNumberToMoney("12223456789");
        System.out.println(s);
    }
    
    /*
    function convetNumberToMoney($number)
{
    $i = strlen($number) - 1;
    $result =  "";

    while ($i >= 0) {
        while ($i - 3 >= 0) {
            $result = "." . substr($number, $i - 2, 3) . $result;
            $i -= 3;
        }
        if ($i >= 0) {
            $result =  substr($number, 0, $i + 1) . $result;
            break;
        }
    }
    return $result;
}
    
    */
    
    public static String convetNumberToMoney(String number){
        int i = number.length()-1;
        String result = "";
        while(i >= 0){
            while(i-3 >= 0){
                result = "." + number.substring(i-2, i+1) + result;
                i-= 3;
            }
            if(i >=0){
                result  = number.substring(0,i+1)+ result;
                break;
            }
        }
        return result;
    }
    
    public static int getIdFromString(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) != '-') {
            i++;
        }
        return Integer.valueOf(s.substring(0, i));
    }
}
