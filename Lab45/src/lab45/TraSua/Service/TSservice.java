/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab45.TraSua.Service;

import java.util.ArrayList;
import java.util.List;
import lab45.TraSua.TraSua;

/**
 *
 * @author PC
 */
public class TSservice {
    List<TraSua>listTraSua = new ArrayList<>();
    public TSservice(){
        TraSua nd1 = new TraSua("Hong tra sua",1,"Tran chau den","abc",1,true);
        TraSua nd2 = new TraSua("Hong tra sua",2,"Tran chau den","abc",2,true);
        TraSua nd3 = new TraSua("Hong tra sua",3,"Tran chau den","abc",2,true);
        TraSua nd4 = new TraSua("Hong tra sua",4,"Tran chau den","abc",1,true);
        TraSua nd5 = new TraSua("Hong tra sua",5,"Tran chau den","abc",1,true);
        
        //thêm người dùng vào DS
        listTraSua.add(nd1);
        listTraSua.add(nd2);
        listTraSua.add(nd3);
        listTraSua.add(nd4);
        listTraSua.add(nd5);
    }
    public List<TraSua>getListNguoiDung(){
        return listTraSua;
    }
    public void add(TraSua nd){
        listTraSua.add(nd);
    }
    public void update(int index, TraSua nd){
        listTraSua.set(index, nd);
    }
    public void delete(int index){
        listTraSua.remove(index);
    }
}
