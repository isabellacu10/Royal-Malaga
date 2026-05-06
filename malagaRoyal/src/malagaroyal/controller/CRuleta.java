/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.controller;

import java.awt.event.ActionListener;
import malagaroyal.modelo.RuletaDAO;
import malagaroyal.view.ScreenManager;
import malagaroyal.view.VRuleta;

/**
 *
 * @author UIS
 */
public class CRuleta {
    private VRuleta vista;
    private RuletaDAO dao;
    
    public CRuleta(VRuleta vista, RuletaDAO dao) {
        this.vista = vista;
        this.dao = dao;
        
        
        
        
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                ScreenManager.abrirRuleta();
                
            }
        });
    }
    public void finalizar() {
        this.vista.dispose();
        this.vista = null;
        this.dao = null;
        System.out.println("controlador liberado");
    }
}
                
