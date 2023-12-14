/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import lab2.CaNhan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hi
 */
public class NVService {
    List<CaNhan>listNguoiDung = new ArrayList<>();
    public NVService(){
        CaNhan cn1 = new CaNhan("Manh","18/06/2003","Nam","0123456789","Thai binh","Doc than", "Cao dang",10.5,true);
        CaNhan cn2 = new CaNhan("Manh","18/06/2003","Nam","0123456789","Thai binh","Doc than", "Cao dang",1.4,true);
        CaNhan cn3 = new CaNhan("Manh","18/06/2003","Nam","0123456789","Thai binh","Doc than", "Cao dang",1.4,true);
        CaNhan cn4 = new CaNhan("Manh","18/06/2003","Nam","0123456789","Thai binh","Doc than", "Cao dang",1.4,true);
        CaNhan cn5 = new CaNhan("Manh","18/06/2003","Nam","0123456789","Thai binh","Doc than", "Cao dang",1.4,true);
        //thêm người dùng vào DS
        listNguoiDung.add(cn1);
        listNguoiDung.add(cn2);
        listNguoiDung.add(cn3);
        listNguoiDung.add(cn4);
        listNguoiDung.add(cn5);
    }
    public List<CaNhan>getListNguoiDung(){
        return listNguoiDung;
    }
    public void add(CaNhan cn){
        listNguoiDung.add(cn);
    }
}
