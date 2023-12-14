/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Model.NguoiDung;
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
 * @author Hi
 */
public class NDService {
    List<NguoiDung>listNguoiDung = new ArrayList<>();
    public NDService(){
        NguoiDung nd1 = new NguoiDung("Manh","manhnt@gmail.com","manhnt1806","Sinh vien",1,true);
        NguoiDung nd2 = new NguoiDung("Gam","gamnt@","gamnt1806","Sinh vien",1,true);
        NguoiDung nd3 = new NguoiDung("abc","abcnt@","abcd6","Sinh vien",1,true);
        NguoiDung nd4 = new NguoiDung("Manhabc","manhxyznt@","manhnt1806","Sinh vien",1,true);
        NguoiDung nd5 = new NguoiDung("Manhntph","manhnt@","manhnt1806","Sinh vien",1,true);
        
        //thêm người dùng vào DS
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);
    }
    public List<NguoiDung>getListNguoiDung(){
        return listNguoiDung;
    }
    public void add(NguoiDung nd){
        listNguoiDung.add(nd);
    }
    public void update(int index, NguoiDung nd){
        listNguoiDung.set(index, nd);
    }
    public void delete(int index){
        listNguoiDung.remove(index);
    }
        public boolean saveToFile(){
        try {
            //Mo luong ghi file co ban
            FileOutputStream fos = new FileOutputStream("fileNguoiDung.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listNguoiDung);
            oos.close();
            fos.close();
            
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean readFromFile(){
        try {
            FileInputStream fis = new FileInputStream("fileNguoiDung.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listNguoiDung = (List<NguoiDung>) ois.readObject();
            ois.close();
            fis.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
