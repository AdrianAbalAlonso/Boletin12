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
public class Garage {

    private int tiempo;
    private float precio;
    private float dineroPagado;
    private float dineroDevuelto;
    private String matricula;
    private static int plazasDisponibles = 0;

    public String getMatricula() {
        return matricula;
    }

    public void comprobarSitio() {
        if (plazasDisponibles < 5) {
            matricula = JOptionPane.showInputDialog("Hay plazas , asique introduce tu matricula");
            plazasDisponibles++;
        } else {
            JOptionPane.showMessageDialog(null, "Garage completo");
        }
    }

    public void calcularPrecioTarifa() {

        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tiempo que has estado"));
        if (tiempo <= 3) {
            JOptionPane.showMessageDialog(null, "Has estado 3 horas asique debes pagar 1.5 euros");
        } else {
            precio = (float) (1.5f + (tiempo - 3) * 0.2f);
            JOptionPane.showMessageDialog(null, "Has estado mas de 3 horas , por tanto deberas pagar:" + precio + " euros");
        }
    }

    public void ingresaDinero() {
        dineroPagado = Float.parseFloat(JOptionPane.showInputDialog("ingresa dinero"));
    }

    public void dineroDevolver() {

        dineroDevuelto = Math.abs(dineroPagado - precio);
        JOptionPane.showMessageDialog(null, "Te devuelve " + dineroDevuelto + "€");
    }

    @Override
    public String toString() {
        return "garage{" + "tiempo=" + tiempo + " horas" + ", precio=" + precio + "€" + ", dineroPagado=" + dineroPagado + "€" +", dineroDevuelto=" + dineroDevuelto + ", matricula=" + matricula + '}';
    }
}
