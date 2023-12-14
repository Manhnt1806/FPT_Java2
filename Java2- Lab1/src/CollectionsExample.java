
import Model.NguoiDung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class CollectionsExample {
    public static void main(String[]args){
        List<Double> listDoub = new ArrayList<>();
        //Them phan tu
        listDoub.add(12.5);
        listDoub.add(20.5);
        listDoub.add(15.1);
        listDoub.add(13.7);
        listDoub.add(12.5);
        
        System.out.println(listDoub);
        System.out.println("kich thuoc: " + listDoub.size());
        System.out.println(listDoub);
        System.out.println("kich thuoc: " + listDoub.size());
        System.out.println("lay phan tu trong lisst: "+listDoub.get(4));
        Set<Double>hashSetDouble = new HashSet<>();
        hashSetDouble.add(12.5);
        hashSetDouble.add(20.5);
        hashSetDouble.add(15.1);
        hashSetDouble.add(13.7);
        hashSetDouble.add(12.5);
        System.out.println(hashSetDouble);
        for(Double item:hashSetDouble){
            if(item == 12.5){
                System.out.println(item);
            }
        }
        Set<Double> treeSetDob = new TreeSet<>();
        treeSetDob.add(12.5);
        treeSetDob.add(20.5);
        treeSetDob.add(15.1);
        treeSetDob.add(13.7);
        treeSetDob.add(12.5);
        System.out.println("Treeset"+treeSetDob);
        
        List<NguoiDung> listNguoiDung = new ArrayList<>();
        NguoiDung nd1 = new NguoiDung("Manh","manhnt@gmail.com","manhnt1806","Sinh vien",1,true);
        NguoiDung nd2 = new NguoiDung("Gam","gamnt@","gamnt1806","Sinh vien",1,true);
        NguoiDung nd3 = new NguoiDung("abc","abcnt@","abcd6","Sinh vien",1,true);
        NguoiDung nd4 = new NguoiDung("Manhabc","manhxyznt@","manhnt1806","Sinh vien",1,true);
        NguoiDung nd5 = new NguoiDung("Manh","manhnt@gmail.com","manhnt1806","Sinh vien",1,true);
        
        //thêm người dùng vào DS
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);
        System.out.println("DS cu: "+ listNguoiDung.size());
//        System.out.println("Xoa phan tu tai vi tri thu 4: ");
//        listNguoiDung.remove(4);
//        System.out.println("DS moi: "+ listNguoiDung.size());
        NguoiDung removeItem = new NguoiDung("Manh","manhnt@gmail.com","manhnt1806","Sinh vien",1,true);
        NguoiDung removeItem1 = listNguoiDung.get(4);
        listNguoiDung.remove(removeItem);
//        listNguoiDung.removeIf(item -> Objects.equals(item, removeItem));
        System.out.println("DS moi: "+ listNguoiDung.size());
        
        //Sap xep xuoi ASC
        Comparator com = new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        };
        Collections.sort(listNguoiDung, com);
        //In danh sach
//        for(NguoiDung nd: listNguoiDung){
//            System.out.println("tk: "+nd.getUserName()+" - email: "+nd.getEmail());
//        }
        
        //Sap xep nguoc DES
        Collections.sort(listNguoiDung, new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o2.getEmail().compareTo(o1.getEmail());
            }
        });
//        for(NguoiDung nd: listNguoiDung){
//            System.out.println("tk: "+nd.getUserName()+" - email: "+nd.getEmail());
//        }

        //C2: SU DUNG INTERFACE Comparable ben class doi tuong
        //Trien khai tieu chi so sanh
        //Sap xep tang dan ASC
        Collections.sort(listNguoiDung);
        //Sap xep giam dan DES
        Collections.reverse(listNguoiDung);
        //C3: method sort()
        //Sap xep tang dan ASC
        listNguoiDung.sort(Comparator.comparing(NguoiDung::getUserName));
        //Sap xep DES
        listNguoiDung.sort(Comparator.comparing(NguoiDung::getUserName).reversed());
        //C4:  method stream()
        List<NguoiDung>listSorted = listNguoiDung.stream().sorted(Comparator.comparing(NguoiDung::getEmail)).collect(Collectors.toList());
        for(NguoiDung nd: listNguoiDung){
            System.out.println("tk: "+nd.getUserName()+" - email: "+nd.getEmail());
        }
        //loc cac doi tuong
        List<NguoiDung>fillter = listNguoiDung.stream().filter(Item -> Item.getUserName().equalsIgnoreCase("Manhabc")
                &&Item.getEmail().equalsIgnoreCase("manhxyznt@"))
                .collect(Collectors.toList());
        for(NguoiDung nd: fillter){
            System.out.println("tk: "+nd.getUserName()+" - email: "+nd.getEmail());
        }
    }
}
