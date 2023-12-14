/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author PC
 */
public class CaNhan {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String cmtnd;
    private String diaChi;
    private String tinhTrangHonNhan;
    private String hocVan;
    private Double bacLuong;
    private Boolean trangThai;  

    public CaNhan(String ten, String ngaySinh, String gioiTinh, String cmtnd, String diaChi, String tinhTrangHonNhan, String hocVan, Double bacLuong, Boolean trangThai) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmtnd = cmtnd;
        this.diaChi = diaChi;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.hocVan = hocVan;
        this.bacLuong = bacLuong;
        this.trangThai = trangThai;
    }

    public CaNhan() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmtnd() {
        return cmtnd;
    }

    public void setCmtnd(String cmtnd) {
        this.cmtnd = cmtnd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getHocVan() {
        return hocVan;
    }

    public void setHocVan(String hocVan) {
        this.hocVan = hocVan;
    }

    public Double getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(Double bacLuong) {
        this.bacLuong = bacLuong;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
}
