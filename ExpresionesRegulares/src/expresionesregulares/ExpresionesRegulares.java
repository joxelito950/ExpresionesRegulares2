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
 * @author sala203
 */
public class ExpresionesRegulares {

    public static final String EXITO = "Exito";
    public static final String FAIL = "FAIL";

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

    public static void validarRisa(String cadena) {
        Pattern patron = Pattern.compile("^([Jj][AaEeOoIiUu])+");
        Matcher match = patron.matcher(cadena);
        if (match.find()) {
            mostrarMensajeExito(cadena, "es una risa", EXITO, JOptionPane.DEFAULT_OPTION);
        } else {
            mostrarMensajeExito(cadena, "no es una risa", FAIL, JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarMensajeExito(String cadena, String mensaje, String exito, int defaultOption) {
        JOptionPane.showMessageDialog(null, cadena + " " + mensaje, exito, defaultOption);
    }

    public static void validarNumerosDuplicadosAlFinal(String cadena) {
        Pattern patron = Pattern.compile("([00]|[11]|[22]|[33]|[44]|[55]|[66]|[77]|[88]|[99])$");
        Matcher matcher = patron.matcher(cadena);
        if (matcher.find()) {
            mostrarMensajeExito(cadena, "la cadena finaliza con 2 numeros repeditos", EXITO, JOptionPane.DEFAULT_OPTION);
        } else {
            mostrarMensajeExito(cadena, "la cadena no finaliza con numeros repetidos", FAIL, JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void validarNumeroEntero(String cadena) {
        Pattern patron = Pattern.compile("^(\\d)*$");
        Matcher matcher = patron.matcher(cadena);
        if (matcher.find()) {
            mostrarMensajeExito(cadena, "la cadena es de enteros", EXITO, JOptionPane.DEFAULT_OPTION);
        }else{
            mostrarMensajeExito(cadena,"la cadena no es de numeros enteros", FAIL,JOptionPane.ERROR_MESSAGE);
        }
    }
}

