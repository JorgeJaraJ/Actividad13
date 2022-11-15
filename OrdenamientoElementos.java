/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jorgejarajuarez
 */
public class OrdenamientoElementos {
    
    public static void main(String[] args) {
        
        List<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador(1001, "Guillermo Ochoa", 1));
        jugadores.add(new Jugador(1002, "Carlos Vela", 2));
        jugadores.add(new Jugador(1003, "Javier Hernández", 3));
        jugadores.add(new Jugador(1004, "Hirving Lozano", 4));
        jugadores.add(new Jugador(1005, "Hector Herrera", 5));
        jugadores.add(new Jugador(1006, "Andrés Guardado", 6));
        jugadores.add(new Jugador(1007, "Raúl Jiménez", 7));
        jugadores.add(new Jugador(1008, "Henry Martín", 8));
        jugadores.add(new Jugador(1009, "Pol Granch", 9));
        jugadores.add(new Jugador(1010, "Alexis Vega", 10));
        
        jugadores.forEach(j -> System.out.println(j.getNombre()));
        
        System.out.println();
        
        Collections.sort(jugadores, (j1, j2) -> j1.getNombre().compareTo(j2.getNombre()));
        jugadores.forEach(j -> System.out.println(j.getNombre()));
        
        System.out.println();
        
        Collections.sort(jugadores, (j1, j2) -> new Integer(j1.getPosicion()).compareTo(new Integer(j2.getPosicion())));
        jugadores.forEach(j -> System.out.println(j.getNombre()));
    }

}

class Jugador {
    private int id;
    private String nombre;
    private int posicion;

    public Jugador() {
    }

    public Jugador(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Jugador(int id, String nombre, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
