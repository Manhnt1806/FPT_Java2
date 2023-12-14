/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author PC
 */
public class NguoiDung {
    private String useName; 
    private String email;
    private String password;

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NguoiDung(String useName, String email, String password) {
        this.useName = useName;
        this.email = email;
        this.password = password;
    }

    public NguoiDung() {
    }
    public void inThongTin(){
        System.out.println("Tên đăng nhập: "+this.useName);
        System.out.println("Email: "+this.email);
        System.out.println("Mật khẩu: "+this.password);
    };
}
