/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
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
import javax.swing.Spring;

/**
 *
 * @author PC
 */
public class SPservice {
    List<SanPham>listSanPham = new ArrayList<>();
    public SPservice(){
       SanPham sp1 = new SanPham("I1", "Iphone 5", "Iphone",1, "Gold", 1000000, 1, true, 1000000); 
       SanPham sp2 = new SanPham("I2", "Iphone X", "Iphone", 1, "Hong", 2500000, 2, true, 2500000); 
       SanPham sp3 = new SanPham("S1", "SamSung Galaxy", "SamSung", 1, "Den", 3590000, 2, true, 3590000); 
       SanPham sp4 = new SanPham("O1", "Oppo zeno 6", "Oppo", 1, "Gold", 3500000, 1, true, 3500000); 
       SanPham sp5 = new SanPham("S2", "SamSung A20", "SamSung", 1, "Gold", 7500000, 2, true, 7500000); 
       
        listSanPham.add(sp1);
        listSanPham.add(sp2);
        listSanPham.add(sp3);
        listSanPham.add(sp4);
        listSanPham.add(sp5);
    }
    public List<SanPham>getListSanPham(){
        return listSanPham;
    }
    public void add(SanPham sp){
        listSanPham.add(sp);
    }
    public void update(int index, SanPham sp){
        listSanPham.set(index, sp);
    }
    public void delete(int index){
        listSanPham.remove(index);
    }
    
    public SanPham search(String id){
        for(SanPham sp: listSanPham){
            if(sp.getMa().equalsIgnoreCase(id)){
                return sp;
            }
        }
        return null;
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
            listSanPham = (List<SanPham>) ois.readObject();
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
