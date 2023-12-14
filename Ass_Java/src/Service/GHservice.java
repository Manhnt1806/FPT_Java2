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
public class GHservice {
    List<SanPham>listGH = new ArrayList<>();
    public GHservice(){
    }
    public List<SanPham>getListGH(){
        return listGH;
    }
    public void add(SanPham sp){
        listGH.add(sp);
    }
    public void delete(int index){
        listGH.remove(index);
    }
}
