/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;


/**
 *
 * @author mthuan
 */
public class convertMoneyToVietnameseText {
    
    //public static int cvCharToInt(char a){return Integer.valueOf(String.valueOf(a));}
    
    //public static int cvStringToInt(String s){return Integer.valueOf(s);}
    
    public static boolean allAfterIsZeroFromIndex(String s,int index){
        return (Integer.valueOf(s.substring(index+1, s.length())) == 0 ? true:false);
    }
    
    public static String readSingleNumber(int numberNeedConvert,String str,int indexInString){
        switch(numberNeedConvert){
            case 0:{           
                if(indexInString == 2){
                    return "";
                }
                else if(indexInString == 1){
                    return "lẻ";
                }
                return "không";
            }
            case 1:{
                //Neu no o cuoi va truoc no la so 1
                if(indexInString == 2 && Integer.valueOf(String.valueOf(str.charAt(1))) > 1){
                    return "mốt";
                }
                return "một";
            }
            case 2:{return "hai";}
            case 3:{return "ba";}
            case 4:{return "bốn";}
            case 5:{
                if(indexInString == 2 && Integer.valueOf(String.valueOf(str.charAt(1))) > 0){
                    return "lăm";
                }
                return "năm";
            }
            case 6:{return "sáu";}
            case 7:{return "bảy";}
            case 8:{return "tám";}
            case 9:{return "chín";}
            
            default:{return "";}
        }
    }
    
    
    public static String readTrippleNumber(int index){
        switch(index){
            case 1:{return "nghìn";}
            case 2:{return "triệu";}
            case 3:{return "tỉ";}
                        
            default:{return "";}
        }
    }
    
    public static String readTwoLastNumber(String root,String s){
        int value = Integer.valueOf(s);
            if(value == 0){
                return "";
            }
            //Trường hợp [10;19]
            else if(value/10  == 1){ 
                return "mười " + readSingleNumber(Integer.valueOf(String.valueOf(root.charAt(2))), root, 2);
            }
            //Trường hợp [20,30,40,..,90]
            else if(value%10 == 0 && value/10 != 0){
                return readSingleNumber(Integer.valueOf(String.valueOf(root.charAt(1))), root, 1) + " mươi";
            }
            else{
             return readSingleNumber(Integer.valueOf(String.valueOf(root.charAt(1))), root, 1) + ((Integer.valueOf(String.valueOf(s.charAt(0))) == 0)?" ": " mươi ")
                    + readSingleNumber(Integer.valueOf(String.valueOf(root.charAt(2))), root, 2);
            }
        
    }
    
    public static String readNumberToString(String s,boolean isSingle,int levels){
        //CHuẩn hóa chuỗi input sao cho length = 3
        while(s.length() != 3){
            s = '0' + s;
        }
        
        int value = Integer.valueOf(s);
        //Là chuỗi gốc có length = 3
        if(isSingle == true){
            if(value == 0) return "không";
            else if(value < 10){
                return readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(2))), s, 2);
            }
            else if(value < 20) return "mười " + readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(2))), s, 2);
            else if(value < 100){
                if(value%10 == 0){
                    return readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(1))), s, 1) + " mươi";
                }
                return readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(1))), s, 1) + " mươi "
                        + readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(2))), s, 2);
            }
            else{
                return readSingleNumber(Integer.valueOf(String.valueOf(s.charAt(0))), s, 0)
                        + " trăm "
                        + readTwoLastNumber(s,s.substring(1, s.length()));
            }
        }
        //Là chuỗi con trong nhiều chuỗi
        else{
            if(value == 0){
                return "";
                //return " không ";
            }
            String firstNumberDigit = String.valueOf(s.charAt(0));
            String twoLastDigit = s.substring(1, s.length());
            String result = "";
            result += readSingleNumber(Integer.valueOf(firstNumberDigit), s, 0) + " trăm ";
            return result + readTwoLastNumber(s,twoLastDigit);
            
        }       
        
    }
    
    public static String convertNumberToVietnameseText(String s){
        //Chuẩn hóa chuỗi
        while (s.length()%3 != 0){
            s = '0' + s;
        }
        String arr[] = new String[s.length()/3];
        int beginSlipt = s.length()-3;
        int i = s.length()/3 -1;
        while(beginSlipt >= 0){
            arr[i--] = s.substring(beginSlipt, beginSlipt+3);
            beginSlipt-=3;
        }
        
        String result = "";
        for (i = 0;i < s.length()/3;i++){
            boolean isSinggle = false;
            if(s.length() < 4 || i == 0){
                isSinggle = true;
            }
            int levels = arr.length-1-i;
            while(levels > 3){
                levels -= 3;
            }
            
            result += readNumberToString(arr[i], isSinggle,levels) + " " 
                    + (((s.length() > 3) && Integer.valueOf(arr[i]) != 0) ? readTrippleNumber(levels):"") + " ";
            isSinggle = false;
        }
        result = result.replaceAll("\\s\\s+", " ").trim();
        return result;
    }
    
    public static String convertNumberToVietnameseFormat(String str){
        if(str.length() < 4){
            return str;
        }
        while(str.length()%3 != 0){
            str = '0' + str;
        }
        
        int length = str.length()/3;
        String arr[] = new String[length];
        int beginIndex = str.length()-3;
        int numberArr = length-1;
        String result = "";
                
        while(beginIndex >= 0){
            arr[numberArr] =str.substring(beginIndex, beginIndex+3);
            beginIndex -= 3;
            numberArr--;
        }
        
        result = String.valueOf(Integer.valueOf(arr[0]));
        for (int i = 1;i < length;i++){
            result += '.' + arr[i];
        }
        return result;
        
    }
    
    
    public static void main(String[] args) {
        
        
        String vnd = "1111111111";
        
        System.out.println(convertNumberToVietnameseFormat(vnd));
        System.out.println(convertNumberToVietnameseText(vnd));
        
    }
    
}
