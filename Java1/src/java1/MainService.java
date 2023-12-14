/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

import view.IserviceCRUD;


/**
 *
 * @author PC
 */
public class MainService {
    public static void main(String[]args){
        IserviceCRUD<SinhVien> iSinhVien = new Service<>();
        SinhVien sv = new SinhVien("abc","Nguyen The Manh", "He thong thong tin");
        iSinhVien.add(sv);
        iSinhVien.delete(sv);
        iSinhVien.getList();
        
        IserviceCRUD<GiangVien> iGiangVien = new Service<>();
        GiangVien gv = new GiangVien();
        iGiangVien.add(gv);
        iGiangVien.delete(gv);
        iGiangVien.getList();
    }
    
}
