/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import malagaroyal.modelo.Usuario;
import malagaroyal.modelo.UsuarioDAO;
import malagaroyal.view.ScreenManager;
import malagaroyal.view.VMenu;

/**
 *
 * @author asus
 */
public class CMenu implements ActionListener{
    private VMenu vista;
    private UsuarioDAO dao;
        public CMenu (VMenu vista){
            this.vista.getBtningresar().addActionListener(this);
            this.vista.getBtnsalir().addActionListener(this);
            
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    ScreenManager.cerrarMenu(CMenu.this);
                }
            
        });
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.getBtningresar()){
            String con = vista.getTXTnombre().getText();
            Usuario usu = dao.buscar(con);
            if(usu != null){
                ScreenManager.abrirRuleta();
            }else{
                ScreenManager.abrirUsuario();
            }
            
        }else if(e.getSource() == vista.getBtnsalir()){
            System.exit(0);
        }
            }
    public void finalizar(){
        this.vista.dispose();
        this.vista=null;
        System.out.println("controlador y referencias liberadas");
    }
}
