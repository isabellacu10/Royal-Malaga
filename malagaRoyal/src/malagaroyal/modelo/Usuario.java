/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.modelo;

import java.util.List;

/**
 *
 * @author UIS
 */
public class Usuario {
    
    private String contraseña;
    private String nombre;
    private String apellido;
    private String telefono;
    private List<Ruleta> saldo;

    public Usuario(String contraseña) {
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
    
    
}
