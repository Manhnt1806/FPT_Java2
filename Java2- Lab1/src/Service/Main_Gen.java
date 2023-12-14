/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;



/**
 *
 * @author PC
 */
public class Main_Gen  {
    public static void main(String[] args) {
        Book b1 = new Book("Study", "Hoc");
        Book b2 = new Book("Pass", "Dat");
        String english = b1.getKey();
        String vietnamese = b1.getValue();
        System.out.println(english+": "+vietnamese);
        
    }
}
class Book extends Dictionary<String, String>{

    public Book() {
    }

    public Book(String key, String value) {
        super(key, value);
    }
    
}