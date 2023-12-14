/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manhnt_ph29583;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class QLSV {
    
    public ArrayList<SinhVien> list;
//    ArrayList<nhanVien> list = new ArrayList<>();
    QLSV qlsv = new QLSV();
    
    public QLSV() {
    }
    public QLSV(ArrayList<SinhVien> list) {
        this.list = list;
    }
    public void themSV(SinhVien sv){
        list.add(sv);
    }
    public void xuatSV(){
        for(SinhVien sv: list){
            System.out.println(sv);
        }
    }
    
}
