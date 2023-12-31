package com.example.calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();

    @Test
    public void suma() {
        int esperado = 5;
        int resultado = calculadora.suma(2,3);
        assertEquals(esperado, resultado);
        System.out.println("Estoy adentro de la suma");
    }

    @Test
    public void resta() {
        int esperado = 4;
        int resultado = calculadora.resta(7,3);
        assertEquals(esperado, resultado);
        System.out.println("Estoy adentro de la resta");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12,calculadora.multiplicar(3,4));

        System.out.println("Estoy dentro de la mutiplicacion");
    }

    @Test
    void testDividir() {
        assertEquals(4,calculadora.dividir(12,3));

        System.out.println("Estoy dentro de la division");
    }

    @Test
    public void testDividirPorCero(){
        try{
            calculadora.dividir(5,0);
            System.out.println("Entre a dividir por cero");
            fail("Se esperaba una IllegalArgumentException");
        }catch (IllegalArgumentException e){
            System.out.println("Intenté dividir por cero");

        }
        System.out.println("Estoy en division por cero");

    }

    //----------------------------------------------------

    @BeforeEach
    public void beforeEach(){ System.out.println("beforeEach"); }

    @AfterEach
    public void afterEach(){ System.out.println("afterEach"); }

    @BeforeAll
    public static void beforeAll(){ System.out.println("beforeAll"); }

    @AfterAll
    public static void AfterAll(){ System.out.println("afterAll"); }

}