/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab45.TraSua;

/**
 *
 * @author PC
 */
public class TraSua {
    private String mon;
    private Integer soLuong;
    private String toping;
    private String ghiChu;
    private int Toping;
    private boolean trangThai;

    public TraSua() {
    }

    public TraSua(String mon, Integer soLuong, String topping, String ghiChu, int Topping, boolean trangThai) {
        this.mon = mon;
        this.soLuong = soLuong;
        this.toping = topping;
        this.ghiChu = ghiChu;
        this.Toping = Topping;
        this.trangThai = trangThai;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public int getToping() {
        return Toping;
    }

    public void setTopping(int Topping) {
        this.Toping = Toping;
    }
    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

   

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
