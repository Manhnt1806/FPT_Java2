/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class QuanAo implements Serializable{
    private String ma;
    private String ten;
    private int loai;
    private String size;
    private int gia;
    private String trangThai;
    public QuanAo() {
    }

    public QuanAo(String ma, String ten, int loai, String size, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.size = size;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public String getTrangThai(int gia){
        return gia>5000 ? "Đắt" : "Bình thường";
    }
    
}
