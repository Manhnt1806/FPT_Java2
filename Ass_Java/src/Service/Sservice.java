/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Sservice {
    List<SanPham>listS = new ArrayList<>();
    public Sservice(){
    }
    public List<SanPham>getListS(){
        return listS;
    }
    public void add(SanPham sp){
        listS.add(sp);
    }
}
