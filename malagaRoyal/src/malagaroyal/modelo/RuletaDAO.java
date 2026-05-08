/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malagaroyal.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UIS
 */
public class RuletaDAO {
    private static List<Ruleta> ruletas = new ArrayList<>(); 
    
    public String NomJugador (String u) {
        for (int i = 0; i < ruletas.size(); i++) {
            if (ruletas.get(i).getJugador().getNombre().equals(u)) {
                return u;
            }
        }
        return null;
    }
    
    
    public String girar (Usuario usuario, int numAp, int monto) {
        // Validar saldo
        if (monto > usuario.getSaldo()) {

            return "Esta apuesta supera su saldo a apostar.";
        }

        // Número ganador
        int numeroGanador = (int) (Math.random() * 37);

        // Si gana
        float valor;
        if (numAp== numeroGanador) {

            float ganancia = monto * 35;
            
            usuario.setSaldo(ganancia);

            // usuario.agregarSaldo(ganancia);

            return "Número ganador: " + numeroGanador +
                   "\n¡Ganaste!" +
                   "\nSe sumó un total de 35 veces su apuesta a su saldo." +
                   "\nSaldo actual: $" + usuario.getSaldo();

        } else {

            usuario.setSaldo(monto);

            return "Número ganador: " + numeroGanador +
                   "\nPerdiste." +
                   "\nSe restó el valor de su apuesta a su saldo." +
                   "\nSaldo actual: $" + usuario.getSaldo();
        }
        
    }
}
