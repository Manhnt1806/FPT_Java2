/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        // ghi file
        fileOutputStream();
        
        //
        ghiDuLieuNguyenThuy();
        ghiDoiTuong();
        
        
    }
    public static void fileOutputStream() {
        String data = "Thứ 5 ngày 06-10-2022";
        
        try {
            FileOutputStream fos = new FileOutputStream("D:\\FPTPolytechnic\\Thuyxau");
            //ghi string ra file
            fos.write(data.getBytes());
            //đóng luồng output
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ghiDuLieuNguyenThuy(){
        try {
            //mở luồn ghi file cơ bản
            FileOutputStream fos = new FileOutputStream("D:\\FPTPolytechnic\\Thuyxau");
            DataOutputStream dos = new DataOutputStream(fos);
            
            //
            dos.writeBoolean(true);
            dos.writeInt(12);
            dos.writeDouble(5.2);
            dos.writeUTF("Java2");
            
            //đóng luồng ghi file
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ghiDoiTuong(){
        try {
            FileOutputStream fos = new FileOutputStream("D:\\FPTPolytechnic\\Thuyxau");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            List<SinhVien> listSV = new ArrayList<>();
            listSV.add(new SinhVien("Chung",18,10.2,true));
            listSV.add(new SinhVien("Chung",18,10.3,true));
            listSV.add(new SinhVien("Chung",18,10.4,true));
            listSV.add(new SinhVien("Chung",18,10.4,true));
            
            oos.writeObject(listSV);
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
