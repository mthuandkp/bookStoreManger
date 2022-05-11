/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.FileDialog;
import java.awt.Frame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author MINHTHUAN
 */
public class LineChart_AWT implements Runnable{
    @Override
    public void run() {
        FileDialog fd = new FileDialog(new Frame(),"Lưu File",FileDialog.LOAD);
        fd.setVisible(true);
        if((fd.getDirectory() + fd.getFile()).equals("nullnull")){
            JOptionPane.showMessageDialog(null, "Exit");
            return;
        }
        JOptionPane.showMessageDialog(null, "Continue");
    }
    
    public static void main(String[] args) {
       LineChart_AWT tmp= new LineChart_AWT();
       //tmp.run();
    }

    
}
