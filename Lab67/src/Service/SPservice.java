/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.QuanAo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class SPservice {
    List<QuanAo>listSanPham = new ArrayList<>();
    public SPservice(){
        QuanAo nd1 = new QuanAo("A1","Áo khoác",1,"L",10000);
        QuanAo nd2 = new QuanAo("Q2","Quần sort",2,"S",3000);
        QuanAo nd3 = new QuanAo("Q3","Quần jean",1,"M",7000);
        QuanAo nd4 = new QuanAo("A4","Áo len",2,"M",5000);
        listSanPham.add(nd1);
        listSanPham.add(nd2);
        listSanPham.add(nd3);
        listSanPham.add(nd4); 
    }
    
    public List<QuanAo>getListSanPham(){
        return listSanPham;
    }
    
    public void add(QuanAo nd){
        listSanPham.add(nd);
    }
    
    public void delete(int index){
        listSanPham.remove(index);
    }
    
    public boolean saveToFile(){
        try {
            //Mo luong ghi file co ban
            FileOutputStream fos = new FileOutputStream("fileSP.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listSanPham);
            oos.close();
            fos.close();
            
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SPservice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SPservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean readFromFile(){
        try {
            FileInputStream fis = new FileInputStream("fileSP.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listSanPham = (List<QuanAo>) ois.readObject();
            ois.close();
            fis.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SPservice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SPservice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SPservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
