package main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Gomez
 */
public class ConversorAlura {

    public static void main(String[] args) {

        programa();

    }

    public static void programa() {

        String opcion1 = elegirOpcion1();

        if (opcion1 == "Divisas") {

            funcionDivisas();

        } else if (opcion1 == "Longitud") {

            funcionLongitud();

        } else if (opcion1 == "Temperatura") {

            funcionTemperatura();

        }

    }

    public static String elegirOpcion1() {

        return JOptionPane.showInputDialog(null, "Seleccione una opcion", "Conversor Alura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Divisas", "Longitud", "Temperatura"},
                "Divisas").toString();

    }

    public static String elegirOpcionDivisas() {

        return JOptionPane.showInputDialog(null, "Seleccione un tipo de conversion", "Convertir Divisas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Peso Argentino a Dolar", "Peso Argentino a Euros",
                    "Peso Argentino a Libras Esterlinas", "Peso Argentino a Yen Japones", "Peso Argentino a Won sur-coreano",
                    "Dolar a Peso Argentino", "Euro a Peso Argentino", "Libras Esterlinas a Peso Argentino", "Yen Japones a Peso Argentino", "Won sur-coreano a Peso Argentino"},
                "Peso Argentino a Dolar").toString();

    }

    public static String elegirOpcionDistancia() {
        return JOptionPane.showInputDialog(null, "Seleccione un tipo de conversion", "Convertir Longitud",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Kilometros a Millas", "Kilometros a Metros",
                    "Millas a Kilometros", "Millas a Metros", "Metros a Kilometros", "Metros a Millas"},
                "Kilometros a Millas").toString();

    }

    public static String elegirOpcionTemperatura() {
        return JOptionPane.showInputDialog(null, "Seleccione un tipo de conversion", "Convertir Temperatuta",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Grados Celsius a Fahrenheit", "Grados Celsius a Kelvin",
                    "Grados Fahrenheit a Celsius", "Grados Fahrenheit a Kelvin", "Grados Kelvin a Celsius", "Grados Kelvin a Fahrenheit"},
                "Grados Celsius a Fahrenheit").toString();

    }

    public static String ingresarValor(String tipo) {

        String resultado = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir", "Convetir " + tipo, JOptionPane.PLAIN_MESSAGE);

        return resultado;
    }

    public static void errorConversion() {

        JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, intente nuevamente!", "Error de conversion", JOptionPane.ERROR_MESSAGE);
    }

    public static void convertirDivisas(double valor, String divisa) {

        if (divisa == "Peso Argentino a Dolar") {
            double temp = valor * 0.0050;
            salidaResultado(valor, temp, "Pesos", "Dolares");
        } else if (divisa == "Peso Argentino a Euros") {
            double temp = valor * 0.0047;
            salidaResultado(valor, temp, "Pesos", "Euros");
        } else if (divisa == "Peso Argentino a Libras Esterlinas") {
            double temp = valor * 0.0041;
            salidaResultado(valor, temp, "Pesos", "Libras Esterlinas");
        } else if (divisa == "Peso Argentino a Yen Japones") {
            double temp = valor * 0.67;
            salidaResultado(valor, temp, "Pesos", "Yen Japones");
        } else if (divisa == "Peso Argentino a Won sur-coreano") {
            double temp = valor * 6.55;
            salidaResultado(valor, temp, "Pesos", "Won sur-coreano");
        } else if (divisa == "Dolar a Peso Argentino") {
            double temp = valor * 200.73;
            salidaResultado(valor, temp, "Dolar", "Pesos");
        } else if (divisa == "Euro a Peso Argentino") {
            double temp = valor * 214.12;
            salidaResultado(valor, temp, "Euros", "Pesos");
        } else if (divisa == "Libras Esterlinas a Peso Argentino") {
            double temp = valor * 242.29;
            salidaResultado(valor, temp, "Libras Esterlinas", "Pesos");
        } else if (divisa == "Yen Japones a Peso Argentino") {
            double temp = valor * 1.49;
            salidaResultado(valor, temp, "Yen Japones", "Pesos");
        } else if (divisa == "Won sur-coreano a Peso Argentino") {
            double temp = valor * 0.15;
            salidaResultado(valor, temp, "Won sur-coreano", "Pesos");
        }

    }

    public static void convertirDistancia(double valor, String distancia) {

        if (distancia == "Kilometros a Millas") {
            double temp = valor * 0.621371;
            salidaResultado(valor, temp, "Kilometros", "Millas");
        } else if (distancia == "Kilometros a Metros") {
            double temp = valor * 1000;
            salidaResultado(valor, temp, "Kilometros", "Metros");
        } else if (distancia == "Millas a Kilometros") {
            double temp = valor * 1.60934;
            salidaResultado(valor, temp, "Millas", "Kilometros");
        } else if (distancia == "Millas a Metros") {
            double temp = valor * 1609.34;
            salidaResultado(valor, temp, "Millas", "Metros");
        } else if (distancia == "Metros a Kilometros") {
            double temp = valor * 0.001;
            salidaResultado(valor, temp, "Metros", "Kilometros");
        } else if (distancia == "Metros a Millas") {
            double temp = valor * 0.000621371;
            salidaResultado(valor, temp, "Metros", "Millas");
        }

    }

    public static void convertirTemperatura(double valor, String temperatura) {

        if (temperatura == "Grados Celsius a Fahrenheit") {
            double temp = valor * 9 / 5 + 32;
            salidaResultado(valor, temp, "Celsius", "Fahrenheit");
        } else if (temperatura == "Grados Celsius a Kelvin") {
            double temp = valor + 273.15;
            salidaResultado(valor, temp, "Celsius", "Kelvin");
        } else if (temperatura == "Grados Fahrenheit a Celsius") {
            double temp = (valor - 32) * 5 / 9;
            salidaResultado(valor, temp, "Fahrenheit", "Celsius");
        } else if (temperatura == "Grados Fahrenheit a Kelvin") {
            double temp = (valor - 32) * 5 / 9 + 273.15;
            salidaResultado(valor, temp, "Fahrenheit", "Kelvin");
        } else if (temperatura == "Grados Kelvin a Celsius") {
            double temp = valor - 272.15;
            salidaResultado(valor, temp, "Kelvin", "Celsius");
        } else if (temperatura == "Grados Kelvin a Fahrenheit") {
            double temp = (valor - 273.15) * 9 / 5 + 32;
            salidaResultado(valor, temp, "Kelvin", "Fahrenheit");
        }

    }

    public static void salidaResultado(double cantidad, double resultado, String aConvertir, String convertida) {

        DecimalFormat df = new DecimalFormat("#.###");

        JOptionPane.showMessageDialog(null, "La cantidad de " + cantidad + " " + aConvertir + " son " + df.format(resultado) + " " + convertida, "Se ha convertido con exito!", JOptionPane.PLAIN_MESSAGE);
    }

    public static int continuar() {

        int resultado = JOptionPane.showConfirmDialog(null, "Desea continuar?");
        return resultado;
    }

    public static void cuadroFinal() {

        JOptionPane.showMessageDialog(null, "Programa Finalizado! Gracias por utilizar nuestro conversor de unidades. Proyecto creado por Andres Gomez, para la formacion de Alura Latam");
    }

    public static void funcionDivisas() {

        String opcionesDeDivisas = elegirOpcionDivisas();
        String valorIngresado = ingresarValor(opcionesDeDivisas);

        try {
            double valorNumerico = Double.parseDouble(valorIngresado);
        } catch (Exception e) {
            errorConversion();
            funcionDivisas();

        }

        double valorNumerico = Double.parseDouble(valorIngresado);
        convertirDivisas(valorNumerico, opcionesDeDivisas);

        int cuadroFinal = continuar();

        if (cuadroFinal == 0) {
            programa();
        } else {
            cuadroFinal();
        }
    }

    public static void funcionLongitud() {

        String opcionesDeDistancia = elegirOpcionDistancia();
        String valorIngresado = ingresarValor(opcionesDeDistancia);

        try {
            double valorNumerico = Double.parseDouble(valorIngresado);
        } catch (Exception e) {
            errorConversion();
            funcionLongitud();
        }

        double valorNumerico = Double.parseDouble(valorIngresado);
        convertirDistancia(valorNumerico, opcionesDeDistancia);

        int cuadroFinal = continuar();

        if (cuadroFinal == 0) {
            programa();
        } else {
            cuadroFinal();
        }

    }

    public static void funcionTemperatura() {

        String opcionesDeTemperatura = elegirOpcionTemperatura();
        String valorIngresado = ingresarValor(opcionesDeTemperatura);

        try {
            double valorNumerico = Double.parseDouble(valorIngresado);
        } catch (Exception e) {
            errorConversion();
            funcionTemperatura();
        }

        double valorNumerico = Double.parseDouble(valorIngresado);
        convertirTemperatura(valorNumerico, opcionesDeTemperatura);

        int cuadroFinal = continuar();

        if (cuadroFinal == 0) {
            programa();
        } else {
            cuadroFinal();
        }

    }
}
