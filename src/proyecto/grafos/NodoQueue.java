/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grafos;

/**
 *
 * @author Admin
 */
public class NodoQueue {
    private Vertice element;
    private NodoQueue next;

    public NodoQueue(Vertice element) {
        this.element = element;
        this.next = null;
    }

    public Vertice getElement() {
        return element;
    }

    public void setElement(Vertice element) {
        this.element = element;
    }

    public NodoQueue getNext() {
        return next;
    }

    public void setNext(NodoQueue next) {
        this.next = next;
    }

}
