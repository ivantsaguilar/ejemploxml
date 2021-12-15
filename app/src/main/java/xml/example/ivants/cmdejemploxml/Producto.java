package xml.example.ivants.cmdejemploxml;

import java.text.NumberFormat;

/**
 * Created by ivants on 28/01/17.
 */

public class Producto {

    private String nombre;
    private int cantidades;

    public Producto(){

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades){
        this.cantidades = cantidades;
    }

    public String toString(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nombre + "\n(" + nf.format(cantidades) + ")";
    }
}
