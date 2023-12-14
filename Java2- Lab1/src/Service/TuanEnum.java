/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author PC
 */
enum NgayTrongTuan{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class TuanEnum {
    public static void main(String[] args) {
        for(NgayTrongTuan x:NgayTrongTuan.values()){
            System.out.println(x);
        }
        NgayTrongTuan homnay = NgayTrongTuan.THURSDAY;
        System.out.println(homnay);
        //So sanh trong enum
        if(homnay.equals(NgayTrongTuan.SUNDAY)){
            System.out.println("Hôm nay được nghỉ học");
        }else{
            System.out.println("HÔM NAY LÀ " +homnay);
        }
    }
}
