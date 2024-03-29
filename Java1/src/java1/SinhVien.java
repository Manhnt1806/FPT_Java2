/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author PC
 */
public class SinhVien implements Comparable<SinhVien> {
    private String maSV;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien() {
    }
    
    public void inThongTin(){
        System.out.println("Mã sinh viên: "+this.maSV);
        System.out.println("Họ và tên: "+this.hoTen);
        System.out.println("Chuyên ngành: "+this.chuyenNganh);
    };

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.chuyenNganh.compareTo(o.getChuyenNganh());
    }
    
    
}
