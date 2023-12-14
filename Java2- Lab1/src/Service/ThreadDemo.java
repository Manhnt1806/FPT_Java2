/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ThreadDemo extends Thread {
    public void run(){
        for(int i = 0; i<50; i++){
        System.out.println(i+" ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
        
    }
    public static void main(String[]agrs){
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        ThreadDemo t2 = new ThreadDemo();
        t2.start();
    }
}
