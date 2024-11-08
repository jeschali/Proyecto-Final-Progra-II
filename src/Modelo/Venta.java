
package Modelo;

public class Venta {
    private int id;
    private String nombreProducto;
    private double total;    
    
    public Venta(){
    }

    public Venta(int id, String nombreProducto, double total) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
