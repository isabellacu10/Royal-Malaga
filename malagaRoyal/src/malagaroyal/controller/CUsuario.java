/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import malagaroyal.modelo.Usuario;
import malagaroyal.modelo.UsuarioDAO;
import malagaroyal.view.VUsuario;

/**
 *
 * @author UIS
 */
public class CUsuario implements ActionListener{
    
    private VUsuario vista;
    private UsuarioDAO dao;

    public CUsuario(VUsuario vista, UsuarioDAO dao) {
        this.vista = vista;
        this.dao = dao;
        
        this.vista.getBtneliminar().addActionListener(this);
        this.vista.getBtnmodificar().addActionListener(this);
        this.vista.getBtnregistrar().addActionListener(this);
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                
                
            }
            
        });
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.getBtneliminar()){
            eliminar();
        }else if (e.getSource() == vista.getBtnmodificar()) {
            modificar();
        } else if (e.getSource() == vista.getBtnregistrar()) {
            registrar();
        } 
    }
    
    private void eliminar(){
        String con = vista.getPWFcontraseña().getText();
        if (dao.eliminar(con)) {
            JOptionPane.showMessageDialog(vista, "usuario eliminado");
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(vista, "no se encontro");
        }
    }
    private void modificar(){
        
       
    }
    private void registrar(){
        try {
            Usuario usu = capturarDatos();
            if(dao.registrar(usu)){
                JOptionPane.showMessageDialog(vista, "usuario guardado");
                
                limpiarCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "error al guardar"+e.getMessage());
        }
    }
    private Usuario capturarDatos(){
        return new Usuario(
        vista.getTxttelefono().getText());
    }
    private void limpiarCampos(){
        vista.getPWFcontraseña().setText("");
        vista.getTxtnombre().setText("");
        vista.getTxtapellido().setText("");
        vista.getTxttelefono().setText("");
        
        vista.getPWFcontraseña().requestFocus();
    }
    public void finalizar(){
        this.vista.dispose();
        this.vista= null;
        this.dao = null;
        
        System.out.println("controlador liberado");
                
    }
    }
    

