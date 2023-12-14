/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manhnt_ph29583;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String chuyenNganh; 
    
    public SinhVien(){
        
    }
    
    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }
    
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
    public String toString() {
        return "Mã sinh viên: "+maSV+" - Sinh viên: " + hoTen + " - CHuyên Ngành: " +chuyenNganh;
    }
    
}

