package pene;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrián
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garage objeto = new Garage();
        objeto.comprobarSitio();
        objeto.calcularPrecioTarifa();
        objeto.ingresaDinero();
        objeto.dineroDevolver();

        JOptionPane.showMessageDialog(null, objeto.toString());

    }

}
