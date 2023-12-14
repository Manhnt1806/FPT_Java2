/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manhnt_ph29583;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Manhnt_PH29583 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manhnt_PH29583 a = new Manhnt_PH29583();
        a.menu();
    }
    ArrayList<SinhVien> listNV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void menu() {
        int luaChon = 0;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("| 1. Nhập danh sách sinh viên từ bàn phím.                 |");
            System.out.println("| 2. Xuất danh sách sinh viên ra màn hình.                 |");
            System.out.println("| 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.   |");  
            System.out.println("| 4. Sắp xếp nhân viên theo chuyên ngành.                  |");
            System.out.println("| 0. Thoát                                                 |");
            System.out.println("-----------------------------------------------------------");
            System.out.println(">>CHỌN CHỨC NĂNG<<");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập vào mã sinh viên: ");
                    String maSV = sc.nextLine();
                    System.out.println("Nhập vào họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.println("Nhập vào chuyên ngành: ");
                    String chuyenNganh = sc.nextLine();
                    SinhVien sv1 = new SinhVien(maSV, hoTen, chuyenNganh);
                    QLSV.themSV(sv1);
                    break;
                case 2:
                    QLSV.xuatSV();
                    break;
                case 3: 
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
                    break;
            }
        } while (luaChon >= 0 && luaChon < 10);    
    }
}
