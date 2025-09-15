package br.com.aula;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    private ConversorTemperatura conversor;

    @BeforeEach
    public void setUp() {
        conversor = new ConversorTemperatura();
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        Assert.assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.001);
        Assert.assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheitBordas() {
        Assert.assertEquals(-459.67, conversor.celsiusParaFahrenheit(-273.15), 0.001);
        Assert.assertEquals(14.0, conversor.celsiusParaFahrenheit(-10.0), 0.001);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        Assert.assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.001);
        Assert.assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), 0.001);
    }

    @Test
    public void testFahrenheitParaCelsiusBordas() {
        Assert.assertEquals(-273.15, conversor.fahrenheitParaCelsius(-459.67), 0.001);
        Assert.assertEquals(-20.0, conversor.fahrenheitParaCelsius(-4.0), 0.001);
    }
}
