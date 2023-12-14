/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.System.Logger;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author PC
 */

public class InputStreamDemo {
    public static void main(String[] args) {
        docDulieuNguyenThuy();
        doDuLieu();
        docDoiTuong();
    }
    public static void docDulieuNguyenThuy(){
        try {
            //doc du lieu nguyen thuy
            FileInputStream fis = new FileInputStream("D:\\FPTPolytechnic\\Thuyxau");
             byte[]array = new byte[1000];
            //doc file
            fis.read(array);
            //chuyen du lieu tu file ve String
            String data = new String(array);
            System.out.println(data);
            //đóng luồng đọc file
            fis.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public static void doDuLieu(){
        try {
            //mo luong doc file cơ ban
            FileInputStream fis = new FileInputStream("D:\\FPTPolytechnic\\Thuyxau");
            DataInputStream dis = new DataInputStream(fis);
            
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            dis.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void docDoiTuong(){
        try {
            FileInputStream fis = new FileInputStream("D:\\FPTPolytechnic\\Thuyxau");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<SinhVien>list =(List<SinhVien>) ois.readObject();
            if(!list.isEmpty()){
                for(SinhVien sv: list){
                    System.out.println("Ten: "+ sv.getTen());
                    System.out.println("Tuoi: "+ sv.getTuoi());
                }
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
