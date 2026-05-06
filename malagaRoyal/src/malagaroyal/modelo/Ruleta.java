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
    private float monto;
    private int numero;
    private float saldo;
    private String mensaje;
    private int NumGanador;
    private Usuario jugador;

    public Ruleta(float monto, int numero, float saldo, String mensaje, int NumGanador, Usuario jugador) {
        this.monto = monto;
        this.numero = numero;
        this.saldo = saldo;
        this.mensaje = mensaje;
        this.NumGanador = NumGanador;
        this.jugador = jugador;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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
        return "Ruleta{" + "monto=" + monto + ", numero=" + numero + ", saldo=" + saldo + ", mensaje=" + mensaje + ", NumGanador=" + NumGanador + ", jugador=" + jugador + '}';
    }

    
}
