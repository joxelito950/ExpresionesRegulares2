/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;

import static expresionesregulares.ExpresionesRegulares.cortar;

import javax.swing.JOptionPane;

/**
 * @author sala203
 */
public class Menu {

    public static void main(String[] args) {
        String menu = "Expresiones regulares\n0.salir\n1.Validar risa\n2.Validar si termina en 2 numeros repetidos\n3.Validar un numero Real\n";
        String cadena;
        int option = obtenerNumeroPorEntrada("", "");
        do {
            switch (option) {
                case 1:
                    cadena = JOptionPane.showInputDialog(null, "Ingrese la cadena de risa", "Ingrese datos", JOptionPane.DEFAULT_OPTION);
                    ExpresionesRegulares.validarRisa(cadena);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción " + option + " no valida intente de nuevo", "Opción no valida", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (option != 0);
    }

    public static int obtenerNumeroPorEntrada(String titulo, String mensaje) {
        do {
            String option = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION);
            try {
                return Integer.parseInt(option);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero\n" + e.getMessage(), "Error", JOptionPane.ERROR);
            }
        } while (true);
    }
}
