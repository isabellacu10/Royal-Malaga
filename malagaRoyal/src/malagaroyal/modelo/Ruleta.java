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
    private int numero;
    private int NumGanador;
    private Usuario jugador;

    public Ruleta(float monto, int numero, float saldo, String mensaje, int NumGanador, Usuario jugador) {
        this.numero = numero;
        this.NumGanador = NumGanador;
        this.jugador = jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumGanador() {
        return NumGanador;
    }

    public void setNumGanador(int NumGanador) {
        this.NumGanador = NumGanador;
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Ruleta{" + ", numero=" + numero + ", saldo=" + ", NumGanador=" + NumGanador + ", jugador=" + jugador + '}';
    }

    
}
