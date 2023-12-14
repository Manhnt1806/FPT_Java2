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
public class SanPham implements Serializable{
    private String ma;
    private String tenSP;
    private String hangSP;
    private int soLuong;
    private String mauSP;
    private int giaSP;
    private int loaiSP;
    private boolean trangThaiSP;
    private int tongTienSP;

    public SanPham() {
    }

    public SanPham(String ma, String tenSP, String hangSP, int soLuong, String mauSP, int giaSP, int loaiSP, boolean trangThaiSP, int tongTienSP) {
        this.ma = ma;
        this.tenSP = tenSP;
        this.hangSP = hangSP;
        this.soLuong = soLuong;
        this.mauSP = mauSP;
        this.giaSP = giaSP;
        this.loaiSP = loaiSP;
        this.trangThaiSP = trangThaiSP;
        this.tongTienSP = tongTienSP;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSP() {
        return mauSP;
    }

    public void setMauSP(String mauSP) {
        this.mauSP = mauSP;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    public int getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        this.loaiSP = loaiSP;
    }

    public boolean isTrangThaiSP() {
        return trangThaiSP;
    }

    public void setTrangThaiSP(boolean trangThaiSP) {
        this.trangThaiSP = trangThaiSP;
    }

    public int getTongTienSP() {
        return tongTienSP;
    }

    public void setTongTienSP(int tongTienSP) {
        this.tongTienSP = giaSP*soLuong;
    }

    

    
}