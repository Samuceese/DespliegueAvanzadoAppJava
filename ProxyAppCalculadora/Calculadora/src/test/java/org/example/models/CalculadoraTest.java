package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        int resultado = Calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void restar() {
        int resultado = Calculadora.restar(5,2);
        assertEquals(3, resultado);
    }

    @Test
    void multiplicar() {
        int resultado = Calculadora.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void dividir() {
        int resultado = Calculadora.dividir(10,2);
        assertEquals(5, resultado);
    }

    @Test
    void divisionPorCero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10,0));
    }
}