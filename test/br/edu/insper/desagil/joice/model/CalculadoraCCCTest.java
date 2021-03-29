package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private static double DELTA = 0.05;
	
	private CalculadoraCCC calculadora;
	
	@BeforeEach
	public void setUp() {
		 calculadora = new CalculadoraCCC();
	}
	
	@Test
	public void testeNiobio() {
		assertEquals(8.57, calculadora.calcula(92.91, 0.143), DELTA);
	}
	
	@Test
	public void testeTungstenio() {
		assertEquals(19.28, calculadora.calcula(183.84, 0.137), DELTA);
	}
	
	@Test
	public void testeLitio() {
		assertEquals(0.53, calculadora.calcula(6.94, 0.152), DELTA);
	}
}
