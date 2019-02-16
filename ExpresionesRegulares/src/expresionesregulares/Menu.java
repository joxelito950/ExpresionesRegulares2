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

    public static final String INGRESE_DATOS = "Ingrese Datos";

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
                "9.Validar numero telefonico\n" +
                "";
        String cadena;
        int option = 0;
        do {
            option = obtenerNumeroPorEntrada("Menu", menu);
            switch (option) {
                case 1:
                    cadena = getCadena("Ingrese la cadena de risa", INGRESE_DATOS);
                    ExpresionesRegulares.validarRisa(cadena);
                    break;
                case 2:
                    cadena = getCadena("Ingrese la cadena con numeros duplicados al final", INGRESE_DATOS);
                    ExpresionesRegulares.validarNumerosDuplicadosAlFinal(cadena);
                    break;
                case 3:
                    cadena = getCadena("Ingrese un valor entero numerico", INGRESE_DATOS);
                    ExpresionesRegulares.validarNumeroEntero(cadena);
                    break;
                case 4:
                    cadena = getCadena("Ingrese un valor numerico real", INGRESE_DATOS);
                    ExpresionesRegulares.validarNumeroReal(cadena);
                    break;
                case 5:
                    cadena = getCadena("Ingrese un número binario", INGRESE_DATOS);
                    ExpresionesRegulares.validarNumeroBinario(cadena);
                    break;
                case 6:
                    cadena = getCadena("Ingrese abbabb", INGRESE_DATOS);
                    ExpresionesRegulares.validarabbabb(cadena);
                    break;
                case 7:
                    cadena = getCadena("Ingrese dirección", INGRESE_DATOS);
                    ExpresionesRegulares.validarDireccion(cadena);
                    break;
                case 8:
                    cadena = getCadena("Ingrese una hora", INGRESE_DATOS);
                    ExpresionesRegulares.validarHora(cadena);
                    break;
                case 9:
                    cadena = getCadena("Ingrese un numero telefonico", INGRESE_DATOS);
                    ExpresionesRegulares.validarNumeroTelefonico(cadena);
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
                if ("null".equals(e.getMessage())) {
                    return 0;
                }
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero\n" + e.getMessage(), "Error", JOptionPane.ERROR);
            }
        } while (true);
    }
}
