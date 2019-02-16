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
        String menu = "Expresiones regulares\n" +
                "0.salir\n" +
                "1.Validar risa\n" +
                "2.Validar si termina en 2 numeros repetidos\n" +
                "3.Validar un Entero\n" +
                "4.Validar un numero Real\n" +
                "5.Validar numero binario\n" +
                "6.Validar abbabb\n" +
                "7.Validar dirección\n" +
                "8.Validar formato de hora\n" +
                "9.Validar numero telefonico" +
                "";
        String cadena;
        int option = 0;
        do {
            option = obtenerNumeroPorEntrada("Menu", menu);
            switch (option) {
                case 1:
                    cadena = getCadena("Ingrese la cadena de risa", "Ingrese datos");
                    ExpresionesRegulares.validarRisa(cadena);
                    break;
                case 2:
                    cadena = getCadena("Ingrese la cadena con numeros duplicados al final", "Ingrese datos");
                    ExpresionesRegulares.validarNumerosDuplicadosAlFinal(cadena);
                    break;
                case 3:
                    cadena = getCadena("Ingrese un valor entero numerico", "Ingrese Datos");
                    ExpresionesRegulares.validarNumeroEntero(cadena);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción " + option + " no valida intente de nuevo", "Opción no valida", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (option != 0);
    }

    private static String getCadena(String mensaje, String titulo) {
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION);
    }

    public static int obtenerNumeroPorEntrada(String titulo, String mensaje) {
        do {
            String option = getCadena(mensaje, titulo);
            try {
                return Integer.parseInt(option);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero\n" + e.getMessage(), "Error", JOptionPane.ERROR);
            }
        } while (true);
    }
}
