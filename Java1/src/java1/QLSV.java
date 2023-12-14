/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class QLSV {
    List<SinhVien> listSinhVien = new ArrayList<>();
    //ArrayList<SinhVien> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public QLSV(){
    }
    public void nhapSV(){
        while(true){
            SinhVien st = new SinhVien();
            System.out.println("Nhập mã sinh viên: ");
            st.setMaSV(sc.nextLine());
            System.out.println("Nhập vào họ tên: ");
            st.setHoTen(sc.nextLine());
            System.out.println("Nhập vào chuyên Ngành: ");
            st.setChuyenNganh(sc.nextLine());
            
            listSinhVien.add(st);
            System.out.println("Bạn có muốn nhập tiếp không: (Y/N)");
            if(sc.nextLine().trim().equalsIgnoreCase("N")){
                break;
            }
        }
    }
    //Xuất danh sách
    public void xuatDS(){
        for(SinhVien v: listSinhVien){
            v.inThongTin();
        }
    }
    //Tìm sinh viên 
    public void timSV(){
        System.out.println("Nhập mã sinh viên cần tìm: ");
        String ma = sc.nextLine();
        //C1:
        for(SinhVien sv: listSinhVien){
            if(sv.getMaSV().equalsIgnoreCase(ma.trim())){
                sv.inThongTin();
            }
        }
        //C2:
        List<SinhVien> result = listSinhVien.stream()
                .filter(sinhvien -> sinhvien.getMaSV().equalsIgnoreCase(ma))
                .collect(Collectors.toList());
        if(!result.isEmpty()){
            result.forEach(rs -> rs.inThongTin());
        }
    }
    //Sắp xếp theo chuyên ngành
    public void sapXep(){
        Collections.sort(listSinhVien);
        xuatDS();
    }
    //menu
    
    
}

