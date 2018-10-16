package tannt275.crazyarrange;


import org.junit.Test;

import tannt275.crazyarrange.utils.ConverterUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConverterUtilsTest {

    @Test
    public void testConverterFahrenheitToCelsius() {
        float actual = ConverterUtils.convertCelsiusToFahrenheit(100);
        float expected = 212;
        assertEquals("Conversion from fahrenheit to celsius failed", expected, actual, 0.0001);
        assertTrue(actual == expected);
    }

    @Test
    public void testConverterCelsiusToFahrenheit() {
        float actual = ConverterUtils.convertFahrenheitToCelsius(212);
        float expected = 100;
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.0001);
        assertTrue(actual == expected);
    }
}