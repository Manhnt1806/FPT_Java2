
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        //ghi file
        fileOutputStream();
    }
    public static void fileOutputStream(){
        String data = "Co thuy xau nhat he mat troi";
        try {
            FileOutputStream fos = new FileOutputStream("D:\\FPTPolytechnic\\Thuyxau");
            //ghi string ra file
            fos.write(data.getBytes());
            //dong luong output
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
