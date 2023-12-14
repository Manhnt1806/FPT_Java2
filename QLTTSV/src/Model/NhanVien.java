/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vietlong
 */
public class NhanVien {
    private String hoten,ngaysinh,gioitinh,cmtnd,diachi,honnhan,hocvan;
    private double bacluong;
    private boolean trangthai;

    public NhanVien() {
    }

    public NhanVien(String hoten, String ngaysinh, String gioitinh, String cmtnd, String diachi, String honnhan, String hocvan, double bacluong, boolean trangthai) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cmtnd = cmtnd;
        this.diachi = diachi;
        this.honnhan = honnhan;
        this.hocvan = hocvan;
        this.bacluong = bacluong;
        this.trangthai = trangthai;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmtnd() {
        return cmtnd;
    }

    public void setCmtnd(String cmtnd) {
        this.cmtnd = cmtnd;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHonnhan() {
        return honnhan;
    }

    public void setHonnhan(String honnhan) {
        this.honnhan = honnhan;
    }

    public String getHocvan() {
        return hocvan;
    }

    public void setHocvan(String hocvan) {
        this.hocvan = hocvan;
    }

    public double getBacluong() {
        return bacluong;
    }

    public void setBacluong(double bacluong) {
        this.bacluong = bacluong;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
