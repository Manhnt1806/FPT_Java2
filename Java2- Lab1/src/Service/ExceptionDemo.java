/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author PC
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //Chia cho 0
        int number = 10;
        int zero = 0;
        try{
        System.out.println(number/zero);
        int number2 = Integer.parseInt("xyz");
        System.out.println(number2);
        }catch(ArithmeticException ex){
            System.out.println(number/2);
        }catch(NumberFormatException ex){
            System.out.println("Logic exception thu 2");
        }
        
        int number1 = Integer.parseInt("10");
        System.out.println(number1);
        try{
            int number2 = Integer.parseInt("xyz");
        System.out.println(number2);
        }catch(Exception ex){
            System.out.println("Lỗi rồi nè ahihi đồ ngu!");
        }finally{
            System.out.println("Watting for you Mono");
        }
        
    }   
}
