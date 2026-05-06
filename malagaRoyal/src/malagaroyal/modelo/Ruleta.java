/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.modelo;

/**
 *
 * @author UIS
 */
public class Ruleta {
    private double monto;

    public Ruleta(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Ruleta{" + "monto=" + monto + '}';
    }
    
    
}
