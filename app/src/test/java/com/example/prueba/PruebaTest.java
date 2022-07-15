package com.example.prueba;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.Calendar;

public class PruebaTest {

    @Test
    public void isEmptyEditText_ReturnsTrue() {


        assertTrue(Prueba.validateEmpty(""));
    }

    @Test
    public void isEmptyEditText_ReturnsFalse() {


        assertFalse(Prueba.validateEmpty("dats"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnsFalse() {

        assertFalse(Prueba.validateEmail("pilliguabygregmail.com"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnTrue() {

        assertTrue(Prueba.validateEmail("pilliguabygre@gmail.com"));
    }

    @Test
    public void isUserinBD_ReturnTrue() {

        assertTrue(Prueba.validateUser("pilliguabygre@gmail.com","241998"));
    }

    @Test
    public void isUserinBD_ReturnFalse() {

        assertFalse(Prueba.validateUser("piligua@gmail.com","241998"));
    }

}