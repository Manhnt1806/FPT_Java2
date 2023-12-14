/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import java.util.List;

/**
 *
 * @author PC
 */
public interface IserviceCRUD<T> {
    public String add(T st);
    public String edit(T st);
    public String delete(T st);
    
    public List<T> getList();
}
