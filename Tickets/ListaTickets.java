/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaTickets {
    private ArrayList<String> Lista;

    public ArrayList<String> getLista() {
        return Lista;
    }

    public ListaTickets(ArrayList<String> Lista) {
        this.Lista = Lista;
    }

    
    public ListaTickets() {
        Lista=new ArrayList<>();
                
    }
    
    public void agregarElemento(String Elemento){
        Lista.add(Elemento);
    }
    public boolean eliminarElemento(String Elemento){
     return Lista.remove(Elemento);
     
    }
    public void mostrarElementos() {
        for (String elemento : Lista) {
            System.out.println(elemento);
        }
    }
    
}
