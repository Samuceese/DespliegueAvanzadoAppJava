package org.example.models;

public class Calculadora {

    /**
     * Suma los valores y da un resultado
     * @author Samuel Cortes Sanchez
     * @param num1 Primer valor de la operacion
     * @param num2 Segundo valor de la operacion
     * @return El resultado de la operacion
     * */
    public static int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    /**
     * Resta los valores y da un resultado
     * @author Samuel Cortes Sanchez
     * @param num1 Primer valor de la operacion
     * @param num2 Segundo valor de la operacion
     * @return El resultado de la operacion
     * */
    public static int restar(int num1, int num2) {
        return (num1 - num2);
    }

    /**
     * Multiplica los valores y da un resultado
     * @author Samuel Cortes Sanchez
     * @param num1 Primer valor de la operacion
     * @param num2 Segundo valor de la operacion
     * @return El resultado de la operacion
     * */
    public static int multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    /**
     * Divide los valores y da un resultado
     * @author Samuel Cortes Sanchez
     * @param num1 Primer valor de la operacion
     * @param num2 Segundo valor de la operacion
     * @return El resultado de la operacion
     * */
    public static int dividir(int num1, int num2) {
        return (num1 / num2);
    }
}
