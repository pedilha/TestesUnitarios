package br.com.aula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraIMCTest {

    private CalculadoraIMC calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new CalculadoraIMC();
    }

    @Test
    public void testClassificacaoIMC() {
        assertEquals("Abaixo do peso", calculadora.classificar(17.5));
        assertEquals("Normal", calculadora.classificar(22.0));
        assertEquals("Sobrepeso", calculadora.classificar(28.1));
        assertEquals("Obesidade", calculadora.classificar(35.5));
    }

    @Test
    public void testCalculoIMC() {
        assertEquals(22.86, calculadora.calcular(70, 1.75));
        assertEquals(31.25, calculadora.calcular(80, 1.60));
    }

    @Test
    public void testAlturaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(70, 0);
        });
    }
}