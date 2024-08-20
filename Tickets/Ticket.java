/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author Student
 */
public class Ticket {
    private int numero;
    private tiposTickets tipostickets;

    public int getNumero() {
        return numero;
    }

    public tiposTickets getTipostickets() {
        return tipostickets;
    }

    public Ticket(int numero, tiposTickets tipostickets) {
        this.numero = numero;
        this.tipostickets = tipostickets;
    }
    
    
    
    
}
