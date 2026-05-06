/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UIS
 */
public class UsuarioDAO {
    private static List<Usuario> listaUsuarios; 
    
    public boolean registrar (Usuario usu){
        try {
            listaUsuarios.add(usu);
            return true;
        } catch (Exception e) {
            System.out.println("error al guardar");
            return false;
        }
    }
    public List<Usuario> consultar(){
        return listaUsuarios;
    }
    public boolean eliminar(String no){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).getContraseña().equals(no)){
                listaUsuarios.remove(i);
                return false;
            }
            
    }
        return false;
}
    public boolean modificar(Usuario emodificar){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getContraseña().equals(emodificar.getContraseña())) {
                listaUsuarios.set(i, emodificar);
                return true;
            }
            
        }
        return false;
    }
    public Usuario buscar(String nombre) {
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombre().equals(nombre)){
                return usu;
            }
        }
        return null;
    }
}