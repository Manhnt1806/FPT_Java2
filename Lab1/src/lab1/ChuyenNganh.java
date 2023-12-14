/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author PC
 */
public class ChuyenNganh {
    private String ten;
    private int maChuyenNganh;
    private int soGiangVien;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(int maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public int getSoGiangVien() {
        return soGiangVien;
    }

    public void setSoGiangVien(int soGiangVien) {
        this.soGiangVien = soGiangVien;
    }

    public ChuyenNganh(String ten, int maChuyenNganh, int soGiangVien) {
        this.ten = ten;
        this.maChuyenNganh = maChuyenNganh;
        this.soGiangVien = soGiangVien;
    }

    public ChuyenNganh() {
    }
    public void inThongTin(){
        System.out.println("Tên giảng viên: "+this.ten);
        System.out.println("Mã chuyên ngành: "+this.maChuyenNganh);
        System.out.println("Số giảng viên: "+this.soGiangVien);
    };

}
