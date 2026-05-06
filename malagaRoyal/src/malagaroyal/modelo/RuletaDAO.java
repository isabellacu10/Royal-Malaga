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
public class RuletaDAO {
    private static List<Ruleta> listaruleta; 
    
    public boolean registrar (Ruleta rul){
        try {
            listaruleta.add(rul);
            return true;
        } catch (Exception e) {
            System.out.println("error al guardar");
            return false;
        }
    }
    public List<Ruleta> consultar(){
        return listaruleta;
    }
    public boolean eliminar(String no){
        for (int i = 0; i < listaruleta.size(); i++) {
            if(listaruleta.get(i).getMonto().equals(no)){
                listaruleta.remove(i);
                return false;
            }
            
    }
        return false;
}
    public boolean modificar(Usuario emodificar){
        for (int i = 0; i < listaruleta.size(); i++) {
            if (listaruleta.get(i).getMonto().equals(emodificar.getContraseña())) {
                listaruleta.set(i, emodificar);
                return true;
            }
            
        }
        return false;
    }
}
