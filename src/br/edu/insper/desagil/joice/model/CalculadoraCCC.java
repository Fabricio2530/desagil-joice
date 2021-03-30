package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{

	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) {
		
		double numeroDeAtomos = 2;
		double pesoAtomico = peso;
		
		double raioCm = raio/Math.pow(10,7);
		double numeroAvogadro = 6.023 * Math.pow(10, 23);
		
		double volumeUnitario = Math.pow((4*raioCm)/Math.pow(3,0.5), 3);
		
		double densidade = (numeroDeAtomos*pesoAtomico)/(volumeUnitario*numeroAvogadro);
		
		return densidade;
	}


}
