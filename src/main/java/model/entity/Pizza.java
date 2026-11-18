package model.entity;

public class Pizza {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;

    public Pizza(int id, String nombre, String descripcion, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }
}
