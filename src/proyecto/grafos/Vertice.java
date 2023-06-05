/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grafos;

/**
 *
 * @author Gabriel García
 */
public class Vertice {
    private int numVertice;
    private int id;
    private String username;

    public Vertice(int id, String username) {

        this.id = id;
        this.username = username;
    }

    public Integer getNumVertice() {
        return numVertice;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setNumVertice(Integer numVertice) {
        this.numVertice = numVertice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
