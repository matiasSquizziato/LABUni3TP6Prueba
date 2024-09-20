/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labuni3tp6prueba;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class Producto {
    
      private String categoria;
    private String nombre;
    private int precio;

    // Constructor
    public Producto(String categoria, String nombre, int precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio; 
    }

    
    public static ArrayList<Producto> listaProductos = new ArrayList<>();

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "categoria=" + categoria + ", nombre=" + nombre + ", precio=" + precio + ", producto=";
    }
    
    
    

   

  
    //Cargo el array de categorias
   public static void cargarCategorias() {
    String[] categorias = {"Alimentos", "Bebidas", "Electrónica", "Ropa"};

    for (String categoria : categorias) {
        Producto producto = new Producto(categoria, "", 00);
        listaProductos.add(producto);
    }
}
    
    //Voy a sobre escribir el array con nuevos elementos
    public void cargarElementos(Producto nProducto){
        if (listaProductos.add(nProducto) == true ) {
            JOptionPane.showMessageDialog(null,"Producto: " + nProducto.getNombre() + " cargado");
            System.out.println("Producto: " + nProducto.getNombre()+ " cargado");
        } else {
            JOptionPane.showMessageDialog(null,"Producto ya existente");

        }
    }
    
    
    

    
}
