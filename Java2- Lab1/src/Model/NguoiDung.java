/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hi
 */
public class NguoiDung implements Comparable<NguoiDung>, Serializable{
    private String userName;
    private String email;
    private String password;
    private String vitri;
    private int quyen;//1: user 2: admin
    private boolean status;

    public NguoiDung(String userName, String email, String password, String vitri, int quyen, boolean status) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.vitri = vitri;
        this.quyen = quyen;
        this.status = status;
    }

    public NguoiDung() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NguoiDung other = (NguoiDung) obj;
        if (this.quyen != other.quyen) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.vitri, other.vitri)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(NguoiDung o) {
        return this.userName.compareTo(o.getUserName());
    }
    
    
}
