/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.view;

import malagaroyal.controller.CMenu;
import malagaroyal.controller.CRuleta;
import malagaroyal.controller.CUsuario;
import malagaroyal.modelo.RuletaDAO;
import malagaroyal.modelo.UsuarioDAO;

/**
 *
 * @author UIS
 */
public class ScreenManager {
    public static void abrirMenu(){
        VMenu vista =new VMenu();
        CMenu controlador = new CMenu(vista);
        vista.setVisible(true);
        vista.setTitle("menu principal");
    }
    public static void cerrarMenu(CMenu controlador) {
        if (controlador != null) {
            controlador.finalizar();
            controlador = null;
            System.out.println("cerrado");
        }
    }
    public static void abrirUsuario() {
        VUsuario vista = new VUsuario();
        UsuarioDAO dao = new UsuarioDAO();
        CUsuario controlador = new CUsuario(vista, dao);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("gestionar usuario");
        
    }
    public static void cerrarUsuario(CUsuario controlador) {
        if (controlador != null) {
            controlador.finalizar();
            controlador = null;
            System.out.println("cerrado");
        }
    }
    public static void abrirRuleta() {
        VRuleta vista = new VRuleta();
        RuletaDAO dao = new RuletaDAO();
        CRuleta controlador = new CRuleta(vista, dao);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("gestionar usuario");
        
    }
    public static void cerrarRuleta(CRuleta controlador) {
        if (controlador != null) {
            controlador.finalizar();
            controlador = null;
            System.out.println("cerrado");
        }
    }
}
