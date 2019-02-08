/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.*;


/**
 *
 * @author sala203
 */
public class ExpresionesRegulares {

    public static void compararCadenasabc(String cadena) {
        Pattern patron = Pattern.compile("^[aA]bc.*");
        Matcher buscar = patron.matcher(cadena);
        if (buscar.matches()) {
            JOptionPane.showMessageDialog(null, "La cadena " + cadena + " Si cumple", "Se encontro coincidencia \"^[aA]bc.*\"", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "La cadena " + cadena + " No cumple", "No se encontro coincidencia \"^[aA]bc.*\"", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void compararCadenas(String cadena) {
        Pattern patron = Pattern.compile("\\w{4}&&[^a]");
        Matcher buscar = patron.matcher(cadena);
        if (buscar.matches()) {
            JOptionPane.showMessageDialog(null, "La cadena " + cadena + " Si cumple", "Se encontro coincidencia \"[^aA]\\\\w{4}\"", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "La cadena " + cadena + " No cumple", "No se encontro coincidencia \"[^aA]\\\\w{4}\"", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void validarFecha(String fecha) {
        Pattern patron = Pattern.compile("^(0[1-9]|[1-2]\\d|3[0-1]){1}/(0[1-9]|1[0-2]){1}/\\d{4}");
        Matcher buscar = patron.matcher((fecha));
        if (buscar.matches()) {
            JOptionPane.showMessageDialog(null, "La cadena " + fecha + " Si cumple", "fecha correcta", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "La cadena " + fecha + " No cumple. ingrese en formato DD/MM/AAAA", "fecha incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void reemplazar(String cadena) {
        Pattern patron = Pattern.compile("a|b");
        Matcher buscar = patron.matcher(cadena);
        String salida = buscar.replaceAll("x");
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void cortar(String cadena) {
        Pattern patron = Pattern.compile("[0-9]+");
        String[] salida = patron.split(cadena);
        for (int k = 0; k < salida.length; k++) {
            System.out.println(salida[k]);
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void cortar1(String cadena) {
        Pattern patron = Pattern.compile("\\p{Punct}");
        String[] salida = patron.split(cadena);
        for (int k = 0; k < salida.length; k++) {
            System.out.println(salida[k]);
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
