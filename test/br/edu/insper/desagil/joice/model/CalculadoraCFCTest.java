package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	
	private static double DELTA = 0.05;
	
	private CalculadoraCFC calculadora;
	
	@BeforeEach
	public void setUp() {
		calculadora = new CalculadoraCFC();
	}
	
	@Test
	public void testeCobre() {
		assertEquals(8.89, calculadora.calcula(63.55, 0.128), DELTA);
	}
	
	@Test
	public void testeOuro() {
		assertEquals(19.36, calculadora.calcula(196.97, 0.144), DELTA);
	}
	
	@Test
	public void testePrata() {
		assertEquals(10.60, calculadora.calcula(107.87, 0.144), DELTA);
	}
	

}
