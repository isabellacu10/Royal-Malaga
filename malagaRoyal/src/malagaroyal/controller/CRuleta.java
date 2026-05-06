/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.controller;

import java.awt.event.ActionListener;
import malagaroyal.modelo.RuletaDAO;
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
        
        this.vista.getBTngirar().addActionListener((ActionListener) this);
        this.vista.getjButton1().addActionListener((ActionListener) this);
        this.vista.getjButton2().addActionListener((ActionListener) this);
        this.vista.getjButton3().addActionListener((ActionListener) this);
        this.vista.getjButton16().addActionListener((ActionListener) this);
        this.vista.getjButton17().addActionListener((ActionListener) this);
        this.vista.getjButton18().addActionListener((ActionListener) this);
        this.vista.getjButton19().addActionListener((ActionListener) this);
        this.vista.getjButton20().addActionListener((ActionListener) this);
        this.vista.getjButton21().addActionListener((ActionListener) this);
        this.vista.getjButton22().addActionListener((ActionListener) this);
        this.vista.getjButton23().addActionListener((ActionListener) this);
        this.vista.getjButton24().addActionListener((ActionListener) this);
        this.vista.getjButton25().addActionListener((ActionListener) this);
        this.vista.getjButton26().addActionListener((ActionListener) this);
        this.vista.getjButton1().addActionListener((ActionListener) this);
        this.vista.getjButton1().addActionListener((ActionListener) this);
        this.vista.getjButton1().addActionListener((ActionListener) this);
        this.vista.getjButton1().addActionListener((ActionListener) this);
        
        
        
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                
                
            }
}

    private void addActionListener(CRuleta aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // vambios de prueba
