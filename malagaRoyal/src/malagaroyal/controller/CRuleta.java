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
        
        this.vista.getBTngirar().addActionListener(this);
        this.vista.getjButton1().addActionListener(this);
        this.vista.getjButton2().addActionListener(this);
        this.vista.getjButton3().addActionListener(this);
        this.vista.getjButton16().addActionListener(this);
        this.vista.getjButton17().addActionListener(this);
        this.vista.getjButton18().addActionListener(this);
        this.vista.getjButton19().addActionListener(this);
        this.vista.getjButton20().addActionListener(this);
        this.vista.getjButton21().addActionListener(this);
        this.vista.getjButton22().addActionListener(this);
        this.vista.getjButton23()).addActionListener(this);
        this.vista.getjButton24().addActionListener(this);
        this.vista.getjButton25().addActionListener(this);
        this.vista.getjButton26().addActionListener(this);
        this.vista.getjButton1().addActionListener(this);
        this.vista.getjButton1().addActionListener(this);
        this.vista.getjButton1().addActionListener(this);
        this.vista.getjButton1().addActionListener(this);
        
        
        
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                
                
            }
}
